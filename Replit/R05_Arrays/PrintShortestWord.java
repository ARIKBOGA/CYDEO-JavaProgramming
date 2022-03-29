package R05_Arrays;

public class PrintShortestWord {
    public static void main(String[] args) {
        String str = "java, cable, red, vivid, remedy, grace";
        String[] arr = str.split(", ");
        String shortest = str;
        for (String value : arr) {
            shortest = value.length() < shortest.length() ? value : shortest;
        }
        System.out.println(shortest);
    }
}