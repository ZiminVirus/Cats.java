import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws InterruptedException {
                // Кот (имя, аппетит, сытность)
        // Тарелка (содержит какое-то количество еды)
        // Кот ест из тарлеки. Если в тарелке недостаточно еды - кот ее не трогает

        // ДЗ:
        // while (true) -> while (!plate.isEmpty())
        // 1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
        // В конце каждого цикла мы досыпаем в тарелку еду.
        // Для досыпания еды сделать метод increaseFood в классе Plate.
        // 2. Поменять поле satiety у кота с boolean на int.
        // Допустим у кота апптит 10, сытность 3. Значит кот захочет поесть 7 единиц.
        // 3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.
        List <Cat> cats = new ArrayList<>();
        Plate plate = new Plate(200);


        Cat murzik = new Cat("Murzik", 15, 10);
        Cat barsik = new Cat("Barsik", 25, 20); // appetite = 10
        Cat vasia = new Cat("Vasia");
        cats.add(murzik);
        cats.add(barsik);
        cats.add(vasia);
        while (true) {
            
            for (Cat cat : cats) {
            System.out.println(plate);
            System.out.println(cat);
            cat.eat(plate);
            Thread.sleep(1000);
            }
        }

    }

    }










