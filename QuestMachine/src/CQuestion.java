import java.util.ArrayList;
import java.util.List;



public class CQuestion {
	
	private List<CQuestAnswer> lstItems; 	//List of alternatives
	private String sCaption; 				//Text of the question 
	private String sID; 					//String question ID. Questionnaire navigation use it, MUST be unique!!!   
	

	public CQuestion(){
		lstItems= new ArrayList<CQuestAnswer>();	
	} 
	// p ip
	// Copy constructor
	public CQuestion(CQuestion qstSrc){

		lstItems= new ArrayList<CQuestAnswer>();
		
		sCaption = qstSrc.sCaption;
		sID = qstSrc.sID;
		lstItems.addAll(qstSrc.lstItems);	
		
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
