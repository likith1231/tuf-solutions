import java.util.Scanner;

public class SwitchCase {

    public static String getDayName(int day) {
        String result;
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        String dayName = getDayName(day);
        System.out.println("Day: " + dayName);
        scanner.close();
    }
}
