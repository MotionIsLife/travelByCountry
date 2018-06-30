package ru.prikhodko.service;

import ru.prikhodko.vo.Country;

import java.util.List;

public interface CountryService {
    void save(Country country);
    void delete(Country country);
    List<Country> findAll();
    Country findById(Long id);
}
