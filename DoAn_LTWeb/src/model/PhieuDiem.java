package model;

public class PhieuDiem {
	String TestName, Date, TrueAnswer, AnswerSize;
	public String getTestName() {
		return TestName;
	}

	public void setTestName(String testName) {
		TestName = testName;
	}
	float Point;
	public PhieuDiem(String TestName, String Date, String TrueAnswer, String AnswerSize, float Point) {
		this.TestName = TestName;
		this.Date = Date;
		this.TrueAnswer = TrueAnswer;
		this.AnswerSize = AnswerSize;
		this.Point = Point;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTrueAnswer() {
		return TrueAnswer;
	}
	public void setTrueAnswer(String trueAnswer) {
		TrueAnswer = trueAnswer;
	}
	public String getAnswerSize() {
		return AnswerSize;
	}
	public void setAnswerSize(String answerSize) {
		AnswerSize = answerSize;
	}
	public float getPoint() {
		return Point;
	}
	public void setPoint(float point) {
		Point = point;
	}
}
