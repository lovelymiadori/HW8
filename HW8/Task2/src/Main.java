import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        int [] array = new int [10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++ ) {
            array[i] += random.nextDouble(40, 100);
        }

        int summ = 0;
        for (int i = 0; i < array.length; i++ ) {
            summ += array[i];
        }

        int humans = 0;
        for(int i = 0; i < array.length; i++ ) {
            if (array[i] >= 60 && array[i] <= 80) {
                humans += 1;
            }
        }

        System.out.println(humans);
        System.out.println(summ/ array.length);
    }
}
