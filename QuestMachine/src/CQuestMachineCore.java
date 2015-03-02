


public class CQuestMachineCore{

	public static void main(String[] args ){

		CQuestionnaire qnrMain = new CQuestionnaire();
		InitQuestionnaire(qnrMain);
		ShowQuestionnaire(qnrMain);
		
	}

	
	public static void InitQuestionnaire(CQuestionnaire qnrNew){
		
		CQuestAnswer qa  = new CQuestAnswer();
		CQuestion qstNew = new CQuestion();
		CQuestStage stgNew = new CQuestStage();
		
		//--------------------------------------------------------
		qa.sCaption = "Yes";
		qa.nValue = 0;
		qstNew.AddItem(qa);
		
		qa.sCaption = "No";
		qa.nValue = 1;
		qstNew.AddItem(qa);
		

		qstNew.setCaption("Qustion #1");
		qstNew.setID("sA1.1");
		
		
		stgNew.setID("A1");
		stgNew.AddQuestion(qstNew);
		stgNew.setCaption("Stage #1");
		
		qnrNew.AddStage(stgNew);

		
		//--------------------------------------------------------
		qa.sCaption = "Never";
		qa.nValue = 0;
		qstNew.AddItem(qa);
		
		qa.sCaption = "Probably no";
		qa.nValue = 1;
		qstNew.AddItem(qa);

		qa.sCaption = "May be";
		qa.nValue = 2;
		qstNew.AddItem(qa);
		
		qa.sCaption = "Of course";
		qa.nValue = 3;
		qstNew.AddItem(qa);



		qstNew.setCaption("Qustion #2");
		qstNew.setID("sA2.1");
		//qstNew.setViewType(enmViewType.VT_COMBO);
		
		stgNew.setID("A2");
		stgNew.AddQuestion(qstNew);		
		stgNew.setCaption("Stage #2");
		
		qnrNew.AddStage(stgNew);		
	}
	
	public static void ShowQuestionnaire(CQuestionnaire qnrNew){
		
		System.out.println(qnrNew.GetStageByID("A1").getCaption());
		System.out.println("\n");
		System.out.println(qnrNew.GetStageByID("A2").getCaption());
		
	}
	
}
