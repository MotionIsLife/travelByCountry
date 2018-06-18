package repository;

import org.springframework.data.repository.CrudRepository;
import vo.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
}
