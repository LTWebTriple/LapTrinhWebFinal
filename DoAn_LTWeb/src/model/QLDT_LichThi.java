package model;

public class QLDT_LichThi {
	private String SubjectId;
	private String SubjectName;
	private String TestId;
	private String TestName;
	private String TimeStart;
	private String TimeClose;


	public QLDT_LichThi(){
	}

	public QLDT_LichThi(String SubjectId, String SubjectName, String TestId, String TestName, String TimeStart, String TimeClose) {
		this.TestId = TestId;
		this.TestName = TestName;
		this.SubjectId = SubjectId;
		this.SubjectName = SubjectName;
		this.TimeStart = TimeStart;
		this.TimeClose = TimeClose;
	}
	
	public String getTestId() {
		return TestId;
	}

	public void setTestId(String TestId) {
		this.TestId = TestId;
	}
	
	public String getTestName() {
		return TestName;
	}

	public void setTestName(String TestName) {
		this.TestName = TestName;
	}

	public String getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(String SubjectId) {
		this.SubjectId = SubjectId;
	}
	
	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String SubjectName) {
		this.SubjectName = SubjectName;
	}
	
	public String getTimeStart() {
		return TimeStart;
	}

	public void setTimeStart(String TimeStart) {
		this.TimeStart = TimeStart;
	}
	
	public String getTimeClose() {
		return TimeClose;
	}

	public void setTimeClose(String TimeClose) {
		this.TimeClose = TimeClose;
	}
}
