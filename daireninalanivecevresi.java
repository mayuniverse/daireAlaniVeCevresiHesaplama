import java.security.DrbgParameters.NextBytes;
import java.security.cert.CertPathBuilder;
import java.util.Scanner;

public class daireninalanivecevresi{
public static void main(String[] args) {
    
    // değişkenleri tanımlayalım
    double pi = 3.14, r,alan,cevre;
    

    //import sınıfını tanımlayalım
    Scanner input = new Scanner(System.in);

    // kullanıcıdan inputları alalım
    System.out.println("dairenin yarıçapını giriniz");
    r = input.nextDouble();
    System.out.println("yarıçapınız " + r);

    // hesaplamaları yapalım
    alan = pi*r*r;
    cevre = 2*pi*r;

    // çıktıları verelim
    System.out.println("Dairenin alanı " + alan);
    System.out.println("Dairenin çevresi " + cevre);
    
}
}