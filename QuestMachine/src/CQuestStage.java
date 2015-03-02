import java.util.ArrayList;
import java.util.List;


public class CQuestStage {

	// fields
	private String sCaption;
	private List<CQuestion> lstQuestions;
	private enmViewType vtViewType;
	
	//String question ID. Questionnaire navigation use it, MUST be unique!!!
	private String sID;   	
	
	public CQuestStage(){
		lstQuestions = new ArrayList<CQuestion>();
	}
	
	// добавляем один элемент в список 
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
	
	public void setViewType(enmViewType vtViewType){
		this.vtViewType = vtViewType;
	}
	
	public enmViewType getViewType(){
		return this.vtViewType;
	}

}
