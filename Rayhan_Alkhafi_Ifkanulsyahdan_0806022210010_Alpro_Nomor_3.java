//soal no.3 ganjil genap
import java.util.Scanner;
public class Rayhan_Alkhafi_Ifkanulsyahdan_0806022210010_Alpro_Nomor_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka;
        System.out.println("PROGRAM MENENTUKAN ANGKA HANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan angka = ");
        angka=input.nextInt();
        
        if (angka%2==0){
            System.out.println("Bilangan "+angka+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+angka+" adalah bilangan ganjil");
        }
    
  }
}