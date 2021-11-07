/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maytinh;

/**
 *
 * @author Hello VIỆT
 */
public class HangSanXuat {
    private String tenHangSanXuat;
    private QuocGia quocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String tenHangSanXuat, QuocGia quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }
    public String layTenQuocGia() {
        return this.quocGia.getTenQuocGia();
    }
}
