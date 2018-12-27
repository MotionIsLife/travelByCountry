package ru.prikhodko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.prikhodko.vo.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findByCountryName(String countryName);
}
