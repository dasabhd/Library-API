package Files;

public class PayLoad {

    public static String addBook(String bookName, String isbn, String aisle, String author){
        return "{\n" +
                "\n" +
                "\"name\":\""+bookName+"\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\""+author+"\"\n" +
                "}\n";
    }

}
