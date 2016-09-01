package com.atguigu.mybatis.entities;

public class CountryLanguage extends CountryLanguageKey {
    private String isofficial;

    private Float percentage;

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}