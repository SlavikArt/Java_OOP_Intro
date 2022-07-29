public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet();

        cat.name = "Vasya";
        cat.age = 1;
        cat.weight = 2.13;
        cat.favFood = "Meat";

        cat.play();
        cat.eat(); // default = favorite food
        cat.eat("Fish");
        cat.sleep();
        cat.ShowInfo();

        System.out.println();

        Pet dog = new Pet();

        dog.name = "Oskar";
        dog.age = 2;
        dog.weight = 4.2;
        dog.favFood = "Bone";

        dog.play();
        dog.eat(); // default = favorite food
        dog.eat("Meat");
        dog.sleep();
        dog.ShowInfo();
    }
}