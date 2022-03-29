package week09;

import java.util.Arrays;

public class MethodWithReturningObject {
    public static Object[] merge(Object[] a1, Object[] a2) {
        Object[] objects = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2, 0, objects, a1.length, a2.length);
        return objects;
    }

    public static void main(String[] args) {
        String[] str1 = {"burak", "yusuf", "kadir"};
        String[] str2 = {"serpil", "sati", "ece"};
        System.out.println(Arrays.toString(merge(str1, str2)));

        Double[] d1 = {11.3, 34.6, 98.3};
        Double[] d2 = {-51.7, -87.3, -9.2};
        System.out.println(Arrays.toString(merge(d1, d2)));

        Integer[] i1 = {42, 11, 23, 67};
        Integer[] i2 = {-3, -43, -27, -9, -88};
        System.out.println(Arrays.toString(merge(i1, i2)));

        Character[] c1 = {'a','b','c'};
        Character[] c2 = {'x','y','z'};
        System.out.println(Arrays.toString(merge(c1, c2)));
    }
}