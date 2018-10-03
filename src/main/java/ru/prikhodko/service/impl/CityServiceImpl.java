package ru.prikhodko.service.impl;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.prikhodko.repository.CityRepository;
import ru.prikhodko.service.CityService;
import ru.prikhodko.vo.City;
import ru.prikhodko.vo.Country;

import java.util.List;

/*@Transactional*/
@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public void save(City city) {
        repository.save(city);
    }

    @Override
    public void delete(City city) {
        repository.delete(city);
    }

    @Override
    public List<City> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public City findById(Long id) {
        return repository.findById(id).get();
    }
}
