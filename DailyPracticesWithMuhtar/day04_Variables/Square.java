package day04_Variables;

public class Square extends Shape {
    private static int id = 0;

    Square(int side) {
        this.id = ++id;
        this.name = id + ". Square";
        this.perimeter = side + side;
        this.area = side * side;
    }
}
