package day45_Abstraction;

import java.util.ArrayList;
import java.util.List;

//extends:
class C {

}

class A {

}

class B extends A {

}


interface Z {
     Integer num = 0;

}

interface X {

}

interface Y extends X, Z {

}


//implements

class D implements X, Y, Z {

}


public class Extends_vs_Implements extends A implements X, Y, Z {
    public static void main(String[] args) {
        X x = new D();
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        System.out.println(list.get(0));
    }

}
