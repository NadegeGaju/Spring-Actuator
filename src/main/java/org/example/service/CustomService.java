package org.example.service;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

    private final MeterRegistry meterRegistry;

    public CustomService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        meterRegistry.counter("custom.method.calls").increment();
    }

    public void someMethod() {
        meterRegistry.counter("custom.method.calls").increment();
    }
}
