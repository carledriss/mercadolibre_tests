package org.example.core;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private final Map<String, String> context;

    public ScenarioContext() {
        context = new HashMap<>();
    }

    public void setContext(final String key, final String value) {
        context.put(key, value);
    }

    public String getValue(final String key) {
        return context.get(key);
    }

}
