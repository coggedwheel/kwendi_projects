import java.util.ArrayList;
import java.util.List;



public class CQuestion {

	
	private List<CQuestAnswer> lstItems;
	private String sCaption;
	private enmViewType vtViewType;
	 
	//String question ID. Questionnaire navigation use it, MUST be unique!!!
	private String sID;   
	

	public CQuestion(){
		setItemsList(new ArrayList<CQuestAnswer>());	
	}
	
	// нужен ли этот метод???
	public List<CQuestAnswer> getItemsList() {
		return lstItems;
	}

	// записываем сразу весь список ответов
	public void setItemsList(List<CQuestAnswer> lstItems) {
		
		this.lstItems = lstItems;

/*
		this.lstItems.clear();
		
		for (int i=0; i<lstItems.size()-1; i++){
			this.lstItems.add(lstItems.get(i));
		}
*/
	}
	
	// добавляем один элемент в список 
	public boolean AddItem(CQuestAnswer qaNew){
		return lstItems.add(qaNew);
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
