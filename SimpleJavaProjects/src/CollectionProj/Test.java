package CollectionProj;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> names = new ArrayList<>();
        names.add("Amu");
        names.add("hhh");
        names.add("hihihi");
        names.add(null);
        System.out.println(names.contains("hihihi"));
        System.out.println(names.getClass().getConstructors());
        
        
        for(String str:names) {
        	System.out.println(str);
        	//System.out.println(names.size());
        }
	}

}
