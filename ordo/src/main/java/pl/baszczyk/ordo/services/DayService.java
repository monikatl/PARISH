package pl.baszczyk.ordo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.baszczyk.ordo.data.Day;
import pl.baszczyk.ordo.repositories.DayRepository;

import java.util.List;

@Service
public class DayService {
    @Autowired
    private DayRepository dayRepository;

    public List<Day> getAllDays() {
        return dayRepository.findAll();
    }
}
