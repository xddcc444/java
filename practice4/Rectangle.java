class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;

    Rectangle() {
        super.set_color("blue");
        super.set_filled(false);
        System.out.println("Added Rectangle object (created)");
    }



    Rectangle(double width, double length, String color, boolean filled) {
        super.set_color("blue");
        super.set_filled(false);
        this.sideA = width;
        this.sideB = length;
        System.out.println("Added Rectangle object (created)");
    }

    // Width getter
    double get_width() {
        return this.sideA;
    }

    // Width setter
    void set_width(double width) {
        if (width > 0) {
            this.sideA = width;
            System.out.println("Rectangle width set as: " + this.sideA);
        } else {
            System.out.println("Rectangle width must be more than 0");
        }
    }

    // Length getter
    double get_length() {
        return this.sideB;
    }

    // Width setter
    void set_length(double length) {
        if (length > 0) {
            this.sideB = length;
            System.out.println("Rectangle length set as: " + this.sideB);
        } else {
            System.out.println("Rectangle length must be more than 0");
        }
    }

    @Override
    double get_area() {
        return this.sideB * this.sideA;
    }

    @Override
    double get_perimeter() {
        return 2 * (this.sideB + this.sideA);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.sideB + ", width: " + this.sideA;
    }
}
