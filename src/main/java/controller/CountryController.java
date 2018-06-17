package controller;

import org.springframework.web.bind.annotation.*;
import vo.Country;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
    @PostMapping
    public void addCountry(@RequestBody Country country){
        System.out.println("adding country " + country);
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
