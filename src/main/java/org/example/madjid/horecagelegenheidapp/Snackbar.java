package org.example.madjid.horecagelegenheidapp;

public class Snackbar extends HorecaGelegenheid{

    static int MAX_AANTAL_TAFELS = 2;
    static int MAX_AANTAL_PERSONEN_TOEGESTAAN = 5;

    public Snackbar() {
    }

    public Snackbar(int horecaId, String horecaNaam, String horecaAdres) {
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
        return "Snackbar{" +
                "horecaId=" + horecaId +
                ", horecaNaam='" + horecaNaam + '\'' +
                ", horecaAdres='" + horecaAdres + '\'' +
                '}';
    }
}
