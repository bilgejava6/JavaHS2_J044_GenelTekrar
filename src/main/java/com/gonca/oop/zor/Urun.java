package com.gonca.oop.zor;

public class Urun {
    private String ad;
    private int agirik;
    private Long id;

    public Urun(String ad, int agirik, Long id) {
        this.ad = ad;
        this.agirik = agirik;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "ad='" + ad + '\'' +
                ", agirik=" + agirik +
                ", id=" + id +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getAgirik() {
        return agirik;
    }

    public void setAgirik(int agirik) {
        this.agirik = agirik;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
