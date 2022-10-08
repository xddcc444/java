abstract class Shape {
    private String color;
    private boolean filled;

    Shape() {
        System.out.println("\nAdded Shape object (created)");
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("\nAdded Shape object (created)");
    }

    // Color getter
    String get_color() {
        return this.color;
    }

    // Color setter
    void set_color(String color) {
        this.color = color;
        System.out.println("Shape's color set as: " + this.color);
    }

    // Filled getter
    boolean is_filled() {
        return this.filled;
    }

    // Filled setter
    void set_filled(boolean filled) {
        this.filled = filled;
        System.out.println("Shape fullness set as: " + this.filled);
    }

    // Area getter
    double get_area() {
        return 0.0;
    }

    // Perimeter getter
    double get_perimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object: is filled: " + this.filled + ", color: " + this.color;
    }
}
