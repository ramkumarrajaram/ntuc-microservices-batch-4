package com.ntuc.income.api;

import java.util.List;

public class PlaceOrderRequestDto {

    private List<Long> items;

    public List<Long> getItems() {
        return items;
    }

    public void setItems(List<Long> items) {
        this.items = items;
    }
}
