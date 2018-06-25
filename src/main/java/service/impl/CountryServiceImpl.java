package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CountryRepository;
import service.CountryService;
import vo.Country;

import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    public void save(Country country) {
        repository.save(country);
    }

    public void delete(Country country) {
        repository.delete(country);
    }

    public List<Country> findAll() {
        return (List<Country>) repository.findAll();
    }

    public Country findById(Long id) {
        return repository.findById(id).get();
    }
}
