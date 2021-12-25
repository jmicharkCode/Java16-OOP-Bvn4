package Mode.Object;

import java.util.Scanner;

public class NhanSu {
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;
	
	

	public String getMaSo() {
		return maSo;
	}



	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public String getSoDienThoai() {
		return soDienThoai;
	}



	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}



	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}



	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}



	public float getLuong() {
		return luong;
	}



	public NhanSu() {
	
	}



	public NhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public void nhap(Scanner scan) {
		System.out.println("======Them Nhan Su======");
		System.out.print("Nhap ma so: ");
		this.maSo = scan.nextLine();
		System.out.print("Nhap ho ten: ");
		this.hoTen = scan.nextLine();
		System.out.print("Nhap so dien thoai: ");
		this.soDienThoai = scan.nextLine();
		System.out.print("Nhap so ngay lam viec ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
	}
	//System.out.println("============Ket Thuc==========");
	public void xuat() {
		System.out.print("Ma so: " + this.maSo + "\tHo ten: "
						+ this.hoTen + "\tSo dien thoai: " +
						this.soDienThoai + "\tSo ngay lam viec: " + this.soNgayLamViec);
	}
	
	public void tinhLuong() {
		this.luong = 0;
	}
	
	// Phuc vu cho (I)
	public void xuatMaVaTen() {
		System.out.println("Ma: " + this.maSo + "\tTen: " + this.hoTen);
	}
}

