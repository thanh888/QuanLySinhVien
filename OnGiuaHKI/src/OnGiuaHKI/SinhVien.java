package OnGiuaHKI;

public class SinhVien {
	private String id;
	private String namesv;
	private int sohp;
	HocPhan[] list;
	
	public SinhVien() {
		
	}
	public SinhVien(String id, String namesv, int sohp, HocPhan[] list) {
		this.id=id;
		this.list=list;
		this.namesv=namesv;
		this.sohp=sohp;
	}
	public float DiemTB() {
		float tongdiem=0;
		int tongtc=0;
		for(int i=0;i<sohp;i++) {
			tongdiem+=this.list[i].getDiemhp()*this.list[i].getSotc();
			tongtc+=this.list[i].getSotc();
		}
		return tongdiem/tongtc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNamesv() {
		return namesv;
	}
	public void setNamesv(String namesv) {
		this.namesv = namesv;
	}
	public int getSohp() {
		return sohp;
	}
	public void setSohp(int sohp) {
		this.sohp = sohp;
	}
	public HocPhan[] getList() {
		return list;
	}
	public void setList(HocPhan[] list) {
		this.list = list;
	}
	
}
