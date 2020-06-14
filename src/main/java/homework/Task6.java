package homework;

/**
 * Task 6. There are three numbers - day, month, year. Print
 * the date of the next day as three numbers.
 */
public class Task6 {
    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 1995;
        int daysInMonth[];
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else {
            daysInMonth = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        if ((day >= 1 && day <= daysInMonth[month - 1]) && (month >= 1 && month <= 12)) {
            System.out.println(day + "." + month + "." + year);
            if (day + 1 > daysInMonth[month - 1]) {
                if (month + 1 > 12) {
                    System.out.println(1 + "." + 1 + "." + (year + 1));
                } else {
                    System.out.println(1 + "." + (month + 1) + "." + year);
                }
            } else {
                System.out.println(day + "." + month + "." + year);
            }
        } else {
            System.out.println("You have put wrong date.");
        }
    }
}
