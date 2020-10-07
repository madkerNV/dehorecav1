package org.example.madjid.horecagelegenheidapp;

public class Tafel {
    private int tafelnummer;
    private int aantalPersonen;

    public Tafel() {
    }

    public Tafel(int tafelnummer, int aantalPersonen) {
        this.tafelnummer = tafelnummer;
        this.aantalPersonen = aantalPersonen;
    }

    public int getTafelnummer() {
        return tafelnummer;
    }

    public void setTafelnummer(int tafelnummer) {
        this.tafelnummer = tafelnummer;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    @Override
    public String toString() {
        return "Tafel{" +
                "tafelnummer=" + tafelnummer +
                ", aantalPersonen=" + aantalPersonen +
                '}';
    }
}
