/**
 * Cat
 */
public class Cat {

    private String name;
    private int appetite;
    private int satiety;

    public Cat (String name, int appetite){
        this (name, appetite, 10);
    }

    public Cat(String name) {
        this(name, 10, 10);

    }

    /**
     * @param name
     * @param appetite
     * @param satiety
     */
    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

        Thread backgroundSatietyManagement = new Thread(() -> {
            while (true) {
                try {
                    
                    Thread.sleep(5*1000L);
                    satyatyCats ();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        backgroundSatietyManagement.setDaemon(true);
        backgroundSatietyManagement.start();
    }

    public int satyatyCats () {
        if (satiety > 0){
            satiety--;
        }
        return satiety;
    }
    

    public void eat(Plate plate) {
        if (appetite > satiety){
            int hunger = appetite - satiety; // определил сколько съест кот
            satiety = satiety + hunger; //когда кот кушает к сытости прибавляется столько сколько он съел
            plate.decreaseFood(hunger);
            plate.increaseFood(hunger); 
        }
    }


    @Override
    public String toString() {
        return name + "{appetite=" + appetite + ", satiety=" + satiety + "}";
    }

} 






