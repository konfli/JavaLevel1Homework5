public abstract class Animal {
    String name;
    private double maxRunLength;
    private double maxSwimLength;
    private double maxJumpHeight;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double maxRunLength, double maxSwimLength, double maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    protected void setMaxRunLength(double maxRunLength) {

        this.maxRunLength = maxRunLength;
    }

    protected void setMaxSwimLength(double maxSwimLength) {

        this.maxSwimLength = maxSwimLength;
    }

    protected void setMaxJumpHeight(double maxJumpHeight) {

        this.maxJumpHeight = maxJumpHeight;
    }


    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void run(double runLength) {

        if (maxRunLength > runLength) {

            System.out.println(name + "  пробежало данную дистанцию!");

        } else {

            System.out.println(name + " не может пробежать данную дистанцию");
        }
    }

    public void swim(double swimLength) {

        if (maxSwimLength > swimLength) {

            System.out.println(name + " проплыло данную дистанцию!");

        } else {

            System.out.println(name + " неможет проплыть данную дистанцию!");
        }
    }

    public void jump(double jumpHeight) {

        if (maxJumpHeight > jumpHeight) {

            System.out.println(name + " перепрыгнуло через барьер!");

        } else {

            System.out.println(name + " не может перепрыгнуть через барьер!");
        }
    }
}


