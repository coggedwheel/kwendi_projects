import java.util.ArrayList;
import java.util.List;



public class CQuestion {
	
	private List<CQuestAnswer> lstItems;
	private String sCaption;
	
	 
	//String question ID. Questionnaire navigation use it, MUST be unique!!!
	private String sID;   
	

	public CQuestion(){
		lstItems= new ArrayList<CQuestAnswer>();	
	}
	
	// добавляем один элемент в список 
	public boolean AddItem(CQuestAnswer qaNew){
		CQuestAnswer qaTmp = new  CQuestAnswer(qaNew);
		return lstItems.add(qaTmp);
	}
	
	public String getCaption() {
		return sCaption;
	}
	
	public void setCaption(String sCaption) {
		this.sCaption = sCaption;
	}
	
	public String getID() {
		return sID;
	}

	public void setID(String sID) {
		this.sID = sID;
	}
	

}
