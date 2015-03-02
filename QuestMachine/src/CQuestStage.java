import java.util.ArrayList;
import java.util.List;


public class CQuestStage {

	// fields
	private String sCaption;
	private List<CQuestion> lstQuestions;
	
	//String question ID. Questionnaire navigation use it, MUST be unique!!!
	private String sID;   	
	
	public CQuestStage(){
		setQuestionsList (new ArrayList<CQuestion>());
	}
	
	//methods
	public void setQuestionsList(List<CQuestion> lstQuestions){
		this.lstQuestions = lstQuestions;
	}
	
	public List<CQuestion> getQuestionsList(){
		return this.lstQuestions;
	}
	
	// добавляем один элемент в список 
	public boolean AddItem(CQuestion qstNew){
		return lstQuestions.add(qstNew);
	}
	
	
	public boolean AddQuestion(CQuestion qstNew){
		return lstQuestions.add(qstNew);
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
