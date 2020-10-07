package org.example.madjid.horecagelegenheidapp;

public class Pizzeria extends HorecaGelegenheid{

    static int MAX_AANTAL_TAFELS = 4;
    static int MAX_AANTAL_PERSONEN_TOEGESTAAN = 8;

    public Pizzeria() {
    }

    public Pizzeria(int horecaId, String horecaNaam, String horecaAdres) {
        super(horecaId, horecaNaam, horecaAdres);
    }

    public static int getMaxAantalTafels() {
        return MAX_AANTAL_TAFELS;
    }

    public static int getMaxAantalPersonenToegestaan() {
        return MAX_AANTAL_PERSONEN_TOEGESTAAN;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "horecaId=" + horecaId +
                ", horecaNaam='" + horecaNaam + '\'' +
                ", horecaAdres='" + horecaAdres + '\'' +
                '}';
    }
}
