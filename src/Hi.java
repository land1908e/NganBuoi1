import javax.swing.*;
import java.util.Scanner;

public class Hi {
    //tên project không dấu cách không ký tự đặc biệt
    //tên class: chữ cái đầu viết hoa, không dấu gạch dưới, không dấu cách, không ký tự đặc biệt, ký tự đầu không được là số.

    int soKT;
    boolean ketQua;

    /*
    * instance là 1 thể hiện của class.
    * khai báo phương thức:
    * <kiểu dữ liệu trả về> tên pt (<tham số>){
    * nội dung
    * }
    *
    * cách đặt tên pt:
    * giông biến.
    *
    * */
    public void kiemtra(){
        /*
        khai báo:
        <kiểu dl> <ten>;
        quy tắc đặt tên biến: ký tự đầu viết thường, còn lại giống class

        gán giá trị:
        <ten>= <gia tri>;

        */

        ketQua=true;
        for (int i=2;i<soKT/2;i++)
        {
            //for(khởi tạo; điều kiện; thay đổi)
            //thực hiện
            if (soKT%i==0){
                ketQua = false;
            }else {
                ketQua = true;
            }
        }
        System.out.println("Kết quả: "+ketQua);

    }
    /*
    * Tạo đối tượng:
    * <tên class> ten = new <tên class>();
    *
    * gmail:
    * land1908e@gmail.com
    * mk: Lopland1908e
    *
    * git:
    * land1908e
    * mk: NguyenDuc9x
    *
    * tính chật lthdt
    * 1.trừu tượng: bỏ qua các đặc điêm chung để làm nổi bật các đặc điểm riêng(tránh dư thừa dl)
    * 2. kế thừa: khi bỏ qua các dd chung giữa các đối tg thì các điểm chung đó sẽ nằm trong 1 đối tg (class) sau đó chúng ta lấy đối tg kế thừa đt chung đó
    * khi a kế thừa từ b thì toàn bộ pt và tt của b đều nằm trong a
    *
    * */
    public static void main(String[] args) {
        System.out.println("HellWorld!!!");
        Hi nT = new Hi();
        nT.soKT = 2003;
        nT.kiemtra();

        Hi nT2 = new Hi();
        nT2.soKT = 9;
        nT2.kiemtra();
    }

}
