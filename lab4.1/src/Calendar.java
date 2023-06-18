import java.util.ArrayList;
import java.util.List;
public class Calendar {
    private List<Holiday> holidays;

    public Calendar() {
        holidays = new ArrayList<>();
    }

    public void addHoliday(String date, String name) {
        Holiday holiday = new Holiday(date, name);
        holidays.add(holiday);
    }

    public void printHolidays() {
        for (Holiday holiday : holidays) {
            System.out.println(holiday.getDate() + " - " + holiday.getName());
        }
    }

    public class Holiday {
        private String date;
        private String name;

        public Holiday(String date, String name) {
            this.date = date;
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public String getName() {
            return name;
        }
    }
}