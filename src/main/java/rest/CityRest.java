package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vo.City;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/city"/*, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE*/)
public class CityRest {

    @Autowired
    private City city;

    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public @ResponseBody City getCityById(@RequestBody Long id){
        return new City(id);
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public @ResponseBody City getHello2(@PathVariable Long id){
        return new City(id);
    }

    @RequestMapping(value = "/hello", method = GET)
    public String getHello() {
        return "hello";
    }

    @PostMapping(value = "/helloPost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public City getHelloPost(@RequestBody City city) {
        return city;
    }

    @RequestMapping(value = "/addCity", method = RequestMethod.POST)
    public @ResponseBody City addAlbum(@RequestBody City city){
        return city;
    }
}
