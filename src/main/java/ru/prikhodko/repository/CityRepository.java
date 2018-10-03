package ru.prikhodko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.vo.City;

public interface CityRepository extends JpaRepository<City, Integer> {
}
