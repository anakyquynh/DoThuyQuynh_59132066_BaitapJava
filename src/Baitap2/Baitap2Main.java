/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;
import Baitap1.NhanVien;
/**
 *
 * @author computer
 */
public class Baitap2Main {

    public static void main(String[] args) {
      //Create quan ly nhan vien
      IQuanLy QLnhanVien= new QLnhanVien();
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
          
        // Create nhan vien 2
        NhanVien nv2 =new NhanVien();
        nv2.setTen("Tran Van B");
        nv2.setTuoi(23);
        nv2.setDiaChi("Dien Khanh-Khanh Hoa");
        nv2.setTienLuong(11000000);
        nv2.setTonggiolam(103);
        //Crete nhan vien 3
        NhanVien nv3 =new NhanVien();
        nv3.setTen("Nguyen Thi Thuy");
        nv3.setTuoi(29);
        nv3.setDiaChi("Da Lat-Lam Dong");
        nv3.setTienLuong(8000000);
        nv3.setTonggiolam(100);
        //Crete nhan vien 4
        NhanVien nv4 =new NhanVien();
        nv4.setTen("Dao Thanh Ngan");
        nv4.setTuoi(29);
        nv4.setDiaChi("Da Lat-Lam Dong");
        nv4.setTienLuong(9000000);
        nv4.setTonggiolam(90);
        //Add nhan vien vao QLnhanVien     
        QLnhanVien .them(nv);
    }
    
}
