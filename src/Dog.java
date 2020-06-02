public class Dog extends Animal {
    String color;

    public Dog(String name) {
        this.name = name;

    }

    public void DogInfo() {
        System.out.println("Собака имя: " + name + " цвет: " + color);
    }
}
