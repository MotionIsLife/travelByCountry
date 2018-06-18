package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.CountryRepository;
import service.CountryService;

@Repository
@Service("countryService")
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository repository;
}
