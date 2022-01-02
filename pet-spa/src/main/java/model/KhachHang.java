/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigInteger;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class KhachHang extends NguoiDung{
    private int id;
    private BigInteger tichLuy;
    private LichHen[] listlichHen;
    protected LoaiKhachHang loaiKhachHang;

    public KhachHang() {
    }

    public KhachHang(String tenDangNhap, String matKhau, LocalDate ngaySinh, String email, String sdt, String soCCCD, HoTen hoTen, DiaChi diaChi) {
        super(tenDangNhap, matKhau, ngaySinh, email, sdt, soCCCD, "KH", hoTen, diaChi);
    }

    public KhachHang(NguoiDung nd) {
      super(nd);
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public BigInteger getTichLuy() {
        return tichLuy;
    }

    public void setTichLuy(BigInteger tichLuy) {
        this.tichLuy = tichLuy;
    }

    public LichHen[] getListlichHen() {
        return listlichHen;
    }

    public void setListlichHen(LichHen[] listlichHen) {
        this.listlichHen = listlichHen;
    }

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public HoTen getHoTen() {
        return hoTen;
    }

    public void setHoTen(HoTen hoTen) {
        this.hoTen = hoTen;
    }


    
}
