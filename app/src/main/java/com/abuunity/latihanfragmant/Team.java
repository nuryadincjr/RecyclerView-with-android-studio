package com.abuunity.latihanfragmant;

public class Team {
    private String nama;
    private String logo;

    public Team(String nama, String logo) {
        this.nama = nama;
        this.logo = logo;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
