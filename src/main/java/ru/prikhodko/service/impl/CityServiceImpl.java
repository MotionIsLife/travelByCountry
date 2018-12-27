package ru.prikhodko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.prikhodko.repository.CityRepository;
import ru.prikhodko.service.CityService;
import ru.prikhodko.vo.City;

import javax.transaction.Transactional;
import java.util.List;

@Service
//@Transactional
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

//    @Transactional
    @Override
    public List<City> findAll() {
        List<City> all = repository.findAll();
        return all;
    }

    @Override
    public City findById(Integer id) {
        return repository.findById(id).get();
    }
}
