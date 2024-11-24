import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        System.out.println("Задача №1");
        float [] costs = { 34_543.23f, 12_446.50f, 3_700.00f, 60_300.00f, 23_000.00f };
        float sum = 0;
        for (float cost : costs) {
            sum+=cost;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println();
        System.out.println("Задача №2");
        float [] costs1 = { 12_543.23f, 12_446.50f, 3_000.00f, 70_000.00f, 26_000.00f };
        float min = costs1[0];
        float max = costs1[0];
        for (float cost : costs1){
            if (min > cost) min = cost;
            if (max < cost) max = cost;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println();
        System.out.println("Задача №3");
        float [] costs2 = { 10_543.23f, 1_446.50f, 6_800.00f, 8_000.00f, 75_000.00f };
        float average = 0;
        for (float cost : costs2){
            average+=cost;
        }
        average/=costs2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println();
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (char c : reverseFullName){
            System.out.print(c);
        }




    }
}