/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

import Baitap1.NhanVien;
import java.util.ArrayList;
public class QLnhanVien  implements IQuanLy{
    //danh sach nhan vien
    ArrayList<NhanVien> dsNhanVien =new ArrayList<>();
    //
    @Override
    public void them(NhanVien nv){
        dsNhanVien.add(nv);
    };
    @Override
    public void inDS(){
        dsNhanVien.forEach(nv-> System.out.println(nv.getThongtin()));
    };      
    
}
