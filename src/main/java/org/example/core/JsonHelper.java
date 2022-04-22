package org.example.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class JsonHelper {

    public static final String MSG_NOT_POSSIBLE_TO_READ_JSON = "Not possible to read json file";

    private JsonHelper() {
    }

    public static DocumentContext getJsonObject(final String filePath) {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            Reader fileReader = new InputStreamReader(inputStream);
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(fileReader);
            return JsonPath.parse(jsonObject);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(MSG_NOT_POSSIBLE_TO_READ_JSON);
        }
    }

}
