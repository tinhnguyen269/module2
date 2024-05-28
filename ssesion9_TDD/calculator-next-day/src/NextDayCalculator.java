import org.w3c.dom.ls.LSOutput;

public class NextDayCalculator {
    public String NexDayCalculatorTest() {
        int date,month,year;

        if (date > 0 && date < 31) {
            date++;
        }
        if (date == 31) {
            date = 1;
        }
        if (month > 0 && month < 12) {
            month++;
        }
        if (month == 12) {
            month = 1;
        }
        if (year > 0) {
            year++;
        }

        return date + "/" + month + "/" + year;
    }


}
