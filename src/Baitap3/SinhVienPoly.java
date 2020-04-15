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
public abstract class SinhVienPoly {
   //Attributes
    public String hoTen;
    public String nganhHoc;
    //Constructor
    public SinhVienPoly(String hoTen, String nganhHoc)
    {
        this.hoTen=hoTen;
        this.nganhHoc=nganhHoc;
    }     
    //methods
    //getDiem(abstract method)
    public abstract double getDiem();
    //getHocLuc
    public String getHocLuc()
    {
        if(this.getDiem()<5)
        {
            return"Yeu";
        }  
        if (this.getDiem()<6.5)
        {
            return"Trung Binh";
        }   
        if(this.getDiem()<7.5)
        {
            return"Kha";
        }   
        if (this.getDiem()<9)
        {
            return"Gioi";
        } 
        return"Xuat sac";
    }  
    //Xuat thong tin sinh vien
    public void xuat()
    {
        System.out.println("Ho ten:"+this.hoTen+",Nganh hoc:"+this.nganhHoc);
    }
            
}
