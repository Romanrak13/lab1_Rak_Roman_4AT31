package day_5;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import day_4.reflection.MyAnyCustomClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class serilizations {
    public static void main(String[] args) throws JSONException {
        //Make some complex models with few fields.
        // Make it serializable.
        // Read some json from “input.json” and deserialize it to POJO.
        // Then change a few fields and save it to “output.json”.
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("field1", "value1");
        System.out.println(jsonObject);

        //
        ObjectMapper objectMapper = new ObjectMapper();
        MyAnyCustomClass object = null;
        try {
            object = objectMapper.readValue(jsonObject.toString(), MyAnyCustomClass.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(object);

        //
        object.setField3(245);
        JSONObject jsonObject2 = new JSONObject(object);
        System.out.println(jsonObject2);

        //
        File file1 = new File("tmp.json");
        try {
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(jsonObject2.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        try {
            String content = Files.readString(Path.of(file1.getPath()));
            System.out.println(new JSONObject(content));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        jsonObject2.put("arrayfield", new JSONArray());
        jsonObject2.getJSONArray("arrayfield").put(new JSONObject("{\"field666\":\"666\"}"));

        System.out.println(jsonObject2);

        //
        Map<String, Object> jsonMaps = jsonObject2.toMap();
        System.out.println(jsonMaps);

        //
        jsonMaps.put("mapField", "mapfield");
        System.out.println(new JSONObject(jsonMaps));
    }
}