public class Main {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addHoliday("2023-01-01", "New Year's Day");
        calendar.addHoliday("2023-03-08", "International Women's Day");

        calendar.printHolidays();
    }
}