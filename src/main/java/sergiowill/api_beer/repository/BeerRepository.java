package sergiowill.api_beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sergiowill.api_beer.model.Beer;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
