

public class Date {
    private int date;
    private int month;
    private int year;

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.date + "/" + this.month + "/" + this.year;
    }

    public Date Recent(Date p1, Date p2) {
        if (p1.getYear() > p2.getYear()) {
            return p1;
        } else if (p1.getYear() < p2.getYear()) {
            return p2;
        } else if (p1.getMonth() > p2.getMonth()) {
            return p1;
        } else if (p1.getMonth() < p2.getMonth()) {
            return p2;
        } else if (p1.getDate() > p2.getDate()) {
            return p1;
        } else if (p1.getDate() < p2.getDate()) {
            return p2;
        } else {
            System.out.print("Both dates are same\n");
            return null;
        }
    }
}