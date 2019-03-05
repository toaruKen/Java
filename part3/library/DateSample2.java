import java.util.Calendar;

class DateSample2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("今日は" + cal.get(Calendar.DATE) + "日");
    }
}