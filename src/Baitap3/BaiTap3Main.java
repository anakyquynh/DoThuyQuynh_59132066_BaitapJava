/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap3;

/**
 *
 * @author computer
 */
public class BaiTap3Main {
    public static void main(String[] args) {
        //Create sinh viên IT
        SinhVienIT IT = new SinhVienIT("Nguyen Van A", "CNTT", 9.5, 7,8 );
        // create sinh vien Biz
        SinhVienBiz Biz = new SinhVienBiz("Truong Thi Cam", "Biz", 5.5, 10);
        // create sinh vien poly 
        SinhVienPoly Poly = new SinhVienIT("Nguyen Hoang Minh", "CNTT", 4, 9, 7.5);
        //Xuat thong tin sinh vien
        IT.xuat();
        System.out.println("diem:"+ IT.getDiem());
        System.out.println("hoc luc:"+IT.getHocLuc());
        Biz.xuat();
        System.out.println("diem:"+ Biz.getDiem());
        System.out.println("hoc luc:"+Biz.getHocLuc());
        Poly.xuat();
        System.out.println("diem:"+ Poly.getDiem());
        System.out.println("hoc luc:"+Poly.getHocLuc());  
        
    }
    
}
