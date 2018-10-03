package ru.prikhodko.service;

import ru.prikhodko.vo.City;

import java.util.List;

public interface CityService {
    void save(City city);
    void delete(City id);
    List<City> findAll();
    City findById(Integer id);
}
