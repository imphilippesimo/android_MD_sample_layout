package com.philippe.android.anotherrecyclerview.model;

import java.io.Serializable;

public class SaleInfo implements Serializable {

    private String country;
    private String saleability;
    private boolean isEbook;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean ebook) {
        isEbook = ebook;
    }
}
