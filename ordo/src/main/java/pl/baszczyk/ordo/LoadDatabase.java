package pl.baszczyk.ordo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.baszczyk.ordo.data.Day;
import pl.baszczyk.ordo.repositories.DayRepository;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(
            DayRepository dayRepository) {

        Day day = new Day();

        return args -> {
            log.info("Preloading " + dayRepository.save(day));

        };
    }

}
