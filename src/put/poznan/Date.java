package put.poznan;

public class Date {

    private int day;
    private int month;
    private int year;

    Date(String date_) {

        this.day = Integer.parseInt(date_.substring(0, 2));
        this.month = Integer.parseInt(date_.substring(3, 5));
        this.year = Integer.parseInt(date_.substring(6, 10));
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {

        if (month >= 0 && month <= 9)
            return day + "-" + "0" + month + "-" + year;
        else
            return day + "-" + month + "-" + year;
    }
}
