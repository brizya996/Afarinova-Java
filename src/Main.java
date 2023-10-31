import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Задание #1
        System.out.println("Введите  число" );
        String number = sc.nextInt() > 7 ? "Привет" : "";
        System.out.println(number);
        // Задание #2
        System.out.println("Введите  имя Вячеслав" );
        String name = sc.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав" );
        } else {
            System.out.println("Нет такого имени" );
        }
        // Задание #3
        System.out.println("Введите  длину массива" );
        int lenthArray = sc.nextInt();
        int[] arr = new int[lenthArray];
        System.out.println("Введите  массива из " + lenthArray + " чисел" );
        for(int i = 0; i < lenthArray; i++) {
            arr[i] =  sc.nextInt();
        }
        System.out.println("Вывожу числа кратные 3" );
        for(int i = 0; i < lenthArray; i++) {
            if (arr[i] % 3 == 0 ) System.out.println(" " + arr[i]);
        }
        // Задание #4 скобочная последовательность  [((())()(())]]
        // данная последовательность не верная,
        // ..нужно вторую скобку заменить на квадратную  [[(())()(())]]
        // или заменить предпоследнюю скобку на курглую  [((())()(()))]

    }
}