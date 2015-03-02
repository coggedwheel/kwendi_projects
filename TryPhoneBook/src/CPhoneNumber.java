
public class CPhoneNumber {

	public enmNumberType ntType;
	public String sPhoneNumber;
	
	
	public CPhoneNumber(){
		
		ntType = enmNumberType.NT_UNDEFINED;
		sPhoneNumber = "";
	}
	
	
	public CPhoneNumber(CPhoneNumber phAdd){
		
		ntType = phAdd.ntType;
		sPhoneNumber = phAdd.sPhoneNumber;
	}
}
