package OnGiuaHKI;

public class HocPhan {
	private String mahp;
	private String namehp;
	private float diemhp;
	private int sotc;
	public HocPhan() {
		
	}
	public HocPhan(String mahp, String namehp, float diemhp, int sotc) {
		this.diemhp=diemhp;
		this.mahp=mahp;
		this.namehp=namehp;
		this.sotc=sotc;
	}
	public int getSotc() {
		return sotc;
	}
	public void setSotc(int sotc) {
		this.sotc = sotc;
	}
	public String getMahp() {
		return mahp;
	}
	public void setMahp(String mahp) {
		this.mahp = mahp;
	}
	public String getNamehp() {
		return namehp;
	}
	public void setNamehp(String namehp) {
		this.namehp = namehp;
	}
	public float getDiemhp() {
		return diemhp;
	}
	public void setDiemhp(float diemhp) {
		this.diemhp = diemhp;
	}
	
}
