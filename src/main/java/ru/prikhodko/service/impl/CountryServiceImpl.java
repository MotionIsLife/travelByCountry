package ru.prikhodko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.prikhodko.repository.CountryRepository;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.Country;

import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    @Transactional // TODO: 03.07.18 проверить, нужна ли?
    public Country save(Country country) {
        Country result = repository.save(country);
        return result;
    }

    public void delete(Country country) {
        repository.delete(country);
    }

    public List<Country> findAll() {
        List<Country> countries = repository.findAll();
        return countries;
    }

    public Country findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Country findByCountryName(String countryName) {
        return repository.findByCountryName(countryName);
    }
}
