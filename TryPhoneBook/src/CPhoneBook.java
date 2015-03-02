import java.util.*;


public class CPhoneBook {

	public List<CPhBMember> lstMembers;
	
	public CPhoneBook(){
		lstMembers = new ArrayList<CPhBMember>();
	}
	
	public void AddMember(CPhBMember memNew){
		
		CPhBMember memTmp = new CPhBMember();
		memTmp.sName = memNew.sName;
		memTmp.sEmail = memNew.sEmail;
		
		
		memTmp.lstNumbers.addAll(memNew.lstNumbers);		
		lstMembers.add(memTmp);
		
	}
}
