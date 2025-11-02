/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTHtuan9;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private final ArrayList<Sach> danhSachSach;

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    @Override
    public void hienThiDanhSachSach() {
        System.out.println("\n--- DANH SÁCH SÁCH HIỆN CÓ ---");
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }

    @Override
    public Sach timKiemSach(String maSach) {
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        return false;
    }

    @Override
    public void themSach(SachGiaoTrinh sachGiaoTrinh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}