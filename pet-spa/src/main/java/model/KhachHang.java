/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

<<<<<<< HEAD
    public KhachHang(NguoiDung nd) {
      super(nd);
    }
=======
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

>>>>>>> 776c66400205aff0cdc57867e23989c8c45db1a7

    
}
