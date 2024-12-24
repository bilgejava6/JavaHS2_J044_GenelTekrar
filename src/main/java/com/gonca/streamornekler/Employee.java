package com.gonca.streamornekler;

public class Employee {
    private String ad;
    private int yas;
    private String unvan;
    private Long id;

    public Employee(String ad, int yas, String unvan, Long id) {
        this.ad = ad;
        this.yas = yas;
        this.unvan = unvan;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
