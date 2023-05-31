package com.cookandroid.beans;

public class BeanData {
    private String beanTitle;
    private String beanEnv1;
    private String beanEnv2;
    private String category;
    private String beanTerm;
    private int beanImage;

    public BeanData(String beanTitle, String category, String beanTerm, String beanEnv1, String beanEnv2, int beanImage) {
        this.beanTitle = beanTitle;
        this.category = category;
        this.beanTerm = beanTerm;
        this.beanEnv1 = beanEnv1;
        this.beanEnv2 = beanEnv2;
        this.beanImage = beanImage;
    }

    public String getBeanTitle() {
        return beanTitle;
    }

    public String getCategory() {
        return category;
    }

    public String getBeanTerm() {
        return beanTerm;
    }

    public String getBeanEnv1() {
        return beanEnv1;
    }

    public String getBeanEnv2() {
        return beanEnv2;
    }

    public int getBeanImage() {
        return beanImage;
    }
}
