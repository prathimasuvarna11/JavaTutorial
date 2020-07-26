import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/y");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/y hh:mm:ss");
		System.out.println(d);
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));

	}

}
