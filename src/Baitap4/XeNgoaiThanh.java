/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author Quynh
 */
public class XeNgoaiThanh extends ChuyenXe
{
    private String NoiDen;
    private int SoNgayDiDuoc;
    public XeNgoaiThanh()
    {
        super();
        this.NoiDen="";
        this.SoNgayDiDuoc=0;
    }

    public void setNoiDen(String NoiDen) 
    {
        this.NoiDen=NoiDen;
    }

    public void setSoNgayDiDuoc(int SoNgayDiDuoc) 
    {
        this.SoNgayDiDuoc=SoNgayDiDuoc;
    }

  
    public String getThongTin() {
        return "Xe ngoại thành: mã số chuyến: " + MaSoChuyen + ", "
                + "Tên tài xế: " + HoTenTaiXe + ", "
                + "Số xe: " + SoXe + ", "
                + "Doanh thu: " + Doanhthu + ", "
                + "Nơi đến: " + NoiDen + ", "
                + "Số ngày đi được: " + SoNgayDiDuoc;
    }

    @Override
    public String getThongtin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}