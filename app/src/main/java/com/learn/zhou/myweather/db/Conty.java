package com.learn.zhou.myweather.db;

import org.litepal.crud.DataSupport;

//创建县的实体类及天气id

public class Conty extends DataSupport {
    private int id;
    private String contyName;
    private int contyCode;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContyCode() {
        return contyCode;
    }

    public void setContyCode(int contyCode) {
        this.contyCode = contyCode;
    }

    public String getContyName() {
        return contyName;
    }

    public void setContyName(String contyName) {
        this.contyName = contyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
