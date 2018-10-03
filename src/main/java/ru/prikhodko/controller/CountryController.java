package ru.prikhodko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.prikhodko.service.CityService;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.City;
import ru.prikhodko.vo.Country;

import java.util.List;

@RestController
@RequestMapping(value = "/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    //it's work
    @PostMapping
    public void addCountry(@RequestBody Country country){
        System.out.println("adding country " + country);
        Country result = countryService.save(country);
        System.out.println(result);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Country> getFindAll() {
        return countryService.getAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Country getCountry(@PathVariable Integer id) {
        return new Country();
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCountry(@PathVariable Integer id) {
        System.out.println("deleted country with id: " + id);
    }

    @PutMapping
    public void updateCountry(@RequestBody Country country) {
        System.out.println("updating country " + country);
    }
}
