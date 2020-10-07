package org.example.madjid.horecagelegenheidapp;
import java.time.LocalTime;

public class Reservering {
    private int reserveringsnummer;
    private LocalTime van;
    private LocalTime tot;
    private String naamReservering;
    private Tafel tafel; //Als je array van maakt dan zorgt dat voor een meerdere relatie

    public Reservering(Tafel tafel) {
        this.tafel = tafel;
    }

    public Reservering(int reserveringsnummer, LocalTime van, LocalTime tot, String naamReservering, Tafel tafel) {
        this.reserveringsnummer = reserveringsnummer;
        this.van = van;
        this.tot = tot;
        this.naamReservering = naamReservering;
        this.tafel = tafel;
    }

    public int getReserveringsnummer() {
        return reserveringsnummer;
    }

    public void setReserveringsnummer(int reserveringsnummer) {
        this.reserveringsnummer = reserveringsnummer;
    }

    public LocalTime getVan() {
        return van;
    }

    public void setVan(LocalTime van) {
        this.van = van;
    }

    public LocalTime getTot() {
        return tot;
    }

    public void setTot(LocalTime tot) {
        this.tot = tot;
    }

    public String getNaamReservering() {
        return naamReservering;
    }

    public void setNaamReservering(String naamReservering) {
        this.naamReservering = naamReservering;
    }

    @Override
    public String toString() {
        return "Reservering{" +
                "reserveringsnummer=" + reserveringsnummer +
                ", van=" + van +
                ", tot=" + tot +
                ", naamReservering='" + naamReservering + '\'' +
                '}';
    }
}
