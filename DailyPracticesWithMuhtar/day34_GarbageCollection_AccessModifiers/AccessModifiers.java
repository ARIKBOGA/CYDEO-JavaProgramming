package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {
    private static final String privateData = "private";
    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";

    public static void main(String[] args) {
        System.out.println(privateData);
    }
}