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
public class SinhVienBiz  extends SinhVienPoly{
    //Attributes
    public double diemMarketing;
    public double diemSales;
    //Constructor
    public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing,double diemSales)
    {
        super(hoTen,nganhHoc);
        this.diemMarketing=diemMarketing;
        this.diemSales=diemSales;
    }  
    //Defined abstract method
    @Override
    public double getDiem()
    {
        return(2*this.diemMarketing+this.diemSales)/3;
        
    };          
}
