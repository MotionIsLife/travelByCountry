package ru.prikhodko.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.prikhodko.service.CityService;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.City;
import ru.prikhodko.vo.Country;

import java.util.List;

@Repository
@Transactional
public class CityDAO {

    @Autowired
    private CityService cityService;


    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<City> findAll() {
        return cityService.findAll();
    }

}
