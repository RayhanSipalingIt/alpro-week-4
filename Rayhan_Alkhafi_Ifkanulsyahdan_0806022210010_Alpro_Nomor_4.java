//soal no.4 jamkerja
import java.util.Scanner;
public class Rayhan_Alkhafi_Ifkanulsyahdan_0806022210010_Alpro_Nomor_4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("masukkan jam kerja");

        double jam = input.nextDouble();
    
        if (jam <= 40) {
            double gaji=jam*6;
            System.out.println("gaji kotor = " + gaji);
            double pajak=gaji*0.1;
            System.out.println("pajak = "+ pajak);
            double gajibersih=gaji-pajak;
            System.out.println("gaji bersih anda"+ gajibersih);
        } 
        else if (jam > 40){
            double gaji=jam*6*1.5;
            System.out.println("gaji kotor =" + gaji);
            if (gaji > 250){
                double pajak=gaji*0.12;
                System.out.println("pajak = "+pajak);
                double gajibersih=gaji-pajak;
                System.out.println("gaji bersih anda = "+ gajibersih);

            }
            else if (jam < 250){
                double pajak=gaji*0.10;
                System.out.println("pajak = "+pajak);
                double gajibersih=gaji-pajak;
                System.out.println("gaji bersih anda = "+ gajibersih);


            }
        }
             
        

            
        



        
    }
}