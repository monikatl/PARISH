package pl.baszczyk.ordo.data;

public enum Feast implements IDayType {
    BAPTISM_OF_THE_LORD("Chrzest Pański"),
    I_ORDINARY_TIME_SUNDAY("I Niedziela Zwykła"),
    II_ORDINARY_TIME_SUNDAY("II Niedziela Zwykła"),
    III_ORDINARY_TIME_SUNDAY("III Niedziela Zwykła"),
    IV_ORDINARY_TIME_SUNDAY("IV Niedziela Zwykła"),
    V_ORDINARY_TIME_SUNDAY("V Niedziela Zwykła"),
    VI_ORDINARY_TIME_SUNDAY("VI Niedziela Zwykła"),
    ASH_WEDNESDAY("Środa Popielcowa"),
    I_SUNDAY_OF_LENT("I Niedziela Wielkiego Postu"),
    II_SUNDAY_OF_LENT("II Niedziela Wielkiego Postu"),
    III_SUNDAY_OF_LENT("III Niedziela Wielkiego Postu"),
    IV_SUNDAY_OF_LENT("IV Niedziela Wielkiego Postu"),
    V_SUNDAY_OF_LENT("V Niedziela Wielkiego Postu"),
    PALM_SUNDAY("Niedziela Męki Pańskiej"),
    RESURRECTION_SUNDAY("Niedziela Zmartwychwstania Pańskiego"),
    EASTER_MONDAY("Poniedziałek Wielkanocny");

    String name;
    Feast(String name) {
        this.name = name;
    }
}
