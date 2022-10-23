//soal no.1 konversi suhu
import java.util.Scanner;



public class Rayhan_Alkhafi_Ifkanulsyahdan_0806022210010_Alpro_Nomor_1{

    public static void main(String[] args){
        

    double suhuawal, f, r, k;
    String pilih;

    String tst = "0";
   


    Scanner input = new Scanner(System.in);
    System.out.println("masukkan suhu");

    //memasukkan nilai suhu celcius
    suhuawal =  input.nextDouble();

    System.out.println("pilih suhu: ");
    System.out.println("1.reamur");
    System.out.println("2.kelvin");
    System.out.println("3.fahrenheit");
    
    //memasukkan input pilihan
    Scanner input2 = new Scanner(System.in);
    pilih = input2.nextLine();
    if (pilih.equals("reamur")) {
        System.out.print("reamur: ");
        r = suhuawal*0.8;
        System.out.println(r);
        
    } else if(pilih.equals("fahrenheit")) {
        System.out.print("fahrenheit: ");
        f = suhuawal*1.8+32;
        System.out.println(f);


    } else if(pilih.equals("kelvin")){
    System.out.print("kelvin: ");
    k = suhuawal+273;
    System.out.println(k);
    }
    



    
        
    
    }
}