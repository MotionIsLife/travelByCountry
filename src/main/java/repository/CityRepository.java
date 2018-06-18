package repository;

import org.springframework.data.repository.CrudRepository;
import vo.City;

public interface CityRepository extends CrudRepository<City, Long> {
}
