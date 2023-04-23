package Task1;

public class Task1 {

    public static void main(String[] args) {
        StringBuilder sqlRequest = new StringBuilder("SELECT * FROM students WHERE ");
        String sqlRequest2 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        int count = 0;

        String[] formatSqlRequest = sqlRequest2.replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .replace(" ","")
                .split(",");
        for (String str : formatSqlRequest) {
            String[] split = str.split(":");
            if (split[1].equals("null")) continue;
            if (str == formatSqlRequest[0]) sqlRequest.append(split[0] + "=" + split[1]);
            else sqlRequest.append(" AND " + split[0] + "=" + split[1]);
        }
        System.out.println(sqlRequest);
    }
}
