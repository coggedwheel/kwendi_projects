import java.util.*;


public class CMain {

	public static void main(String[] args ){
		
		CPhoneBook pbNew = new CPhoneBook();
		CPhBMember memNew = new CPhBMember();
		CPhoneNumber phNew = new CPhoneNumber();
		
		memNew.sName = "Petya";
		memNew.sEmail = "petya@gmail.com";
		
		memNew.AddNumber(enmNumberType.NT_MOBILE, "+38 050 111 22 33");
		
		phNew.ntType = enmNumberType.NT_HOME;
		phNew.sPhoneNumber  = "+38 044 222 33 11";
		memNew.AddNumber(phNew);
		
		pbNew.AddMember(memNew);
		
		
		memNew = new CPhBMember();
		
		memNew.sName = "Kolya";
		memNew.sEmail = "kolya@gmail.com";
		
		memNew.AddNumber(enmNumberType.NT_MOBILE, "+38 050 999 11 77");
		

		phNew.ntType = enmNumberType.NT_HOME;
		phNew.sPhoneNumber  = "+38 044 555 22 99";
		memNew.AddNumber(phNew);
		
		pbNew.AddMember(memNew);		
		
		
		//--------------------------------------------------
		
		Iterator<CPhBMember> itMembers = pbNew.lstMembers.iterator();	
		while(itMembers.hasNext()){
			
			CPhBMember pmTmp = (CPhBMember)itMembers.next();
			
			System.out.print(pmTmp.sName);
			System.out.print("\n");
			
			System.out.print(pmTmp.sEmail);
			System.out.print("\n");
			
			Iterator<CPhoneNumber> it = pmTmp.lstNumbers.iterator();
			
			while(it.hasNext()){
				
				CPhoneNumber phTmp = (CPhoneNumber)it.next();
				
				System.out.print(phTmp.ntType);
				System.out.print(": ");
				System.out.print(phTmp.sPhoneNumber);
				System.out.print("\n");
				
			}
			
			System.out.print("\n");
		}
	}
	
}
