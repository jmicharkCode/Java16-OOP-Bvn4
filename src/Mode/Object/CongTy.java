package Mode.Object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objListNhanSu;

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DanhSachNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	public CongTy() {
		this.objListNhanSu = new DanhSachNhanSu();
	}

	public void nhap(Scanner scan) {
		System.out.println(
				"**************************************************************Nhap thong tin cong ty*************************************************************");
		System.out.print("Ten cong ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.print("Ma so thue: ");
		this.maSoThue = scan.nextLine();
		System.out.print("Doanh thu: ");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println(
				"*****************************************************************Thong tin cong ty************************************************************");
		System.out.println("Ten cong ty: " + this.tenCongTy + "\tMa so thue: " + this.maSoThue + "\tDoanh thu thang: "
				+ this.doanhThuThang);
		System.out.println(
				"**********************************************************************************************************************************************");
		this.objListNhanSu.xuat();
	}

	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCongTy() {
		this.tenCongTy = "Cybersoft-CyberLearn";
		this.maSoThue = "3928744";
		this.doanhThuThang = 435334f;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new NhanVienThuong("1", "Lan", "098372", 20);
		objListNhanSu.them(ns);
		// objListNhanSu.getListNhanSu().add(ns); neu khong lam them method them trong
		// class Danhsach ta se lam nhu nay de add
		ns = new NhanVienThuong("2", "Hung", "0df98372", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("3", "Viet", "09837fd2", 31);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("4", "An", "02398372", 25);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("5", "Tuyet", "0938372", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("6", "My", "0928372", 31);
		objListNhanSu.them(ns);

		ns = new TruongPhong("13", "TP Bo sung 1", "023982372", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("14", "TP Bo sung 2", "0232983424372", 21);
		objListNhanSu.them(ns);

		ns = new TruongPhong("8", "TP Mai", "02398372", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("9", "TP Luan", "023298372", 21);
		objListNhanSu.them(ns);
		ns = new TruongPhong("10", "TP Kiet", "023928372", 23);
		objListNhanSu.them(ns);

		ns = new GiamDoc("11", "GD Tien", "023938372", 19, 80);
		objListNhanSu.them(ns);
		ns = new GiamDoc("12", "GD Hue", "023938372", 21, 20);
		objListNhanSu.them(ns);
	}
	/*
	 * (I) Phan bo nhan vien ve phong ban, hay co nghia la chi dinh truong phong cho
	 * nhan vien 1.Duyet danh sach va kiem tra neu la NhanVienThuong 2.Show danhsach
	 * truong phong (ten + ma) 3.Co muon phan bo hay khong, chon 'y' de phan bo,
	 * chon 'n' de di tiep 4.Neu 'n' di tiep den nhan vien tiep theo 5/Neu 'y' yeu
	 * cau nhap ma truong phong da lien o tren 6/Kiem tra xem ma nahp co nam trong
	 * danh sach ma truong phong liet ke tren khong 7/Neu co: lay truong phong voi
	 * ma da chon buoc 5 -> lay object truong phong 8/Gan truong phong lay tren cho
	 * Nhan vien dang duyet 9/Neu khong: lap lai buoc 5 10. Tang so luong nhan vien
	 * duoi quyen cho truong phong do
	 * 
	 * --> can viet 2 phuong thuc, 1 phuong thuc de show danh sach truong phong, mot
	 * method de kiem tra co nam trnog dnah sach khong
	 */

// ***** Code for selection 2:

	// Bam 1 de phan bo cho lan luot tung nhan vien
	// Bam 2 de phan bo cho nhan vien theo ma so nhap
	public void chonCachPhanBo() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Chon 1: Phan bo cho lan luot tung nhan vien");
			System.out.println("Chon 2: Phan bo nhan vien theo ma so nhap");
			System.out.println("Chon 0: Thoat;");
			int choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				phanBoNhanVienThuong();
				break;
			case 2:
				phanBoNhanVienThuongTheoMaSo();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhap theo huong dan");
				break;
			}

		} while (flag);
	}

	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				// buoc 2:
				// IN ra thong bao ten va ma cua nhanv ien thuong de biet phan bo
				System.out.println("Dang phan bo cho nhan vien: ");
				ns.xuatMaVaTen();
				phanBoChoMotNhanSu(scan, ns);
			}
		}
	}

	public void phanBoNhanVienThuongTheoMaSo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ma so nhan vien can phan bo: ");
		String maSo = scan.nextLine();

		NhanSu nhanSuTimDuoc = timNhanSuTheoMa(maSo);

		if (nhanSuTimDuoc != null) {
			if (nhanSuTimDuoc instanceof TruongPhong || nhanSuTimDuoc instanceof GiamDoc)
				System.out.println("Nhan su nay k phai la nhan vien thuong. Khong the phan bo");
			else
				phanBoChoMotNhanSu(scan, nhanSuTimDuoc);
		} else {
			System.out.println("Khong co nhan vien nay!");
		}
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		showMaVaTenTPhong();
		boolean flag = true;
		do {
			// Buoc 3
			System.out.println("Chon 1 de phan bo hoac chon 2 de di tiep.");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) { // Buoc 5
					TruongPhong tp = chonTruongPhong(scan);
					// Buoc 7 da co truong phong luu tai bien tp
					// buoc 8
					((NhanVienThuong) ns).setTruongPhong(tp);
					// buoc 10
					tp.tangNhanVien();
				}
				// Buoc 4
				flag = false; // khi chon 2 tu dong nhay xuong day va huy
			} else {
				System.out.println("Chi dc nhap 1 hoac 2");
				flag = true;
			}
		} while (flag);
	}
// End code for Selection 2

// Code for chuc nang voi truong phong
// ***********************************
// ***********************************
	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {
			System.out.println("vui long chon Ma TP da liet ke tren");
			String chonMa = scan.nextLine();
			// Buoc 6 : kiem tra
			tp = timTruongPhongTheoMa(chonMa);
		} while (tp == null);
		return tp;
	}

	private void showMaVaTenTPhong() {
		System.out.println("*******Danh Sach Truong Phong*******");
		ArrayList<TruongPhong> list = layDSTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
		System.out.println("====================================");
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen(); // phai dat method nay o class nhan su
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tphong = null; // chua tim thay
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().compareTo(ma) == 0) {
					tphong = (TruongPhong) ns;
				}
			}
		}
		return tphong;
	}

	public ArrayList<TruongPhong> layDSTruongPhong() { // dung de luu san 1 danh sach truong phong cho tien
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

// End code voi TP
// *****************************
// *****************************

//Code for selection 3: Them hoac xoa Nhan Su
//**************
//***************
//***************
	public void doThemHoacXoa() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Chon 1: Xoa nhan su");
			System.out.println("Chon 2: Them nhan su");
			System.out.println("Chon 0: Thoat;");
			int choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				xoaNhanSu(scan);
				break;
			case 2:
				themNhanSu(scan);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhap theo huong dan");
				break;
			}

		} while (flag);
	}

	public void themNhanSu(Scanner scan) {
		System.out.println("******** Chuc nang them nhan su ********");
		this.objListNhanSu.themNhanSu(scan);
	}

	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false; // chua xoa
		System.out.println("***********Xoa nhan su*********");
		System.out.println("Vui long nhap Ma nhan su can xoa");
		String maXoa = scan.nextLine();
		NhanSu nhanSu = timNhanSuTheoMa(maXoa);
		if (nhanSu != null) {
			// Neu xoa truong phong
			if (nhanSu instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			}
			// Neu xoa Nhan Vien Thuong
			else if (nhanSu instanceof NhanVienThuong) {
				deleted = xoaNhanVienThuong((NhanVienThuong) nhanSu);
			}
			// Neu xoa giam doc
			else {
				this.objListNhanSu.getListNhanSu().remove((GiamDoc) nhanSu);
			}
		} else {
			System.out.println("Ma nhan su ban vua nhap khong co trong danh sach");
		}
		return deleted;
	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null; // chua tim thay
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}

	// Xoa truong phong
	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false; // chua xoa
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaSo().equalsIgnoreCase(tPhongNVThuong.getMaSo())) {
						((NhanVienThuong) ns).setTruongPhong(null);
					}
				}
			}
		}
		// sau khi duyet eht nahn su trong mang nhugn nvt duoi su quan ly cua tp can xoa
		// deu da dc setTP = null
		this.objListNhanSu.getListNhanSu().remove(tp);
		deleted = true; // xoa thanh cong
		return deleted;
	}

	// Xoa NhanVienThuong
	public boolean xoaNhanVienThuong(NhanVienThuong nvt) {
		boolean deleted = false; // xoa chua thanh cong
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamNhanVien();
		}
		this.objListNhanSu.getListNhanSu().remove(nvt);
		deleted = true;
		return deleted;
	}
// End code for Selection 3

// Code for Selection 5
//*****************************************************
//*****************************************************
	public float xuatTongLuongToanCongTy() {
		this.objListNhanSu.tinhLuong();
		float sum = 0;
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			sum += ns.getLuong();
		}
		return sum;
	}
// End code for Selection 5

//  Code for Selection 6	
// *****************************************************
// *****************************************************

	// Xu ly cho cong viec tim nhan vien thuong co luong cao nhat
	public ArrayList<NhanVienThuong> listDSNVTLuongCaoNhat() {
		ArrayList<NhanVienThuong> list = new ArrayList<NhanVienThuong>();
		// 1. tim nvt dau tien trong ds nhan su
		NhanVienThuong nvt = null; // chua tim thay
		int indexMax = 0;
		int viTri = 0;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof NhanVienThuong) {
				nvt = (NhanVienThuong) ns;
				break;
			}
		}
		// 2. neu co thi cho nvt vua tim trnog buoc 1 la nvt co luong cao nhat
		if (nvt != null) {
			// 3. duyet danh sach tu vi tri vua tim o buoc 2 va tim nvt co luong that su cao
			// nhat
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() > nvt.getLuong()) {
						nvt = (NhanVienThuong) current;
						viTri = indexMax;
					}
				}
				indexMax++;
			}
			// 4. duyet lai ds va so sanh luong cua nvt dang duyet voi nvt max thuc su o
			// buoc 3 -> them vao danh sach
			for (int i = viTri - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() == nvt.getLuong()) {
						list.add((NhanVienThuong) current);
					}
				}
			}
		}

		return list;
	}

	public void lietKeDanhSachNVTCoLuongCaoNhat() {
		ArrayList<NhanVienThuong> list = new ArrayList<NhanVienThuong>();
		list = listDSNVTLuongCaoNhat();
		if (list.size() == 0) {
			System.out.println("-----> Cong ty khong co nhan vien thuong!");
		} else {
			for (NhanVienThuong nvt : list)
				nvt.xuat();
		}
	}

// End code for Selection 6
// *********************************************
// ***********************************************

// Code for Selection 7
// ********************************************************
// ********************************************************

	public ArrayList<TruongPhong> listTruongPhongCoNhieuNVDuoiQuyen() {
		ArrayList<TruongPhong> listTP = layDSTruongPhong();
		if (listTP.size() != 0) {
			TruongPhong tp = listTP.get(0);
			int indexFirst = 0;
			int index = 0;

			// Tim vi tri truong phong co nhieu nhan vien duoi quyen naht dau tien
			for (TruongPhong tpFirst : listTP) {
				index++;
				if (tpFirst.getSoNhanVienDuoiQuyen() > tp.getSoNhanVienDuoiQuyen()) {
					tp = tpFirst;
					indexFirst = index - 1;
				}
			}

			// lam 1 list moi de luu danh sach trong phong co nhieu nahn vien duoi quyen
			ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
			for (int i = indexFirst; i < listTP.size(); i++) {
				if (listTP.get(i).getSoNhanVienDuoiQuyen() == listTP.get(indexFirst).getSoNhanVienDuoiQuyen())
					list.add(listTP.get(i));
			}

			return list;
		} else
			return null;
	}

	public void lietKeTruongPhongCoNhieuNVDuoiQuyen() {
		ArrayList<TruongPhong> listTPNhieuNhanVien = new ArrayList<TruongPhong>();
		listTPNhieuNhanVien = listTruongPhongCoNhieuNVDuoiQuyen();

		if (listTPNhieuNhanVien == null)
			System.out.println(
					"--------> Cac truong phong deu khong co nhan vien duoi quyen hoac chua co truong phong nao trong cong ty");
		else {
			System.out.println(
					"********************************************Cac truong phong co so luong nhan vien duoi quyen nhieu nhat*********************************");
			for (TruongPhong tp : listTPNhieuNhanVien) {
				tp.xuatMaVaTen();
			}
		}
	}

// End code for Selection 7
// ********************************************************
// ********************************************************

// Code for Selection 8
// ********************************************************
// ********************************************************

	private void interchangeSort(ArrayList<NhanSu> _list) {
		int i;
		int j;
		for (i = 0; i < _list.size() - 1; i++) {
			for (j = i + 1; j < _list.size(); j++) {
				NhanSu personI = _list.get(i);
				NhanSu personJ = _list.get(j);
				if (personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}

	public void sortName() {
		interchangeSort(this.objListNhanSu.getListNhanSu());
	}

// End code for Selection 9
// ********************************************************
// ********************************************************

// 9. Sap xep nhan vien toan cong ty theo thu tu luong giam dan

	private void interChangeSortSalary(ArrayList<NhanSu> listSalary) {
		int i;
		int j;
		for (i = 0; i < listSalary.size(); i++) {
			for (j = i + 1; j < listSalary.size(); j++) {
				NhanSu personI = listSalary.get(i);
				NhanSu personJ = listSalary.get(j);
				if (personI.getLuong() < personJ.getLuong()) {
					Collections.swap(listSalary, i, j);
				}
			}
		}
	}

	public void sortSalary() {
		interChangeSortSalary(this.objListNhanSu.getListNhanSu());
	}

// Code for Selection 9
// ********************************************************
// ********************************************************

// Code lay danh sach giam doc ho tro cho selection 10 va 11
	public ArrayList<GiamDoc> layDSGiamDoc() { // dung de luu san 1 danh sach Giam doc cho tien
		ArrayList<GiamDoc> list = new ArrayList<GiamDoc>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof GiamDoc) {
				list.add((GiamDoc) ns);
			}
		}
		return list;
	}

// End code for Selection 10
// ********************************************************
// ********************************************************

	// 10. Tim giam doc co so luong co phieu nhieu nhat

	public ArrayList<GiamDoc> listGiamDocCoNhieuCoPhieuNhat() {
		ArrayList<GiamDoc> listGD = layDSGiamDoc();
		if (listGD.size() != 0) {
			GiamDoc gd = listGD.get(0);
			int indexFirst = 0;
			int index = 0;

			// Tim vi tri Giam doc co nhieuco phieu naht dau tien
			for (GiamDoc gdFirst : listGD) {
				index++;
				if (gdFirst.getCoPhan() > gd.getCoPhan()) {
					gd = gdFirst;
					indexFirst = index - 1;
				}
			}

			// lam 1 list moi de luu danh sach giam doc co nhieu co phan
			ArrayList<GiamDoc> list = new ArrayList<GiamDoc>();
			for (int i = indexFirst; i < listGD.size(); i++) {
				if (listGD.get(i).getCoPhan() == listGD.get(indexFirst).getCoPhan())
					list.add(listGD.get(i));
			}
			return list;
		}
		else return null;
	}

	public void lietKeGiamDocNhieuCoPhan() {
		ArrayList<GiamDoc> listGDNhieuCoPhan = new ArrayList<GiamDoc>();
		listGDNhieuCoPhan = listGiamDocCoNhieuCoPhieuNhat();

		if (listGDNhieuCoPhan == null)
			System.out.println("Cong ty chua co vi tri giam doc!");
		else {
			System.out.println(
					"*************************************************************Cac giam doc co co phan nhieu nhat************************************************");
			for (GiamDoc gd : listGDNhieuCoPhan) {
				gd.xuatMaVaTen();
			}
		}
	}

// Code for Selection 10
// *******************************************************
// ********************************************************

// End code for Selection 11
// ********************************************************
// ********************************************************

	// 11. Tinh va xuat tong thu nhap cua tung giam doc
	public float tinhLoiNhuanCongTy() {
		float loiNhuan;
		loiNhuan = this.doanhThuThang - xuatTongLuongToanCongTy();
		return loiNhuan;
	}

	public float tinhThuNhapGiamDoc(GiamDoc gd) {
		float thuNhap;
		thuNhap = gd.getLuong() + (float) (gd.getCoPhan() / 100) * tinhLoiNhuanCongTy();
		return thuNhap;
	}

	public void xuatThuNhapGiamDoc() {
		ArrayList<GiamDoc> listGD = layDSGiamDoc();
		if(listGD.size() == 0) System.out.println("------>>>> Chua co vi tri giam doc trong cong ty");
		else {for (GiamDoc gd : listGD) {
			float thuNhap = tinhThuNhapGiamDoc(gd);
			System.out.print("Ma so: " + gd.getMaSo() + "\tTen: " + gd.getHoTen());
			System.out.println("\tCo thu nhap la: " + thuNhap);
		} }
	}

// Code for Selection 11
// *******************************************************
// ********************************************************
}
