/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hdiep.busmanagerment.Model;

/**
 *
 * @author diepm
 */
public class BusDetails {

    private int id;
    private String busNo;
    private String busSource;
    private String busDestination;
    private String departDate;
    private String price;
    private String seat;

    public BusDetails(int id, String busNo, String busSource, String busDestination,
            String departDate, String price, String seat) {
        this.busDestination = busDestination;
        this.busNo = busNo;
        this.busSource = busSource;
        this.id = id;
        this.price = price;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        this.busSource = busSource;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "BusDetails [id=" + id + ", busNo=" + busNo + ", busSource=" + busSource + ", busDestination="
                + busDestination + ", departDate=" + departDate + ", price=" + price + ", seat=" + seat + "]";
    }

}
