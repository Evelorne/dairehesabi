import java.util.Scanner;
public class chamber {
    public static void main(String[] args) {
        double r,pi,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz :");
        r=input.nextDouble();
        Scanner inp = new Scanner(System.in);
        System.out.print("Merkez açısı ölçüsü giriniz : ");
        a= inp.nextDouble();
        pi =3.14;
        double alan = pi*r*r;
        System.out.println("Dairenizin toplam alanı : "+alan);
        double cevre = 2 * pi *r;
        System.out.println("Dairenizin çevresi : "+cevre);
        double b =(pi*(r*r)*a)/360;
        System.out.print("Daire diliminizin alanı : "+ b);
    }
}
