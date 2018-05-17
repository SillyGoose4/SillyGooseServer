package com.SillyGoose.bean;

public class Goose {
    public Goose(){

    }
    public Goose(int userId,
                 int gooseDevil,
                 int gooseSnow,
                 int gooseEny,
                 int gooseMap,
                 int gooseRain,
                 int gooseSun,
                 int gooseWind,
                 int gooseStar){
        this.gooseDevil = gooseDevil;
        this.gooseEny = gooseEny;
        this.gooseMap = gooseMap;
        this.gooseRain = gooseRain;
        this.gooseSnow = gooseSnow;
        this.gooseStar = gooseStar;
        this.gooseWind = gooseWind;
        this.userId = userId;
        this.gooseSun = gooseSun;
    }
    private Integer userId;

    private Integer gooseEny;

    private Integer gooseMap;

    private Integer gooseSun;

    private Integer gooseSnow;

    private Integer gooseStar;

    private Integer gooseWind;

    private Integer gooseRain;

    private Integer gooseDevil;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGooseEny() {
        return gooseEny;
    }

    public void setGooseEny(Integer gooseEny) {
        this.gooseEny = gooseEny;
    }

    public Integer getGooseMap() {
        return gooseMap;
    }

    public void setGooseMap(Integer gooseMap) {
        this.gooseMap = gooseMap;
    }

    public Integer getGooseSun() {
        return gooseSun;
    }

    public void setGooseSun(Integer gooseSun) {
        this.gooseSun = gooseSun;
    }

    public Integer getGooseSnow() {
        return gooseSnow;
    }

    public void setGooseSnow(Integer gooseSnow) {
        this.gooseSnow = gooseSnow;
    }

    public Integer getGooseStar() {
        return gooseStar;
    }

    public void setGooseStar(Integer gooseStar) {
        this.gooseStar = gooseStar;
    }

    public Integer getGooseWind() {
        return gooseWind;
    }

    public void setGooseWind(Integer gooseWind) {
        this.gooseWind = gooseWind;
    }

    public Integer getGooseRain() {
        return gooseRain;
    }

    public void setGooseRain(Integer gooseRain) {
        this.gooseRain = gooseRain;
    }

    public Integer getGooseDevil() {
        return gooseDevil;
    }

    public void setGooseDevil(Integer gooseDevil) {
        this.gooseDevil = gooseDevil;
    }
}