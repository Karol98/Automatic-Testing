import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import jsonparsing.Json;
import jsonparsing.Person;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class JsonTest {

    @Test
    public void TestParsing() {
        String text = "";
        String jsonSource = "{ \"title\": \"Text for test\" }";
        try {
            JsonNode node = Json.parse(jsonSource);
            text = node.get("title").asText();
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
        Assert.assertEquals(text, "Text for test");
    }

    @Test
    public void WritingJsonFile() throws IOException {
        Gson gson = new Gson();
        gson.toJson("Test", new FileWriter("test2.json"));
        File fileTest = new File("test2.json");
        Assert.assertTrue(fileTest.exists());
    }

    @Test
    public void ReadingJsonFile() throws IOException {
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("test.json"));
        Person personObj = gson.fromJson(br,Person.class);
        Person personObj2 = new Person("John","Williams");
        Assert.assertEquals(personObj,personObj2);
    }
}