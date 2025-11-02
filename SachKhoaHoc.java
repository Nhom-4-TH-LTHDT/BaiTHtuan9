/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTHtuan9;

/**
 *
 * @author ADMIN
 */
public class SachKhoaHoc extends Sach {
    private String linhVuc;

    public SachKhoaHoc(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, String linhVuc) {
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.linhVuc = linhVuc;
    }

    @Override
    public double tinhGiaBan() {
        int namHienTai = 2025; 
        int soNamDaXuatBan = namHienTai - getNamXuatBan();
        double phuPhiNghienCuu = 20000.0;
        
        return getGiaCoBan() + phuPhiNghienCuu + (soNamDaXuatBan * 1000.0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách Khoa Học [" + getTieuDe() + "] lĩnh vực " + linhVuc + " đến khu vực: " + viTriMoi + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Lĩnh vực: " + linhVuc +
               ", Giá Bán Ước Tính: " + String.format("%,.0f VNĐ", tinhGiaBan());
    }
}