import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        Random random = new Random();

        double [] weights = new double [10];
        double middleWeigth = 0;
        int peopleCount = 0;

        for(int i = 0; i < weights.length; i++ ) {
            weights[i] += random.nextDouble() * 60 + 40;
            middleWeigth += weights[i];

            if (weights[i] >= 60 && weights[i] <= 80) {
                peopleCount++;
            }
        }

        System.out.println("Средней вес всех людей: " + middleWeigth/ weights.length);
        System.out.println("Количество людей: " + peopleCount);

    }
}
