package ReadAndWiteIO;

public class Test {
    public static void main(String[] args) {
        String text = "Hello, world! How are you?";

        // Cắt chuỗi thành mảng các từ bằng dấu cách
        String[] words = text.split(" ");

        // In ra các từ
        for (String word : words) {
            System.out.println(word);
        }
    }
}
