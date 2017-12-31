package model;



public class NoiDungCauHoi {
	int QuestionId, KindId;
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public int getKindId() {
		return KindId;
	}
	public void setKindId(int kindId) {
		KindId = kindId;
	}
	public String getQuestionContent() {
		return QuestionContent;
	}
	public void setQuestionContent(String questionContent) {
		QuestionContent = questionContent;
	}
	String QuestionContent,KindName;
	public String getKindName() {
		return KindName;
	}
	public void setKindName(String kindName) {
		KindName = kindName;
	}
	public NoiDungCauHoi(int QuestionId, String QuestionContent, int KindId,String KindName){
		this.QuestionId = QuestionId;
		this.QuestionContent = QuestionContent;
		this.KindId = KindId;
		this.KindName = KindName;
	}
	public NoiDungCauHoi() {
		
	}
}
