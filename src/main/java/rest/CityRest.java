package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vo.City;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CityRest {

    @RequestMapping(method = POST)
    public City getCity(@RequestParam(value = "id", required = true) Long id) {
        return new City();// FIXME: 12.06.18
    }
}
