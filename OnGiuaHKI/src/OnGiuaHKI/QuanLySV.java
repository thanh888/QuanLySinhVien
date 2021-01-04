package OnGiuaHKI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySV {
	ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
	Scanner sc= new Scanner(System.in);
	public void input() {
		System.out.println("Nhap so luong sinh vien: ");
		int n=Integer.parseInt(sc.nextLine());
		SinhVien sva[]= new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin sinh vien thu: "+(i+1));
			System.out.println("Nhap ID: ");
			String id= sc.nextLine();
			System.out.println("Nhap ten sinh vien: ");
			String namesv= sc.nextLine();
			System.out.println("Nhap so hoc phan: ");
			int sohp=Integer.parseInt(sc.nextLine());
			HocPhan list[]= new HocPhan[sohp];
			for(int j=0;j<sohp;j++) {
				System.out.println("Ma hoc phan: ");
				String mahp= sc.nextLine();
				System.out.println("Ten hoc phan: ");
				String namehp= sc.nextLine();
				System.out.println("So tin chi: ");
				int sotc=Integer.parseInt(sc.nextLine());
				System.out.println("Diem hoc phan: ");
				float diemhp= Float.parseFloat(sc.nextLine());
				list[j] = new HocPhan(mahp, namehp, diemhp, sotc); 
				
			}
			sva[i]= new SinhVien(id, namesv, sohp, list);
			sv.add(sva[i]);
		}
	
	}
	public void Show() {
		for (SinhVien a : sv) {
			System.out.println("ID sinh vien: "+a.getId());
			System.out.println("Ten sinh vien: "+a.getNamesv());
			System.out.println("Diem trung binh: "+a.DiemTB());
			System.out.println("================================================================");
			
		}
	}
	public void SortAGV() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				Float a=Float.valueOf(sv1.DiemTB());
				Float b=Float.valueOf(sv2.DiemTB());
				return b.compareTo(a);
			}
		});
	}
	public int TongTC(SinhVien a) {
		int tongtc=0;
		for(int i=0; i<a.getSohp();i++) {
			tongtc+=a.getList()[i].getSotc();
		}
		return tongtc;
	}
	public void SortSoTC() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				Integer a=Integer.valueOf(TongTC(sv1));
				Integer b=Integer.valueOf(TongTC(sv2));
				return a.compareTo(b);
			}
		});
	}
	public void TimTenSV() {
		System.out.println("Nhap ten sinh vien can tim: ");
		String num=sc.nextLine();
		for (SinhVien a : sv) {
			if(a.getNamesv().indexOf(num)!=-1) {
				System.out.println("ID sinh vien: "+a.getId());
				System.out.println("Ten sinh vien: "+a.getNamesv());
				System.out.println("Diem trung binh: "+a.DiemTB());
			}
			
		}
	}
	public void TimSVtheoHP() {
		System.out.println("Nhap ten hoc phan: ");
		String num= sc.nextLine();
		for (SinhVien a : sv) {
			for(int i=0;i<a.getSohp();i++) {
				if(a.list[i].getNamehp().indexOf(num)!=-1) {
					System.out.println("ID sinh vien: "+a.getId());
					System.out.println("Ten sinh vien: "+a.getNamesv());
					System.out.println("Diem trung binh: "+a.DiemTB());
				}
			}
		}
	}
	public void TimSVDiemMaxcungHP() {
		System.out.println("Nhap ten hoc phan: ");
		String num=sc.nextLine();
		float diem=0;
		for (SinhVien a : sv) {
			for(int i=0;i<a.getSohp();i++) {
				if((a.getList()[i].getNamehp().equals(num))&& (diem<=a.getList()[i].getDiemhp())) {
					System.out.println("ID sinh vien: "+a.getId());
					System.out.println("Ten sinh vien: "+a.getNamesv());
					System.out.println("Diem trung binh: "+a.DiemTB());
				}
			}
			
		}
	}
	public QuanLySV() {
		while(true) {
			System.out.println("*-CHUONG TRINH QUAN LY SINH VIEN-*");
			  System.out.println("*-Chuc nang chinh chuong trinh-*");
			  System.out.println("  1. Nhap danh sach sinh vien   ");
			  System.out.println("  2. Xem danh sach sinh vien   ");
			  System.out.println("  3. Sap xep danh sach sinh vien tang dan diem trung binh   ");
			  System.out.println("  4. Tim sinh vien theo ten   ");
			  System.out.println("  5. Hien thi tat ca sv hoc cung mot hoc phan   ");
			  System.out.println("  6. Sap xep sv giam dan theo so tin chi da hoc   ");
			  System.out.println("  7. Tim sinh vien co diem cao nhat trong 1 hoc phan   ");
			  System.out.println("  8. Thoat   ");
			  System.out.println("  -------------");
			System.out.println("Nhap chuc nang can thuc hien: ");
			int num=Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.println("\2--Nhap danh sach sinh vien-- ");
				input();
				System.out.println("\n");
				break;
			case 2:
				System.out.println("\2--Thong tin sinh vien--");
				Show();
				System.out.println("\n");
				break;
			case 3:
				System.out.println("\2--Danh sach sinh vien tang dan diem trung binh--");
				SortAGV();
				Show();
				System.out.println("\n");
				break;
			case 4:
				System.out.println("\2--Tim kiem sinh vien theo ten--");
				TimTenSV();
				System.out.println("\n");
				break;
			case 5:
				System.out.println("\2--Danh sach sinh vien hoc chung mot hoc phan--");
				TimSVtheoHP();
				System.out.println("\n");
				break;
			case 6:
				System.out.println("\2--Danh sach sinh vien giam dan theo so tin chi da hoc--");
				SortSoTC();
				Show();
				System.out.println("\n");
				break;
			case 7:
				System.out.println("\2--Danh sach sinh vien co diem cao nhat trong cung mot hoc phan--");
				TimSVDiemMaxcungHP();
				System.out.println("\n");
				break;
			case 8:
				System.out.println("-----Ket Thuc Chuong Trinh-----");
				return ;
				
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuanLySV();
	}

}
