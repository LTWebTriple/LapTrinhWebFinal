package model;

import java.util.ArrayList;
import java.util.List;

public class CauHoi {
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
	String QuestionContent;
	List<CauTraLoi> CacCauTraLoi = new ArrayList<CauTraLoi>();
	public CauHoi(int QuestionId, String QuestionContent, int KindId, List<CauTraLoi> CacCauTraLoi) {
		this.QuestionId = QuestionId;
		this.QuestionContent = QuestionContent;
		this.KindId = KindId;
		this.CacCauTraLoi = CacCauTraLoi;
	}
	
	public List<CauTraLoi> getCacCauTraLoi() {
		return CacCauTraLoi;
	}
	public void setCacCauTraLoi(List<CauTraLoi> cacCauTraLoi) {
		CacCauTraLoi = cacCauTraLoi;
	}
}
