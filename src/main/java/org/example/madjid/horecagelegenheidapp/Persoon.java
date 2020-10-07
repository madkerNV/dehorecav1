package org.example.madjid.horecagelegenheidapp;

public class Persoon {
    private int id;
    private String voornaam;
    private String achternaam;
    Reservering gemaakteReservering;

    public Persoon() {
    }

    public Persoon(int id, String voornaam, String achternaam, Reservering gemaakteReservering) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.gemaakteReservering = gemaakteReservering;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Reservering getGemaakteReservering() {
        return gemaakteReservering;
    }

    public void setGemaakteReservering(Reservering gemaakteReservering) {
        this.gemaakteReservering = gemaakteReservering;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", gemaakteReservering=" + gemaakteReservering +
                '}';
    }
}
