package com.example.listview.app;

/**
 * Created by jin on 4/5/2014.
 */
public class Info {
    String title;
    String company;
    public Info(String title,String company){
        this.title=title;
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }
}
