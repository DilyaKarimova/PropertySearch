package ru.itpark.domain;

import java.util.Arrays;

public class House {
    private String district;
    private String propertyType;
    private int bedrooms;
    private int price;

    public House(String district, String propertyType, int bedrooms, int price) {
        this.district = district;
        this.propertyType = propertyType;
        this.bedrooms = bedrooms;
        this.price = price;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "district='" + district + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", bedrooms=" + bedrooms +
                ", price=" + price +
                '}';
    }



}
