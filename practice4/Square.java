class Square extends Rectangle{

    Square(double side, String color, boolean filled) {
        super.set_color("blue");
        super.set_filled(false);
        this.sideA = side;
        this.sideB = side;
        System.out.println("Added Square object (created)");
    }

    // Side getter
    double get_side() {
        return this.sideA;
    }

    // Side setter
    void set_side(double side) {
        if (side > 0) {
            this.sideA = side;
            this.sideB = side;
            System.out.println("Square side set as: " + this.sideA);
        } else {
            System.out.println("Square side must be more than 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.sideA;
    }
}
