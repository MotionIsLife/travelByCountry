package ru.prikhodko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.prikhodko.repository.CityRepository;
import ru.prikhodko.service.CityService;
import ru.prikhodko.vo.City;

import java.util.List;

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
        return (List<City>) repository.findAll();
    }

    @Override
    public City findById(Long id) {
        return repository.findById(id).get();
    }
}