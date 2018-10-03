package ru.prikhodko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.prikhodko.service.CityService;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.City;
import ru.prikhodko.vo.Country;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;


    @PostMapping
    public void addCity(@RequestBody City city){
        System.out.println("adding city " + city);
        Country country = countryService.findByCountryName(city.getCountry().getCountryName());
        if(city.getCountry() != null) {
            if(country != null) {
                city.setCountry(country);
            } else {
                country = countryService.save(new Country(city.getCountry().getCountryName()));
            }
        }
        city.setCountry(country);
        cityService.save(city);
    }

    @GetMapping
    public List<City> findAll() {
        System.out.println("find all");
        return cityService.findAll();
    }

    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public City getCity(@PathVariable(value = "id") Long id) {
/*        City city = cityService.findById(id);
        Country country = city.getCountry();*/
        City result = cityService.findById(id);
        return result;
        /*Method threw 'org.hibernate.LazyInitializationException' exception. Cannot evaluate ru.prikhodko.vo.Country_$$_jvst4d4_0.toString()*/
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCity(@PathVariable Long id) {
        System.out.println("deleted city with id: " + id);
    }

    @PutMapping
    public void updateCity(@RequestBody City city) {
        System.out.println("updating city " + city);
    }


}
