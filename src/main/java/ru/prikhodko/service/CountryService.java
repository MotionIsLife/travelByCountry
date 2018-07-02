package ru.prikhodko.service;

import ru.prikhodko.vo.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);
    void delete(Country country);
    List<Country> findAll();
    Country findById(Long id);
    Country findByCountryName(String countryName);
}
