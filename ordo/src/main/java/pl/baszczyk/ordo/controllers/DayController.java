package pl.baszczyk.ordo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.baszczyk.ordo.data.Day;
import pl.baszczyk.ordo.services.DayService;

import java.util.List;

@RestController
public class DayController {
    @Autowired
    private DayService dayService;

    // ------------------ GET -----------------------------------------
    // Load all warehouses from database
    @GetMapping("/days/all")
    public ResponseEntity<List<Day>> getAll() {
        List<Day> warehouses = dayService.getAllDays();
        if (warehouses != null) {
            return new ResponseEntity<>(warehouses, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
