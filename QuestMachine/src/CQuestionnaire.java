import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class CQuestionnaire {

	// fields
	private List<CQuestStage> lstStages;
	
	public CQuestionnaire(){
		lstStages = new ArrayList<CQuestStage>();
	}

	// Copy constructor
	public CQuestionnaire(CQuestionnaire qnrSrc){
		
		lstStages = new ArrayList<CQuestStage>();
		
		lstStages.addAll(qnrSrc.lstStages);
	}
	
	
	//methods

	public boolean AddStage(CQuestStage stgNew){
		
		CQuestStage stgTmp = new CQuestStage(stgNew);
		return lstStages.add(stgTmp);
		
	}

	
	// ������� stage � �������� ID � ���������� ���
	public CQuestStage GetStageByID(String sID){
		
		CQuestStage stReturn = null;
		
		ListIterator<CQuestStage> it = lstStages.listIterator(); 
		boolean bFind = false;
		
		while(it.hasNext() && bFind==false){
			
			stReturn = it.next();
			
			if (stReturn.getID()==sID){
				bFind = true;				
			}
		}
		
		return stReturn;
		
	}
		
}
