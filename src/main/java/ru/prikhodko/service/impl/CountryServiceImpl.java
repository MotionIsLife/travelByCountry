package ru.prikhodko.service.impl;

import org.hibernate.collection.internal.PersistentBag;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import ru.prikhodko.repository.CountryRepository;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.City;
import ru.prikhodko.vo.Country;

import java.util.List;

@Service
@Transactional
@Repository
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    @Override
    public Country save(Country country) {
        Country result = countryRepository.save(country);
        return result;
    }

    public void delete(Country country) {
        countryRepository.delete(country);
    }

    @Override
    @Transactional
    public List<Country> getAll() {
        List<Country> countries = countryRepository.findAll();
        List<City> cities = countries.get(0).getCities();
//        Hibernate.initialize(cities);
        if (cities instanceof HibernateProxy) {
            LazyInitializer hibernateLazyInitializer = ((HibernateProxy) cities).getHibernateLazyInitializer();
        } if(cities instanceof PersistentBag) {
            ((PersistentBag) cities).forceInitialization();
        } else {
            System.out.println(cities.getClass());
        }
        return countries;
    }

    public Country findById(Integer id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country findByCountryName(String countryName) {
        return countryRepository.findByCountryName(countryName);
    }
}
