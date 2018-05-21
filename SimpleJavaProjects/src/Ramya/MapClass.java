package Ramya;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> mapme = new HashMap<>();
		mapme.put("companyName", "Solutions");
		System.out.println(mapme.get("companyName"));
		
	}

}
