package shaTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 12; i++) {
			int rIndex = 0;
			if(i<3)
				rIndex= rnd.nextInt(1);
			else
				rIndex=1;
		    switch (rIndex) {
//		    case 0:
//		        // a-z
//		        temp.append((char) ((int) (rnd.nextInt(26)) + 97));
//		        break;
		    case 0:
		        // A-Z
		        temp.append((char) ((int) (rnd.nextInt(26)) + 65));
		        break;
		    case 1:
		        // 0-9
		        temp.append((rnd.nextInt(10)));
		        break;
		    }
		}
		System.out.println(temp);
//		try {
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat format1 = new SimpleDateFormat("yyyy�� MM�� dd��");
//		Date date = formatter.parse("2019-07-06");
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		int dayNum = cal.get(Calendar.DAY_OF_WEEK);
//		String convertedString = "";
//		 
//		 switch (dayNum ) {
//		     case 1: convertedString = "(��)"; break;
//		     case 2: convertedString = "(��)"; break;
//		     case 3: convertedString = "(ȭ)"; break;
//		     case 4: convertedString = "(��)"; break;
//		     case 5: convertedString = "(��)"; break;
//		     case 6: convertedString = "(��)"; break;
//		     case 7: convertedString = "(��)"; break;
//		 }
//		System.out.println(format1.format(date)+convertedString);
//		
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}
