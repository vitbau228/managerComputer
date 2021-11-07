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
public class Main {
    public static void main(String[] args) {
        Ngay day1 = new Ngay(01,02,2023);
        Ngay day2 = new Ngay(11,05,2021);
        
        QuocGia quocgia1 = new QuocGia("VN","Viet Nam");
        QuocGia quocgia2 = new QuocGia("USA","MY");
        QuocGia quocgia3 = new QuocGia("JP","nhat Ban");
        
       
         HangSanXuat hangSanXuat1 = new HangSanXuat("VN laptop",quocgia1);
          HangSanXuat hangSanXuat2 = new HangSanXuat("usa laptop",quocgia2);
           HangSanXuat hangSanXuat3 = new HangSanXuat("JP laptop",quocgia3);
           
           Maytinh mayTinh1 = new Maytinh(hangSanXuat1,day1,1000,1);
            Maytinh mayTinh2 = new Maytinh(hangSanXuat2,day2,8888,2);
             Maytinh mayTinh3 = new Maytinh(hangSanXuat3,day1,9999,1);
        Maytinh[] arr = {mayTinh2,mayTinh1,mayTinh3};
        for(int i= 0 ; i <3;i++) {
            System.out.println(arr[i].layTenQuocGia());
        }
    }
}
