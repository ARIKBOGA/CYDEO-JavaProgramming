package day39_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestShape {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Rectangle s2 = new Rectangle(3, 4);
        Circle s3 = new Circle(7);

        s1.setSide(-1);
        s2.setWidth(0);
        s2.setLength(-1);
        s3.setRadius(-9);

        List<Shape> shapeList = new ArrayList<>(Arrays.asList(s1, s2, s3));

        shapeList.forEach(System.out::println);
    }
}