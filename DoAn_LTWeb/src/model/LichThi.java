package model;

public class LichThi {
	int UserId, SubjectId, TestId, Time_Test;
	String Time_Start, Time_Close, TestName,Date;


	int InTest;
	
	public LichThi(int UserId, int SubjectId, int TestId, String Time_Start, String Time_Close, String TestName, String Date, int Time_Test, int InTest) {
		this.UserId = UserId;
		this.SubjectId = SubjectId;
		this.TestId = TestId;
		this.Time_Start = Time_Start;
		this.Time_Close = Time_Close;
		this.TestName = TestName;
		this.Date = Date;
		this.Time_Test = Time_Test;
		this.InTest = InTest;
	}

	
	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	public int getSubjectId() {
		return SubjectId;
	}


	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}


	public int getTestId() {
		return TestId;
	}


	public void setTestId(int testId) {
		TestId = testId;
	}


	public String getTime_Start() {
		return Time_Start;
	}


	public void setTime_Start(String time_Start) {
		Time_Start = time_Start;
	}


	public String getTime_Close() {
		return Time_Close;
	}


	public void setTime_Close(String time_Close) {
		Time_Close = time_Close;
	}


	public String getTestName() {
		return TestName;
	}


	public void setTestName(String testName) {
		TestName = testName;
	}


	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getTime_Test() {
		return Time_Test;
	}

	public void setTime_Test(int time_Test) {
		Time_Test = time_Test;
	}

	public int getInTest() {
		return InTest;
	}

	public void setInTest(int inTest) {
		InTest = inTest;
	}
}
