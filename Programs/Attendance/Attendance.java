import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        int day;
        boolean attendance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number: ");
        day = sc.nextInt();

        switch (day) {
            case 6:
                System.out.println("Holiday");
                attendance = false;
                break;
            case 7:
                System.out.println("Holiday");
                attendance = false;
                break;
            default:
                System.out.println("Working Day");
                attendance = true;
        }

        if (attendance) {
            System.out.println("You're makred as present");
        } else {
            System.out.println("You're makred as absent");
        }
    }
}