package Json;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadQuizFile {
    public ReadQuizFile() {
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("src/test/resources/data1.json"));
        JsonNode quizNode = rootNode.get("quiz");
        JsonNode sportNode = quizNode.get("sport");
        JsonNode q1Node = sportNode.get("q1");
        String questions = q1Node.get("question").asText();
        System.out.println("questions:" + questions);
    }

}
