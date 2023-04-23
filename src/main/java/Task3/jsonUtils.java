package Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class jsonUtils {

    public static void main(String[] args) {
        String sb = jsonReader("D:\\Программирование\\Java Core\\Java\\Lesson2\\homework2\\homework2\\src\\main\\java\\Task3\\people.json");
        String[] splitSb = sb.replace("{", "")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                //.replace("\"", "")
                .split("}");
        for (String str : splitSb) System.out.println(str);
    }



    public static String jsonReader(String file) {
        if (file == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        // открываем файл
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

            String inputLine;
            // построчно считываем результат в объект StringBuilder
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
                //System.out.println(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
