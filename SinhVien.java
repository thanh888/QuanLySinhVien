package extend;

public class SinhVien {
	int abc;
	private String id;
	private String name;
	private int n;
	private HocPhan[] list;
	public SinhVien() {
		
	}
	public SinhVien(String id, String name, int n, HocPhan[] list) {
		this.id=id;
		this.name=name;
		this.n=n;
		this.list=list;
		
	}
	public float agv() {
		float diem=0;
		int tc=0;
		for (int i=0;i<n;i++) {
			diem+=(this.list[i].getDiemhp() *this.list[i].getSotc());
			tc+=this.list[i].getSotc();
		}
		return diem/tc;
	}
	
	public int Stc() {
		int tongtc=0;
		for (int i=0;i<n;i++) {
			tongtc+=this.list[i].getSotc();
		}
		return tongtc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public HocPhan[] getList() {
		return list;
	}
	public void setList(HocPhan[] list) {
		this.list = list;
	}
	
}
