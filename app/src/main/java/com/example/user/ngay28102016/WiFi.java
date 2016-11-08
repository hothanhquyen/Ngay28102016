package com.example.user.ngay28102016;

/**
 * Created by User on 10/28/2016.
 */
public class WiFi {
    String SSID;
    int level;
    public double distance;
    public double x;
    public double y;
    public double z;

    WiFi() {
    }

    public WiFi(String SSID, int level) {
        this.SSID = SSID;
        this.level = level;
        ;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public WiFi(String SSID, double x, double y, double z) {
        this.SSID = SSID;
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "Wifi{" +
                "SSID='" + SSID + '\'' +
                ", level=" + level +
                ", distance=" + distance +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public String getSSID() {
        return SSID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }
}
