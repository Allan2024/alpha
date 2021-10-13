import java.text.NumberFormat;

public class Class5 {
    public static void main(String[] args) {
        String result = NumberFormat.getCurrencyInstance().format(0.03);
        System.out.println(result);
    }
}
