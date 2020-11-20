package decodeURLComponent;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DecodeDoublebyteURL {

	public static void main(String[] args) {

		String url = "風ADF12396-*/~`@風^&.,;'?/風";

		String val = encodeanddecode(url);
		System.out.println(val);
	}

	public static String encodeanddecode(String url) {
		String encodedUrl = "";
		String val = "";
		String vals = "";
		int count =0;

		try {

			for (int i = 0; i < url.length(); i++) {
				if(count ==1)
					break;
				System.out.println(url.codePointAt(i));
				if (url.codePointAt(i) > 12200) {
					System.out.println(url.codePointAt(i));
					val = url.substring(i);				
					encodedUrl = URLEncoder.encode(val, "UTF-8");
					vals = url.replace(val, encodedUrl);
					
		count++;
				}
				
			}

		} catch (UnsupportedEncodingException | StringIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
	
		return vals;

	}
}
