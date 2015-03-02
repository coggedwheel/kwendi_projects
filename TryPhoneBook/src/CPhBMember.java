import java.util.*;


public class CPhBMember {
	
	public List<CPhoneNumber> lstNumbers;
	public String sName;
	public String sEmail;
	
	public CPhBMember (){
		lstNumbers = new ArrayList<CPhoneNumber>();
	}

	public CPhBMember(CPhBMember memAdd){
		sName = memAdd.sName;
		sEmail = memAdd.sEmail;
		
		lstNumbers.addAll(memAdd.lstNumbers);
	}
	
	public void AddNumber(CPhoneNumber phNumber){
		
		CPhoneNumber phNew = new CPhoneNumber(phNumber);
		lstNumbers.add(phNew);
	}
	
	public void AddNumber(enmNumberType enmType, String sNumber ){
		
		CPhoneNumber phNew = new CPhoneNumber();
		phNew.ntType = enmType;
		phNew.sPhoneNumber = sNumber;
		
		lstNumbers.add(phNew);
	}
	
}
