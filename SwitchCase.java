public class SwitchCase {
    public static void main(String[] args) {
        //Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

        int month = 12; // should be a number 1-12
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            // write case 12 and a default case below
            case 12 -> "December";
            default -> "Invalid month";
        };

            System.out.println(monthString);
    }
}
