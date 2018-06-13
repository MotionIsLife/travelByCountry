package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.City;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/city", consumes = "application/json", produces = "application/json")
public class CityRest {

    @Autowired
    private City city;

    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public @ResponseBody City getCityById(@RequestBody Long id){
        return new City();
    }

    @PostMapping(value = "/hello2")
    public @ResponseBody City getHello2(@RequestParam(name = "id") Long id){
        return new City();
    }

    @RequestMapping(value = "/hello", method = GET)
    public String getHello() {
        return "hello";
    }
}
