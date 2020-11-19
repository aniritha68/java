import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCIAFile {
	private static final String FILENAME = "C:\\Users\\Admin\\Downloads\\invo.txt";
	private static String invoiceNo;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HashMap<String, List<Object>> map = new HashMap<String,List<Object>>();
		List<Object> valSetOne = new ArrayList<>();
		String content;
		int count=0;
		String property;
		String NA;
		
		
		

		try {
			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
				System.out.println(br);
				while ((content = br.readLine()) != null) {
					System.out.println(content.split(";").length);
					
					
					if (content != null && content.split(";").length>2) {
						String[] value = content.split(";");
						invoiceNo = value[2];
						if(count!=0) {				
							valSetOne.clear();
							map.clear();
							
						}	

						Object year = value[0];
						valSetOne.add(year);
						Object LegalEntity = value[1];
						Object company = value[3];
						valSetOne.add(company);
						valSetOne.add(LegalEntity);
						Object toDate = value[4];
						  try {
							  String str_date= (String) toDate;
							  DateFormat formatter ; 
							  Date date ; 
							  formatter = new SimpleDateFormat("dd:MM:yyy");
							  date = (Date)formatter.parse(str_date); 
							  valSetOne.add(date.getTime());
							  }
							  catch (ParseException e){
							  System.out.println("Exception :"+e); 
							  }
						valSetOne.add(toDate);
//						int i =7;
						int newv= content.split(";").length-1;
//						do {
						Object isPOD = value[7];
					
//							if(isPOD.equals(NA) ){
//								
//								System.out.println(isPOD);
//						}
//							else if(value[7] == NA ) {
//								Object NotaPOD = value[7];
//								valSetOne.add(NotaPOD);
//								
//							}
//							if(i==4)
//								i=0;
//						}
//							while(newv-- != i--) ;
					
					
				        	map.put(invoiceNo, valSetOne);
				        	count++;
				        	
				        	 System.out.println(map);
				        }
										 
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
