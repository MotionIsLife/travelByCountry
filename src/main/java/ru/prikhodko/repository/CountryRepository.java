package ru.prikhodko.repository;

import org.springframework.data.repository.CrudRepository;
import ru.prikhodko.vo.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
}
