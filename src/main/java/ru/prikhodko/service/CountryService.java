package ru.prikhodko.service;

import ru.prikhodko.vo.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);
    void delete(Country country);
    List<Country> getAll();
    Country findById(Integer id);
    Country findByCountryName(String countryName);
}
