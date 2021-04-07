package jsonparsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    private static  ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defualtObjectMapper = new ObjectMapper();

        return  defualtObjectMapper;
    }

    public static JsonNode parse(String src) throws IOException {

        return objectMapper.readTree(src);

    }
}
