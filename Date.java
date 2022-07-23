import java.io.Serializable;
import java.util.ArrayList;

public class Date implements Serializable {
    int day;
    String month;
    Holiday holiday;
    ArrayList<Birthday> birthdaysToday;

    private static final long serialVersionUID = 1L;

    public Date(String month, int day) {
        this.month = month;
        this.day = day;
        birthdaysToday = new ArrayList<Birthday>();
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public ArrayList<Birthday> getBirthdaysToday() {
        return birthdaysToday;
    }

    public void setBirthdaysToday(ArrayList<Birthday> birthdaysToday) {
        this.birthdaysToday = birthdaysToday;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", holiday=" + holiday +
                ", birthdaysToday=" + birthdaysToday +
                '}';
    }
}
