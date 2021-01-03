package extend;

public class HocPhan {
	private String idhp;
	private String tenhp;
	private int sotc;
	private float diemhp;
	public HocPhan() {
		
	}
	public HocPhan(String idhp, String tenhp, int sotc, float diemhp ) {
		this.diemhp=diemhp;
		this.idhp=idhp;
		this.sotc=sotc;
		this.tenhp=tenhp;
	}
	public String getIdhp() {
		return idhp;
	}
	public void setIdhp(String idhp) {
		this.idhp = idhp;
	}
	public String getTenhp() {
		return tenhp;
	}
	public void setTenhp(String tenhp) {
		this.tenhp = tenhp;
	}
	public int getSotc() {
		return sotc;
	}
	public void setSotc(int sotc) {
		this.sotc = sotc;
	}
	public float getDiemhp() {
		return diemhp;
	}
	public void setDiemhp(float diemhp) {
		this.diemhp = diemhp;
	}
	
	
}
