import java.util.ArrayList;
import java.util.Arrays;

public class ThisKeyword {
    int x = 10;
    static int y = 2;

    public ThisKeyword() {

    }

    public void set_X(int x) {
        this.x = x;
    }

    public void reset_Y() {
        int y = 0;
        this.y = y;
        System.out.println(String.valueOf(this));
    }

    public void print(ThisKeyword t) {
        System.out.println(this.x + " " + this.getClass().getConstructors().length);
    }

    public ThisKeyword multiProcess(ThisKeyword t) {
       // this.print(this);
        this.set_X(50);
        return this;
    }



    public static void main(String[] args) {
        ThisKeyword t1 = new ThisKeyword();
        ThisKeyword t2 = new ThisKeyword();
        t1.set_X(100);
        t2.set_X(200);


        t1.multiProcess(t2);



        System.out.println(t1.x); //  50
        System.out.println(t2.x); //  200


    }

}
