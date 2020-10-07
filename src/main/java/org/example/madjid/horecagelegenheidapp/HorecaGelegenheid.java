package org.example.madjid.horecagelegenheidapp;

public class HorecaGelegenheid {

    protected int horecaId;
    protected String horecaNaam;
    protected String horecaAdres;

    public HorecaGelegenheid() {
    }

    public HorecaGelegenheid(int horecaId, String horecaNaam, String horecaAdres) {
        this.horecaId = horecaId;
        this.horecaNaam = horecaNaam;
        this.horecaAdres = horecaAdres;
    }

    public int getHorecaId() {
        return horecaId;
    }

    public void setHorecaId(int horecaId) {
        this.horecaId = horecaId;
    }

    public String getHorecaNaam() {
        return horecaNaam;
    }

    public void setHorecaNaam(String horecaNaam) {
        this.horecaNaam = horecaNaam;
    }

    public String getHorecaAdres() {
        return horecaAdres;
    }

    public void setHorecaAdres(String horecaAdres) {
        this.horecaAdres = horecaAdres;
    }

    @Override
    public String toString() {
        return "HorecaGelegenheid{" +
                "horecaId=" + horecaId +
                ", horecaNaam='" + horecaNaam + '\'' +
                ", horecaAdres='" + horecaAdres + '\'' +
                '}';
    }
}
