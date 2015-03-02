
public class CQuestAnswer {

	public String sCaption;
	public int nValue;

	public CQuestAnswer(){
		sCaption = "";
		nValue = -1;
	}
	
	public CQuestAnswer(CQuestAnswer qaSrc){
		sCaption = qaSrc.sCaption;
		nValue = qaSrc.nValue;
	}
}
