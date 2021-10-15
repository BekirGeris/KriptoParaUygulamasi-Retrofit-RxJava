package com.begers.kriptoretrofit.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    private String cuuency;

    @SerializedName("price")
    private String price;

    public CryptoModel(String cuuency, String price) {
        this.cuuency = cuuency;
        this.price = price;
    }

    public String getCuuency() {
        return cuuency;
    }

    public void setCuuency(String cuuency) {
        this.cuuency = cuuency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
