package org.example.madjid.horecagelegenheidapp;

public class Bar extends HorecaGelegenheid{

    static int MAX_AANTAL_TAFELS = 8;
    static int MAX_AANTAL_PERSONEN_TOEGESTAAN = 15;

    public Bar() {
    }

    public Bar(int horecaId, String horecaNaam, String horecaAdres) {
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
        return "Bar{" +
                "horecaId=" + horecaId +
                ", horecaNaam='" + horecaNaam + '\'' +
                ", horecaAdres='" + horecaAdres + '\'' +
                '}';
    }
}
