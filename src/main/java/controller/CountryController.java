package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CountryService;
import vo.Country;

import java.util.List;

@RestController
@RequestMapping(value = "/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public void addCountry(@RequestBody Country country){
        System.out.println("adding country " + country);
    }

    @GetMapping
    public @ResponseBody List<Country> getFindAll() {
        return countryService.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Country getCountry(@PathVariable Long id) {
        return new Country(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCountry(@PathVariable Long id) {
        System.out.println("deleted country with id: " + id);
    }

    @PutMapping
    public void updateCountry(@RequestBody Country country) {
        System.out.println("updating country " + country);
    }
}
