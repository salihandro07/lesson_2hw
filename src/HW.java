import java.util.Random;

public class HW {

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = (int) (Math.random() * 51) - 20;
            String result = permission(age, temperature);
            System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + result);
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}