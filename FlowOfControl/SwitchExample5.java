//Switch-Case Statement to demonstrate the use of Enum
public class SwitchExample5 {
    public enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    public static void main(String[] args) {
        Day[] DayNow = Day.values();
        for (Day i : DayNow) {
            switch (i) {
                case Sunday:
                    System.out.println("Sunday");
                    break;
                case Monday:
                    System.out.println("Monday");
                    break;
                case Tuesday:
                    System.out.println("Tuesday");
                    break;
                case Wednesday:
                    System.out.println("Wednesday");
                    break;
                case Thursday:
                    System.out.println("Thursday");
                    break;
                case Friday:
                    System.out.println("Friday");
                    break;
                case Saturday:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
