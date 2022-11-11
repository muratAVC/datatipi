import java.util.Scanner;

public class DataTipi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        try
        {
            long x=girdi.nextLong();
            System.out.println("Girdiiniz "+x+" Degeri");
            System.out.println((x>=-128 && x<=127) ? ("*  byte"): (""));

            System.out.println((x>=-32768 && x<=32768) ? ("*  short  "): (""));

            System.out.println((x>=-2147483648 && x<=2147483647) ? ("*  integer  "): (""));

            System.out.println((x<-2147483648 || x>2147483647) ? ("*  long  "): (""));

            //Complete the code
        }
        catch(Exception e)
        {
            System.out.println(girdi.next()+" girdiginiz deger basit java veri tipleri tarafndan saklanamaz .");
        }


    }
}
