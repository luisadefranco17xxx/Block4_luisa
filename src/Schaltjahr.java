public class Schaltjahr {

    public static void main(String[] args) {
        int year = 1996;
        System.out.println("The "+year+" is a leap year?:  "+isLeapYear(year));
        year = 1900;
        System.out.println("The "+year+" is a leap year?:  "+isLeapYear(year));
        year = 2022;
        System.out.println("The "+year+" is a leap year?:  "+isLeapYear(year));
        year = 2023;
        System.out.println("The "+year+" is a leap year?:  "+isLeapYear(year));
        year = 2024;
        System.out.println("The "+year+" is a leap year?:  "+isLeapYear(year));
        for (int i = 0; i < 2100; i++) {
            isLeapYear(i);
        }


    }

    public static boolean isLeapYear(int value) {
        if(value%4==0&&!(value%100==0)){
            System.out.println("The "+value+" is a leap year");
            return true;
        } else if (value%4==0&&value%400==0) {
            System.out.println("The "+value+" is a leap year");
            return true;
        } else return false;

    }
}
