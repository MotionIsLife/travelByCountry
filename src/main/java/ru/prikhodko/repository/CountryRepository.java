package ru.prikhodko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.vo.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByCountryName(String countryName);
}
