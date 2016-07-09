package chapter12Apis;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class A3DateDemo {
public static void main(String[] args) {
	long currentTimeMillis = System.currentTimeMillis();
//	System.out.println(currentTimeMillis);
//	Date date = new Date(currentTimeMillis);
//	System.out.println(date);
////	Date date2 = new Date();
////	System.out.println(date2);
//	System.out.println(date.getTime());
	
	DateFormat dataFormat  = null;
	Date date = new Date();
	
	System.out.println("getDataInstance():");
	dataFormat = DateFormat.getDateInstance(
			DateFormat.LONG,Locale.GERMAN);
	System.out.println(dataFormat.format(currentTimeMillis));
	
	System.out.println("getTimeInstance():");
	dataFormat = DateFormat.getTimeInstance(
			DateFormat.LONG,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	dataFormat = DateFormat.getTimeInstance(
			DateFormat.MEDIUM,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	dataFormat = DateFormat.getTimeInstance(
			DateFormat.SHORT,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	
	System.out.println("getDateTimeInstance():");
	dataFormat = DateFormat.getDateTimeInstance(
			DateFormat.LONG,DateFormat.LONG,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	dataFormat = DateFormat.getDateTimeInstance(
			DateFormat.MEDIUM,DateFormat.MEDIUM,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	dataFormat = DateFormat.getDateTimeInstance(
			DateFormat.SHORT,DateFormat.SHORT,Locale.GERMAN);
	System.out.println(dataFormat.format(date));
	

	System.out.println("SimpleDateFormat():");
	DateFormat dateFormatSimple=
			new SimpleDateFormat("DDDDD-EEEEEEE-FFFF yyyy.MM.dd G 'at' HH:mm:ss z",Locale.GERMAN);
	System.out.println(dateFormatSimple.format(date));
}
}
