public class Main {
    public static void main(String[] args) {
        System.out.println(weather(4, 15));
        System.out.println(weather(18, 25));
        System.out.println(weather(50, 5));
        System.out.println(weather(35, -15));
        System.out.println(weather(22, 31));
    }

    public static String weather(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age >= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}