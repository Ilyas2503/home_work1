import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String studyAtOurUniversity;
        final int NUM = 2000;
        String word = " ala-too ";

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Ва сохранили ноль!");
        }
        Scanner name = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String string = name.nextLine();
        System.out.println("Привет " + string);
        studyAtOurUniversity = NUM + word;
        System.out.println(studyAtOurUniversity);
    }
}
