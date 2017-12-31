package model;

public class Result {
	String ResultId,UserId,Point,SubjectId,SubjectName;
	public Result() {
		
	}
	public Result(String ResultId,String UserId,String Point,String SubjectId,String SubjectName) {
		this.UserId = UserId;
		this.ResultId = ResultId;
		this.Point = Point;
		this.SubjectId = SubjectId;
		this.SubjectName = SubjectName;
	}
	public String getResultId() {
		return ResultId;
	}

	public void setResultId(String resultId) {
		ResultId = resultId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPoint() {
		return Point;
	}

	public void setPoint(String point) {
		Point = point;
	}

	public String getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(String subjectId) {
		SubjectId = subjectId;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
}
