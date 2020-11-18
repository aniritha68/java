package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCIAFile {
	private static final String FILENAME = "C:\\Users\\akrishn3\\Downloads\\ZRDE_P07_20200914_110523 (5).txt";
	private static final String String = null;
	private static String Object;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		List<Object> valSetOne = new ArrayList<>();
		String content;
		String invoiceNo;

		try {
			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
				System.out.println(br);
				while ((content = br.readLine()) != null) {
					if (content != null && content.split(";").length == 30) {
						String[] value = content.split(";");
						invoiceNo = value[2];
						Object year = value[0];
						valSetOne.add(year);
						Object LegalEntity = value[1];
						valSetOne.add(LegalEntity);
						Object toDate = value[11];
						Object fromDate = value[12];
						DatetoLong(toDate.toString());
						for (Object val : valSetOne) {
							map.put(invoiceNo, val);
						}
						System.out.println(map);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Object DatetoLong(String toDate) {

		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			Date d = f.parse(toDate);
			long milliseconds = d.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return toDate;

	}

}
