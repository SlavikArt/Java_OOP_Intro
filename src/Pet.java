public class Pet {
    String name;
    int age;
    double weight;
    String favFood;

    void sleep(){
        System.out.println(name + " is sleeping...");
    }

    void play(){
        System.out.println(name + " is playing :)");
    }

    void eat(){
        System.out.println(name + " is eating " + favFood);
    }

    void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    void ShowInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Favorite food: " + favFood);
    }
}
