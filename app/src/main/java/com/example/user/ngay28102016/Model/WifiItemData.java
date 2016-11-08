package com.example.user.ngay28102016.Model;

/**
 * Created by User on 11/3/2016.
 */
public class WifiItemData {
    int id;
    String wifiName;
    double wifi_x;
    double wifi_y;
    double wifi_z;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public double getWifi_x() {
        return wifi_x;
    }

    public void setWifi_x(double wifi_x) {
        this.wifi_x = wifi_x;
    }

    public double getWifi_y() {
        return wifi_y;
    }

    public void setWifi_y(double wifi_y) {
        this.wifi_y = wifi_y;
    }

    public double getWifi_z() {
        return wifi_z;
    }

    public void setWifi_z(double wifi_z) {
        this.wifi_z = wifi_z;
    }

    public WifiItemData(int id, String wifiName, double wifi_x, double wifi_y, double wifi_z) {

        this.id = id;
        this.wifiName = wifiName;
        this.wifi_x = wifi_x;
        this.wifi_y = wifi_y;
        this.wifi_z = wifi_z;
    }
}
