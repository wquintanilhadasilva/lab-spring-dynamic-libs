package com.example.lab.adapters;

import com.example.lab.commons.AdapterType;
import com.example.lab.commons.SystemAdapter;
import org.springframework.stereotype.Component;

@Component
public class TacoTruckAdapter implements SystemAdapter {

    @Override
    public AdapterType getType() {
        return AdapterType.Taco;
    }
}
