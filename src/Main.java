import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
main3();
    }
public static void main1() throws ParseException {
    String input_date="13/08/2004";
    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
    Date dt1=format1.parse(input_date);
    DateFormat format2=new SimpleDateFormat("EEEE");
    String finalDay=format2.format(dt1);
    System.out.println(finalDay);
}

    public static void main2() {

//        Date date = new Date();
//        LocalDate.now();
//        LocalTime now = LocalTime.now();
//        LocalDateTime.now();
//        System.out.println(date);



        int dayOfWeek =3;

        Calendar now = Calendar.getInstance();

        int weekday = now.get(Calendar.DAY_OF_WEEK);
        int days = dayOfWeek - weekday;
        System.out.println(days);
        if (days < 0) days += 7;
        now.add(Calendar.DAY_OF_YEAR, days);

        Date date = now.getTime();
        String dateStr = new SimpleDateFormat("EEEE dd.MM.yyyy").format(date);
        System.out.println(dateStr);
    }

    public static void main3() {
Class cl=new Class();
cl.check();
    }
}

