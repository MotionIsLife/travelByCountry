package ru.prikhodko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.prikhodko.dao.CountryDAO;
import ru.prikhodko.repository.CountryRepository;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.Country;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
@SuppressWarnings("unused")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    @Transactional
    public Country save(Country country) {
        Country result = countryRepository.save(country);
        return result;
    }

    public void delete(Country country) {
        countryRepository.delete(country);
    }

    @Override
//    @Transactional(readOnly = true)
    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();
        for (Country country : countryRepository.findAll())
            countries.add(country);
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
