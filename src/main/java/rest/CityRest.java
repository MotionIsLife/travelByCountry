package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.City;


@RestController
@RequestMapping(value = "/city")
public class CityRest {

    @Autowired
    private City city;

    @RequestMapping(value = "/addCity", method = RequestMethod.POST)
    public @ResponseBody City addAlbum(@RequestBody City city){
        return city;
    }

    @PostMapping(value = "/addCityPost")
    public @ResponseBody City addAlbumPost(@RequestBody City city){
        return city;
    }
}
