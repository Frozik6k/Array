import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int [] weight = new int [12];
        int element = 1;
        for (int i = 0; i < weight.length; i++){
            weight[i] = element;
            element++;
            if (element >=4) element = 1;
        }

        float [] sand = {1.57f, 7.654f, 9.986f};

        boolean [] indicators = {true, false, false, true, false, true, true};

        System.out.println();
        System.out.println("Задача №2");
        for (int i = 0; i < weight.length; i++){
            System.out.print(weight[i]);
            if (i < weight.length-1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < sand.length; i++){
            System.out.print(sand[i]);
            if (i < sand.length-1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < indicators.length; i++){
            System.out.print(indicators[i]);
            if (i < indicators.length-1)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача №3");
        for (int i = weight.length-1; i >= 0; i--){
            System.out.print(weight[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = sand.length-1; i >= 0; i--){
            System.out.print(sand[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = indicators.length-1; i >= 0 ; i--){
            System.out.print(indicators[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < weight.length; i++){
            if ( weight[i] % 2 == 1) weight[i]++;
        }
        System.out.println(Arrays.toString(weight));




    }
}