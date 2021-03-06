package Mode.Object;

import java.util.Scanner;

public class TruongPhong extends NhanSu {
	// constants
	final int LUONG_NGAY = 200;
	final int PHU_CAP_MOI_NV_QUANlY = 100;
	
	private int soNhanVienDuoiQuyen;
	
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	public TruongPhong() {
		this.soNhanVienDuoiQuyen = 0;
	}

	public TruongPhong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.soNhanVienDuoiQuyen = 0; // khong can truyen vao tham so do cu cong don tich luy 
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\tSo nhan vien: " + this.soNhanVienDuoiQuyen
							+"\tLuong: " + this.luong);
	}
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("============Ket Thuc==========");
	}
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY + this.soNhanVienDuoiQuyen * PHU_CAP_MOI_NV_QUANlY;
	}
	
	public void tangNhanVien() {
		this.soNhanVienDuoiQuyen++;
	}
	public void giamNhanVien() {
		this.soNhanVienDuoiQuyen--;
	}
}

