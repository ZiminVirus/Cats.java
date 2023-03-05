import java.security.PublicKey;
import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food = food - foodToDecrease;

        }
        // else {
        //     System.out.println("Недостаточно еды. Сколько еды добавить?"); //добавил в метод добавку еды вводом с клавиатуры
            
        //     try {
        //         Scanner sc = new Scanner(System.in);
        //         String countFood = sc.nextLine();
        //         food = Integer.parseInt(countFood);
        //     } catch (Exception e) {
        //         System.out.println("Введено не верное значение");
        //     }
           
        // }
        return food;
    }

    public int increaseFood (int foodToDecrease){
        if (food < foodToDecrease){
            System.out.println("Недостаточно еды. Сколько еды добавить?");
            Scanner sc = new Scanner(System.in);
            String countFood = sc.nextLine();
            food = Integer.parseInt(countFood);
        }
        return food;
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }
    

}






