package com.example.lab.app.adapters;

import com.example.lab.commons.AdapterType;
import com.example.lab.commons.SystemAdapter;
import org.springframework.stereotype.Component;

@Component
public class DefaultAdapter implements SystemAdapter {
    @Override
    public AdapterType getType() {
        return AdapterType.NULL;
    }
}
