package readfile;
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
	private static final String FILENAME = "C:\\Users\\akrishn3\\Downloads\\ZRDE_P07_20200914_110523 (5).txt";
	private static String invoiceNo;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HashMap<String, List<Object>> map = new HashMap<String,List<Object>>();
		List<Object> valSetOne = new ArrayList<>();
		String content;
		int count=0;
		String nullval;
		int Flag =0;
		
		
	

//for(int k=0;k<1;k++){
//if(count==0 && nullval == null){
//	
//}
		try {
			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
				System.out.println(br);
				while ((content = br.readLine()) != null) {

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
						Object toDate = value[11];
						  try {
							  String str_date= (String) toDate;
							  DateFormat formatter ; 
							  Date date ; 
							  formatter = new SimpleDateFormat("dd/MM/yyy");
							  date = (Date)formatter.parse(str_date); 
							  valSetOne.add(date.getTime());
							  }
							  catch (ParseException e){
							  System.out.println("Exception :"+e); 
							  }
						valSetOne.add(toDate);
						int i =29;
						int newv= content.split(";").length-1;
					
						do {
						Object stringval = value[newv];
							
							if(stringval.toString().equals("Pending")){
								if(i==29)
									i=0;
								valSetOne.add("isPOD");
								
								
						}
							else if(stringval.toString().equals("N/A")) {
								if(i==29)
									i=0;
								valSetOne.add("NotaPOD");				
								
							}
									
						}
					
							while(newv-- == i--) ;


				        	map.put(invoiceNo, valSetOne);
				        	count++;

				        	 System.out.println(map);
				        }					
				}
				count=0;
				 nullval = content = br.readLine();
				 System.out.println(nullval);
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
