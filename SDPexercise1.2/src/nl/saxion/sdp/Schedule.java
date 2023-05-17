package nl.saxion.sdp;


public class Schedule {

    private final int day;
    private final int month;
    private final int year;
    private final String task;
    private final Person forPerson;

    public Schedule(int day, int month, int year, String task, Person person) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.task = task;
        this.forPerson = person;
    }



    @Override
    public String toString() {
        return "on " + day + "of "  + getMonth(month) + " " + year  + " we are doing " + task ;
    }


    private String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Februari";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new RuntimeException("month must be in range 1 to 12");
        }
    }
}
