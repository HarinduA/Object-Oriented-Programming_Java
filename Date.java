public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDate() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public String toString() {
        return "Day = " + this.day + "Month = " + this.month + "Year = " + this.year;
    }
}
