package homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true;
        } else {
            System.out.println("на тарелке не хватает еды чтобы утолить голод кота");
            return false;
        }

    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int food) {
        this.food += food;
    }

}
