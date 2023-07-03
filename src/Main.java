import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String redBook;
        final int NUM = 301;
        String word = " Snowleopard ";
        redBook = NUM + word;
        System.out.println(NUM + word + redBook);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else{
            System.out.println("Вы сохранили ноль");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}