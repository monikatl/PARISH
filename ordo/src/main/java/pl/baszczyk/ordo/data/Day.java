package pl.baszczyk.ordo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity(name = "day_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    LocalDate date = LocalDate.now();

    @Enumerated(EnumType.STRING)
    Period period = Period.ORDINARY;

    @Enumerated(EnumType.STRING)
    Colors color = Colors.GREEN;

    @Enumerated(EnumType.STRING)
    DayType dayType = DayType.FEAST;

    String name = Feast.III_ORDINARY_TIME_SUNDAY.name;

}
