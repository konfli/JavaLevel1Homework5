package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)){
            satiety = true;
        }

    }
    public void info(){
        System.out.println("имя: " + name );
        System.out.println("аппетит: " + appetite);
        System.out.println("сытость: " + satiety);
    }

}
