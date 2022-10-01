import java.util.*;

public class prct2 {
    public static void main(String[] args) {

        Shape Square = new Shape("qadrat");
        System.out.println("toString() method test: " + Square.toString());


        Ball ball = new Ball(7);
        ball.display_info();

        Book book = new Book("ShortStories", 123);
        book.display_info();


        Dog wolf = new Dog("Grey", 3);
        //wolf.set_age(3); //reset age
        System.out.println(wolf);

        Dog dogs[] = { new Dog("Black", 6), new Dog("White", 9), new Dog("Purple", 1) };


        Dog_nursery dog_nursery = new Dog_nursery();
        System.out.println(dog_nursery);//create nursery

        dog_nursery.add_dog(wolf);
        System.out.println(dog_nursery);//test adding one dog

        dog_nursery.add_dogs(dogs);
        System.out.println(dog_nursery);//test adding some dogs
    }
}

class Shape {
    private String name;
    Shape(String name) {
        this.name = name;
        System.out.println("\nAdded Shape object " + this.name + " (created)");
    }
    public String toString() {
        return "Shape: " + this.name;
    }
}

class Dog {
    private String name;
    private int age;
    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\nAdded Dog object with name: " + this.name + " (created)");
    }
    // Age setter
    public void set_age(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            //System.out.println("Dog's age set as: " + this.age);
        }
    }
    // Age getter
    public int get_age() {
        return this.age;
    }
    // Name setter
    public void set_name(String name) {
        this.name = name;
        System.out.println("Dog name set as: " + this.name);
    }
    // Name getter
    public String get_name() {
        return this.name;
    }

    public int get_human_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + get_name() + " with age " + get_age();
    }
}

class Dog_nursery {
    private List<Dog> dog_nursery_array = new ArrayList<Dog>();
    {
        System.out.println("\nAdded Dog nursery object (created)");
    }
    // test on one dog
    public void add_dog(Dog dog) {
        this.dog_nursery_array.add(dog);
        System.out.println(dog + ". This dog was added into nursery successfully");
    }
    // test on multiple dogs
    public void add_dogs(Dog dogs[]) {
        this.dog_nursery_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog nursery successfully");
    }
    public String toString() {
        if (!this.dog_nursery_array.isEmpty()) return "Dog nursery: " + this.dog_nursery_array;
        else return "Dog nursery empty!";
    }
}

class Ball {
    int radius;
    int diametr;
    Ball(int radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("\nAdded Ball object (created)");
    }
    void display_info() {
        System.out.printf("Radius: %s \tDiameter: %d\n", this.radius, this.diametr);
    }
}

class Book {
    String name;
    int pages;
    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        System.out.println("\nAdded Book object (created)");
    }
    void display_info() {
        System.out.printf("Book's name: %s \tPages: %d\n", this.name, this.pages);
    }
}
