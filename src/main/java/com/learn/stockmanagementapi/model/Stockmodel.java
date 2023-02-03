package com.learn.stockmanagementapi.model;

public class Stockmodel {
    private String Stock_id;
    private String Stock_name;
    private int Stock_Value;

    public String getStock_id() {
        return Stock_id;
    }

    public void setStock_id(String stock_id) {
        Stock_id = stock_id;
    }

    public String getStock_name() {
        return Stock_name;
    }

    public void setStock_name(String stock_name) {
        Stock_name = stock_name;
    }

    public int getStock_Value() {
        return Stock_Value;
    }

    public void setStock_Value(int stock_Value) {
        Stock_Value = stock_Value;
    }
}
