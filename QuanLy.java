package extend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
	ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
	static Scanner sc = new Scanner(System.in);

	public void input() {
		int num;

		System.out.println("Nhap sp luong sinh vien: ");
		num = sc.nextInt();
		sc.nextLine();
		SinhVien[] sv1 = new SinhVien[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
			System.out.println("Nhap ID sinh vien: ");
			String id = sc.nextLine();
			System.out.println("Nhap ten sinh vien: ");
			String name = sc.nextLine();
			System.out.println("Nhap so mon da hoc: ");
			int n = Integer.parseInt(sc.nextLine());
			HocPhan[] list = new HocPhan[n];
			for (int j = 0; j < n; j++) {
				System.out.println("Nhap thong tin hoc phan thu " + (j + 1));
				System.out.println("Nhap id hoc phan: ");
				String idhp = (sc.nextLine());
				System.out.println("Nhap ten hoc phan: ");
				String tenhp = sc.nextLine();
				System.out.println("Nhap so tin chi: ");
				int sotc = Integer.parseInt(sc.nextLine());
				System.out.println("Nhap diem hoc phan: ");
				float diemhp = Float.parseFloat(sc.nextLine());
				list[j] = new HocPhan(idhp, tenhp, sotc, diemhp);
			}
			sv1[i] = new SinhVien(id, name, n, list);
			sv.add(sv1[i]);

		}

	}

	public void xuat() {
		for (SinhVien e : sv) {
			System.out.println("Ten Sinh Vien: " + e.getName());
			System.out.println("ID: " + e.getId());
			System.out.println("Diem Trung Binh: " + e.agv());
		}
	}

	public void sortagv() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				Float a = Float.valueOf(sv1.agv());
				Float b = Float.valueOf(sv2.agv());
				return a.compareTo(b);
			}

		});
	}

	public void sorttc() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				Integer a = Integer.valueOf(sv1.Stc());
				Integer b = Integer.valueOf(sv2.Stc());
				return a.compareTo(b);
			}

		});
	}
	public void sxTCgd() {
		Collections.sort(sv, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				Integer a= Integer.valueOf(sv1.Stc());
				Integer b= Integer.valueOf(sv2.Stc());
				return b.compareTo(a);
			}
		});
	}

		public void timhp() {
			System.out.println("Nhap ten hoc phan can tim: ");
			String namehp=sc.nextLine();
			System.out.println("5. Danh sach sinh vien co cung hoc phan: ");
			for (SinhVien e : sv) {
				for(int i=0; i<e.getN();i++) {
					if (e.getList()[i].getTenhp().equals(namehp)) {
						System.out.println("Ten sinh vien: "+e.getName());
						System.out.println("ID: "+e.getId());
						System.out.println("Diem Trung Binh: "+e.agv());
						
					}
				}
				
			}
		}
	public void timTTtheoname() {
		System.out.println("Nhap ten sinh vien can tim: ");
		String namesv = sc.nextLine();
		System.out.println("6. Thong tin sinh vien duoc tim kiem: ");
		for (SinhVien e : sv) {

//			if (e.getName().indexOf(namesv) != -1) {
//				System.out.println("Ten sinh vien: " + e.getName());
//				System.out.println("ID: " + e.getId());
//				System.out.println("Diem Trung Binh: " + e.agv());
//			}
			if (e.getName().equals(namesv)) {
				System.out.println("Ten sinh vien: " + e.getName());
				System.out.println("ID: " + e.getId());
				System.out.println("Diem Trung Binh: " + e.agv());
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLy ql = new QuanLy();
		ql.input();
		System.out.println("1. Danh sach sinh vien");
		ql.xuat();
		System.out.println("-------------------------------------------------");
		System.out.println("2. Danh sach sinh vien diem trung binh tang dan");
		ql.sortagv();
		ql.xuat();
		System.out.println("-------------------------------------------------");
		System.out.println("3. Danh sach sinh vien co so luong tinh chi tang dan");
		ql.sorttc();
		ql.xuat();
		System.out.println("-------------------------------------------------");
		System.out.println("4. Danh sach sinh vien co so luong tinh chi giam dan");
		ql.sxTCgd();
		ql.xuat();
		System.out.println("-------------------------------------------------");	
		ql.timTTtheoname();
		System.out.println("-------------------------------------------------");
		ql.timhp();
	}

}
