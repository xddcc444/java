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
        wolf.set_age(6);
        System.out.println(wolf);

        Dog dogs[] = { new Dog("Black", 6), new Dog("White", 9), new Dog("Purple", 1) };


        Dog_kennel dog_kennel = new Dog_kennel();
        System.out.println(dog_kennel);

        dog_kennel.add_dog(wolf);
        System.out.println(dog_kennel);

        dog_kennel.add_dogs(dogs);
        System.out.println(dog_kennel);
    }
}

class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
        System.out.println("\n[+] Shape object " + this.name + " was created");
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
        System.out.println("\nAdded Dog object with name: " + this.name + " was created");
    }

    // Age setter
    public void set_age(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            System.out.println("Dog age set as: " + this.age);
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

    // Dog age as human age getter
    public int get_human_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + this.name + " with age " + this.age;
    }
}

class Dog_kennel {
    private List<Dog> dog_kennel_array = new ArrayList<Dog>();

    {
        System.out.println("\nAdded Dog kennel object was created");
    }

    // Add one dog
    public void add_dog(Dog dog) {
        this.dog_kennel_array.add(dog);
        System.out.println(dog + ". This dog added into the dog kennel successfully");
    }

    // Add many dogs
    public void add_dogs(Dog dogs[]) {
        //this.dog_kennel_array = Stream.concat(Arrays.stream(this.dog_kennel_array.toArray()), Arrays.stream(dogs)).toArray(Dog[]::new);
        this.dog_kennel_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog kennel successfully");
    }

    public String toString() {
        if (!this.dog_kennel_array.isEmpty()) return "Dog kennel: " + this.dog_kennel_array;
        else return "Dog kennel empty!";
    }
}

class Ball {
    int radius;
    int diametr;

    Ball(int radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("\nAdded Ball object was created");
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
        System.out.println("\nAdded Book object was created");
    }

    void display_info() {
        System.out.printf("Book name: %s \tPages: %d\n", this.name, this.pages);
    }
}
