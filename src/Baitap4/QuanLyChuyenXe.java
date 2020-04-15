/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;
import java.util.ArrayList;
/**
 *
 * @author Quynh
 */
public class QuanLyChuyenXe {
   ArrayList<ChuyenXe > dsChuyenXe;
   public QuanLyChuyenXe(){
       dsChuyenXe=new ArrayList<>();
   }
   public void them(ChuyenXe  chuyenXe){
       dsChuyenXe.add(chuyenXe);
   }
   public ArrayList<ChuyenXe> getDSChuyenXe(){
       return dsChuyenXe;
   }
   public void inDS(){
       for(int i =0; i <dsChuyenXe.size(); i++)
       {
           System.out.println(dsChuyenXe.get(i).getThongtin());
       }
   }
   public double tinhTongDoanhThuNoiThanh(){
       double Doanhthu=0;
       for(int i =0; i< dsChuyenXe.size(); i++)
       {
          if (dsChuyenXe.get(i) instanceof XeNoiThanh)
               Doanhthu+=dsChuyenXe.get(i).getDoanhthu();
       }
       return Doanhthu;
   }
   public double tinhTongDoanhThuNgoaiThanh(){
       double Doanhthu=0;
       for(int i =0; i <dsChuyenXe.size(); i++)
       {
           if(dsChuyenXe.get(i) instanceof XeNgoaiThanh)
               Doanhthu+=dsChuyenXe.get(i).getDoanhthu();
       }
       return Doanhthu;  
       
   }
   public double tinhTongDoanhThu(){
       double Doanhthu=0;
       for(int i =0; i <dsChuyenXe.size(); i++)
       {
               Doanhthu+=dsChuyenXe.get(i).getDoanhthu();
       }
       return Doanhthu;
   }      
           
}
