package Mode.Object;

import java.util.Scanner;

public class NhanVienThuong extends NhanSu {
	final int LUONG_NGAY = 100;
	
	private TruongPhong truongPhong;
	
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public NhanVienThuong() {
		this.truongPhong = null; // chua duoc phan bo
		//	this.truongPhong = new TruongPhong(); // do can phan bo nhan vien cho truong phong
	}

	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);	
	}

	@Override
	public void xuat() {
		super.xuat();
		// phai co if vi co the xay ra nhan vien chua co trong phong
		if(this.truongPhong != null) {
			System.out.println("\tLuong: " + this.luong + "\tMa TP: " + this.truongPhong.getMaSo()
			+ "\tTen TP: " + this.truongPhong.getHoTen());
		} else {
			System.out.println("\tLuong: " + this.luong + "\t Chua phan bo");
		}
				
	}
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("============Ket Thuc==========");
	}
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}
}

