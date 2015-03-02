import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class CQuestionnaire {

	// fields
	private String sCaption;
	private List<CQuestStage> lstStages;
	
	public CQuestionnaire(){
		setStagesList (new ArrayList<CQuestStage>());
	}
	
	//methods
	public void setStagesList(List<CQuestStage> lstStages){
		this.lstStages = lstStages;
	}
	
	public List<CQuestStage> getStagesList(){
		return this.lstStages;
	}

	public boolean AddStage(CQuestStage qstNew){
		return lstStages.add(qstNew);
	}
	
	public String getCaption() {
		return sCaption;
	}
	
	public void setCaption(String sCaption) {
		this.sCaption = sCaption;
	}

	
	// находит stage с заданным ID и возвращает его
	public CQuestStage GetStageByID(String sID){
		
		ListIterator<CQuestStage> it = lstStages.listIterator(); 
		
		boolean bFind = false;
		
		while(it.hasNext() && bFind==false){
			
			CQuestStage st = it.next();
			if (st.getCaption()==sID){
				bFind = true;				
			}
			
		}
		
		if (bFind){
		
			return (CQuestStage) it.previous();
			
		}
		else {
			
			return null;
		}

		
	}
		
}
