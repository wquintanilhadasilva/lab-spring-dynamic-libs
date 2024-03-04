package com.example.lab.app.factory;

import com.example.lab.commons.SystemAdapter;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SystemAdapterFactory {

    private final List<SystemAdapter> adapters;

    @PostConstruct
    void listAdapters() {

        log.info("\n\n-------SYSTEM ADAPTERS ------\n");
        for (SystemAdapter adapter: adapters) {
            log.info(STR."""
                \t
                 \t...Loaded Class:
                 \t\{adapter.getClass()}
                 \tof type: \{adapter.getType().toString()}
            """);
        }
        log.info("-----------------");

    }
}
