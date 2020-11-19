package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.codehaus.jackson.map.ObjectMapper;

public class BufferReading {
	private static final String FILENAME = "C:\\Users\\akrishn3\\Downloads\\ZRDE_P07_20200914_110523 (5).txt";

	private static String invoiceNo;

	public static void main(String[] args) {
		String content;
		int count = 0;
		HashMap<String, String> map = new HashMap<String, String>();
		ObjectMapper objectMapper = new ObjectMapper();
		CIAfileReader cIAfileReader = new CIAfileReader();
		try {
			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
				System.out.println(br);
				while ((content = br.readLine()) != null) {

					if (content != null && content.split(";").length > 2) {
						String[] value = content.split(";");
						invoiceNo = value[2];
						if (count != 0) {
							map.clear();
						}
						String year = value[0];
						cIAfileReader.setYear(Integer.parseInt(year));
						String LegalEntity = value[1];
						cIAfileReader.setLegalentity(LegalEntity);
						String company = value[3];
						cIAfileReader.setCompany(company);
						String toDate = value[11];
						cIAfileReader.setTodate(toDate);
						try {
							String str_date = (String) toDate;
							DateFormat formatter;
							Date date;
							formatter = new SimpleDateFormat("dd/MM/yyy");
							date = (Date) formatter.parse(str_date);
							long longDate = date.getTime();		
							cIAfileReader.setLongToDate(longDate);
						} catch (ParseException e) {
							System.out.println("Exception :" + e);
						}
					
						int i = 29;
						int newv = content.split(";").length - 1;
						do {
							Object stringval = value[newv];

							if (stringval.toString().equals("Pending")) {
								if (i == 29)
									i = 0;
								cIAfileReader.SetPOD("TRUE");

							} else if (stringval.toString().equals("N/A")) {
								if (i == 29)
									i = 0;
								cIAfileReader.SetPOD("FALSE");
							}

						} while (newv-- == i--);
						ObjectMapper Obj = new ObjectMapper();
						String jsonStr = Obj.writeValueAsString(cIAfileReader);
						map.put(invoiceNo, jsonStr);
						System.out.println(map);
						count++;

					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
