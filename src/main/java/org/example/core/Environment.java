package org.example.core;

import com.jayway.jsonpath.DocumentContext;

public final class Environment {

    private static final Environment INSTANCE = new Environment();

    private final DocumentContext jsonContext;

    private Environment() {
        jsonContext = JsonHelper.getJsonObject("config.json");
    }

    public static Environment getInstance() {
        return INSTANCE;
    }

    public String getValue(final String keyJsonPath) {
        return jsonContext.read(keyJsonPath);
    }

}
