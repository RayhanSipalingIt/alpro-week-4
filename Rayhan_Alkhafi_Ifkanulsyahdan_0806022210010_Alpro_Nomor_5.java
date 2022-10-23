import java.util.Scanner;
public class Rayhan_Alkhafi_Ifkanulsyahdan_0806022210010_Alpro_Nomor_5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String nama;
        char jeniskelamin, menikah;

        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        jeniskelamin = input.next().charAt(0);

        System.out.print("Menikah (Y/T) : ");
        menikah = input.next().charAt(0);

        if (jeniskelamin == 'L' && menikah == 'Y'){
            System.out.println("Hello Mr." + nama);
        } else if (jeniskelamin == 'L' && menikah == 'T'){
            System.out.println("Hello Mr." + nama);
        } else if (jeniskelamin == 'P' && menikah == 'Y'){
            System.out.println("Hello Mrs." + nama);
        } else if (jeniskelamin == 'P' && menikah == 'T'){
            System.out.println("Hello, Ms." + nama);
        } else if (jeniskelamin == 'l' && menikah == 'y'){
            System.out.println("Hello Mr." + nama);
        } else if (jeniskelamin == 'l' && menikah == 't'){
            System.out.println("Hello Mr." + nama);
        } else if (jeniskelamin == 'p' && menikah == 'y'){
            System.out.println("Hello Mrs." + nama);
        } else if (jeniskelamin == 'p' && menikah == 't'){
            System.out.println("Hello, Ms." + nama);
        }
    }
}