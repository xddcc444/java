class Circle extends Shape {
    protected double radius;


    Circle(double radius, String color, boolean filled) {
        super.set_color(color);
        super.set_filled(filled);
        this.radius = radius;
        System.out.println("Added Circle object (created)");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Circle radius set as: " + this.radius);
        } else {
            System.out.println("Circle radius must be more than 0");
        }
    }

    @Override
    double get_area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double get_perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle; radius: " + get_radius() + ", perimeter: " + get_perimeter();
    }
}
