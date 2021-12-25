package Mode.MainProGram;

import Mode.Object.*;
import java.util.ArrayList;
import java.util.Scanner;
public class MainProgram {
	public static void inBatDau() {
		System.out.println();
		System.out.println("********************************************************************Chay chuc nang****************************************************************");
	}
	public static void inKetThuc() {
		System.out.println("***********************************************************************Ket Thuc****************************************************************");
		System.out.println();
	}
	public static void inMenu() {
		System.out.println(
				"********************************************************************** Chon theo huong dan ***************************************************************");
		System.out.println("1. Nhap thong tin cong ty");
		System.out.println("2. Phan bo Nhan vien vao Truong Phong");
		System.out.println(
				"3. Them, xoa thong tin 1 nhan su (co the la nhan vien, truong phong hoac giam doc. Luu y khi xoa nhan vien"
						+ " truong phong phai ngat lien ket voi cac nhan vien dang tham chieu toi");
		System.out.println("4. Xuat ra thong tin toan bo nguoi trong cong ty");
		System.out.println("5. Tinh va xuat ra tong luong cho toan cong ty ");
		System.out.println("6. Tim nhan vien thuong co luong cao nhat");
		System.out.println("7. Tim truong phong co so luong nhan vien duoi quyen nhieu nhat");
		System.out.println("8. Sap xep nhan vien toan cong ty theo thu tu abc");
		System.out.println("9. Sap xep nhan vien toan cong ty theo thu tu luong giam dan");
		System.out.println("10. Tim giam doc co so luong co phieu nhieu nhat");
		System.out.println("11. Tinh va xuat tong thu nhap cua tung giam doc");
		System.out.println("0. Thoat chuong trinh!");
	}
	
	
// Code co san dummyData phuc vu cho viec test
	/*
	 * public static void doMenu(Scanner scan) {
		boolean flag = true;;
		CongTy cty = new CongTy();
		cty.dummyDataCongTy();
		cty.dummyDataNhanSu();
		do {
			inMenu();
			System.out.print("Moi lua chon: ");
			int choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				codeFor1(scan, cty);
				break;
			case 2:
				codeFor2(cty);
				break;
			case 3:
				codeFor3(cty);
				break;
			case 4:
				codeFor4(cty);
				break;
			case 5:
				codeFor5(cty);
				break;
			case 6:
				codeFor6(cty);
				break;
			case 7:
				codeFor7(cty);
				break;
			case 8:
				codeFor8(cty);
				break;
			case 9:
				codeFor9(cty);
				break;
			case 10:
				codeFor10(cty);
				break;
			case 11:
				codeFor11(cty);
				break;
			case 0:
				System.out.println("*********************************************Thoat chuong trinh**************************************");
				flag = false;
				break;
			default:
				System.out.println();
				System.out.println("--------->>>>>> Nhap cac phim chuc nang trong bang!");
				System.out.println();
				break;
			}
		}  while(flag);
	}
	
	*/
	
	
	// Code chưa có dữ liệu
	public static void doMenu(Scanner scan) {
		boolean flag = true;;
		CongTy cty = new CongTy();
		do {
			inMenu();
			System.out.print("Moi lua chon: ");
			int choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				codeFor1(scan, cty);
				break;
			case 2:
				codeFor2(cty);
				break;
			case 3:
				codeFor3(cty);
				break;
			case 4:
				codeFor4(cty);
				break;
			case 5:
				codeFor5(cty);
				break;
			case 6:
				codeFor6(cty);
				break;
			case 7:
				codeFor7(cty);
				break;
			case 8:
				codeFor8(cty);
				break;
			case 9:
				codeFor9(cty);
				break;
			case 10:
				codeFor10(cty);
				break;
			case 11:
				codeFor11(cty);
				break;
			case 0:
				System.out.println("*********************************************Thoat chuong trinh**************************************");
				flag = false;
				break;
			default:
				System.out.println();
				System.out.println("--------->>>>>> Nhap cac phim chuc nang trong bang!");
				System.out.println();
				break;
			}
		}  while(flag);
	}
	
	
	
	
	
	private static void codeFor11(CongTy cty) {
		inBatDau();
		cty.xuatThuNhapGiamDoc();
		inKetThuc();
	}
	private static void codeFor10(CongTy cty) {
		inBatDau();
		cty.lietKeGiamDocNhieuCoPhan();
		inKetThuc();
	}
	private static void codeFor9(CongTy cty) {
		inBatDau();
		cty.tinhLuong();
		cty.sortSalary();
		cty.xuat();
		inKetThuc();
	}
	private static void codeFor8(CongTy cty) {
		inBatDau();
		cty.sortName();
		cty.xuat();
		inKetThuc();
	}
	private static void codeFor7(CongTy cty) {
		inBatDau();
		cty.lietKeTruongPhongCoNhieuNVDuoiQuyen();
		inKetThuc();
	}
	private static void codeFor6(CongTy cty) {
		inBatDau();
		cty.tinhLuong();
		cty.lietKeDanhSachNVTCoLuongCaoNhat();
		inKetThuc();
	}
	private static void codeFor5(CongTy cty) {
		inBatDau();
		float sum = cty.xuatTongLuongToanCongTy();
		System.out.println("Tong luong toan cong ty: " + sum);
		inKetThuc();
	}
	private static void codeFor4(CongTy cty) {
		inBatDau();
		cty.tinhLuong();
		cty.xuat();
		inKetThuc();
	}
	private static void codeFor3(CongTy cty) {
		inBatDau();
		cty.doThemHoacXoa();
		inKetThuc();
	}
	private static void codeFor2(CongTy cty) {
		inBatDau();
		cty.chonCachPhanBo();
		inKetThuc();
	}
	private static void codeFor1(Scanner scan, CongTy cty) {
		inBatDau();
		cty.nhap(scan);
		inKetThuc();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

}
