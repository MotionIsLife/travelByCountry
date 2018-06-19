package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CityRepository;
import service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository repository;
}
