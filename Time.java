package cn;

import java.sql.Timestamp;
import java.util.Date;

public class Time {
	
	public static void main(String[] args) {	 
		Date date= new Date();
    
 long time = date.getTime();
 
 Timestamp ts = new Timestamp(time);
System.out.println(ts);
 String a=String.valueOf(ts);

String b= a.substring(a.indexOf('.')+1);
System.out.println(b);
System.out.println(Long.parseLong(b));
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Date date1= new Date();
Timestamp ts1=new Timestamp( date1.getTime());
System.out.println(ts1);

	}

}
