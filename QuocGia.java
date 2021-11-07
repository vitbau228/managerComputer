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
public class QuocGia {
    private String maQuocGia;
    private String tenQuocGia;
    public QuocGia(){
        
    }
    
    public QuocGia(String maQuocGia,String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }
    
    public String getMaQuocGia(){
        return maQuocGia;
    }
    public String getTenQuocGia(){
        return tenQuocGia;
    }
    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    
    
}
