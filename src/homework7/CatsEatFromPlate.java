package homework7;

import java.util.Random;

public class CatsEatFromPlate {
    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Cat[] cat = new Cat[3];
        Plate plate = new Plate(100);
        for (int i = 0; i < cat.length ; i++) {
            Random random = new Random();
            int appetite = random.nextInt(100);
            cat[i] = new Cat("cat" + i, appetite);
            cat[i].eat(plate);
            cat[i].info();
            plate.info();
        }
    }

}
