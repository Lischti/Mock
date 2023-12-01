package swen.testing.pzn;

public class SearchPzn {
	public static final String UNDEFINED = "Undefined PZN";
	
	private PznService service = new PznService();
	
	public String search(String pzn) {
		if (pzn == null || pzn.isEmpty() || pzn.trim().length()!=8)
			return UNDEFINED;
		
		String result = service.getNameOfDrug(pzn);
		
	
		 
		return(result);
	}

}
