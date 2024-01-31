package pl.baszczyk.ordo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.baszczyk.ordo.data.Day;

public interface DayRepository extends JpaRepository<Day, Long> {
}
