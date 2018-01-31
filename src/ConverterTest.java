public class ConverterTest {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 7; i++) {
            System.out.println(i + " pierwszy dzień tygodnia to " + CalandarConverter.convertDayToString(i));
        }
    }
}