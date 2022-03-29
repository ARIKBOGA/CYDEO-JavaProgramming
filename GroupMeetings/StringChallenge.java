public class StringChallenge {

    public static String timeConversion(String s) {
        if (s.length() == 6) s = "0".concat(s);
        if (!s.contains("p") || s.equals("12:00pm")) {
            if (s.equals("12:00am")) {
                return "00:00";
            } else {
                return s.substring(0, 5);
            }
        } else {
            return (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 5);
        }
    }

    public static int stringChallange(String str) { // gets as "hh:mmam-hh:mmpm"  am or pm
        String[] arr = str.split("-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = timeConversion(arr[i]);   // converting to 24 hour format each element
        }
        int min1 = Integer.parseInt(arr[0].substring(0, 2)) * 60 + Integer.parseInt(arr[0].substring(3));
        int min2 = Integer.parseInt(arr[1].substring(0, 2)) * 60 + Integer.parseInt(arr[1].substring(3));

        if (min2 > min1) {  // calculates the time interval between them
            return min2 - min1;
        } else {
            return 1440 - (min1 - min2);
        }
    }

    public static void main(String[] args) {
        System.out.println(stringChallange("1:35pm-1:30pm"));
        System.out.println(stringChallange("1:00pm-11:00am"));
        System.out.println(stringChallange("11:00pm-11:07pm"));
    }
}