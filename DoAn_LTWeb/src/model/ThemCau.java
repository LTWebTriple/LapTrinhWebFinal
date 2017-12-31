package model;

public class ThemCau {
	String NoiDung;
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public int getDapAn() {
		return DapAn;
	}
	public void setDapAn(int dapAn) {
		DapAn = dapAn;
	}
	int DapAn;
	public ThemCau(){
		
	}
public ThemCau(String NoiDung,int DapAn){
		this.NoiDung = NoiDung;
		this.DapAn = DapAn;
	}
}
