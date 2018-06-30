package ru.prikhodko.repository;

import org.springframework.data.repository.CrudRepository;
import ru.prikhodko.vo.City;

public interface CityRepository extends CrudRepository<City, Long> {
}
