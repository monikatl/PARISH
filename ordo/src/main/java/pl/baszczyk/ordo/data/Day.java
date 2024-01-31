package pl.baszczyk.ordo.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    LocalDate date;

    @Enumerated(EnumType.STRING)
    Period period;

    @Enumerated(EnumType.STRING)
    Colors color;

    @Enumerated(EnumType.STRING)
    DayType dayType;

    String name;

}
