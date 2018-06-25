package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CityService;
import vo.City;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping
    public void addCity(@RequestBody City city){
        System.out.println("adding city " + city);
    }

    @GetMapping
    public @ResponseBody List<City> findAll() {
        System.out.println("find all");
        return cityService.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody City getCity(@PathVariable Long id) {
        return new City(id);
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
