/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author computer
 */
public class Baitap1Main {

    public static void main(String[] args) {
        // Create nhan vien
        NhanVien nv =new NhanVien();
        nv.setTen("Do Thuy Quynh");
        nv.setTuoi(23);
        nv.setDiaChi("Tuy Hoa-Phu Yen");
        nv.setTienLuong(9000000);
        nv.setTonggiolam(105);
        //Crete nhan vien 1
        NhanVien nv1 =new NhanVien();
        nv1.setTen("Nguyen Văn Vương");
        nv.setTuoi(29);
        nv.setDiaChi("Nha Trang-Khanh Hoa");
        nv.setTienLuong(10000000);
        nv.setTonggiolam(110);
        //In ra thông tin nhân viên
        System.out.println(nv.getThongtin());
        System.out.println(nv1.getThongtin());
      
    }
    
}
