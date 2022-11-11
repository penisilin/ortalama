import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik  ;
        Scanner imp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = imp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = imp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = imp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = imp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = imp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = imp.nextInt();



        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;
        System.out.println("Not ortalama: " + ortalama);

        String str = ortalama > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);




    }
}