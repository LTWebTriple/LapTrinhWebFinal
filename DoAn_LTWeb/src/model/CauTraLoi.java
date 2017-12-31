package model;

public class CauTraLoi {
	int AnswerId, QuestionId, IsTrue,IsCheck = 0;
	String AnswerContent;
	
	public CauTraLoi(int AnswerId, String AnswerContent, int QuestionId, int IsTrue) {
		this.AnswerId = AnswerId;
		this.AnswerContent = AnswerContent;
		this.QuestionId = QuestionId;
		this.IsTrue = IsTrue;
	}

	public int getAnswerId() {
		return AnswerId;
	}

	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public int getIsTrue() {
		return IsTrue;
	}

	public void setIsTrue(int isTrue) {
		IsTrue = isTrue;
	}

	public String getAnswerContent() {
		return AnswerContent;
	}

	public void setAnswerContent(String answerContent) {
		AnswerContent = answerContent;
	}

	
}
