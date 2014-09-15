package coba;
import java.util.Scanner;
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int c;
        System.out.println("masukan angka pertama: ");
    int a=input.nextInt(); 
    System.out.println("masukkan angka kedua: ");
    int b= input.nextInt();
    do{
    System.out.println("Menu");
    System.out.println("1.adding");
    System.out.println("2.subtracting");
    System.out.println("3.multiplying");
    System.out.println("4.dividing");
    System.out.println("5.computing the remainder");
    System.out.println("6.ubah angka pertama dan kedua");
    System.out.println("7.tampilkan angka pertama");
    System.out.println("0.exit");
    System.out.println("masukkan pilihan anda: ");
    c=input.nextInt();
    switch(c){
        case 1:System.out.println("a+b= "+(a+b));
            break;
        case 2:System.out.println("a-b= "+(a-b));
            break;
        case 3:System.out.println("a*b= "+(a*b));
            break;
        case 4:System.out.println("a/b= "+(a/b));
            break;
        case 5:System.out.println("a%b= "+(a%b));
            break;
        case 6:System.out.println("masukkan angka pertama: ");
            a=input.nextInt();
            System.out.println("masukkan angka kedua: ");
            b=input.nextInt();
            break;
        case 7:System.out.println("nilai angka pertama: "+a);
            System.out.println("nilai angka kedua: "+b);
            break;
        case 0:break;
        default:System.out.println("pilihan anda tidak tesedia");
    }
        
}
    while(c!=0);    
}
}
    6