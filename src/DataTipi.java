import java.util.Scanner;

public class DataTipi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        try
        {
            long x=girdi.nextLong();
            System.out.println("Girdiiniz "+x+" Degeri");
            System.out.println((x>=-128 && x<=127) ? ("*  byte"): (""));
            // if(x>=-128 && x<=127)System.out.println("* byte");

            System.out.println((x>=-32768 && x<=32768) ? ("*  short  "): (""));
            //if(x>=-32768 && x<=32768) System.out.println("* short");

            System.out.println((x>=-2147483648 && x<=2147483647) ? ("*  integer  "): (""));
            //if(x>=-2147483648 && x<=2147483647) System.out.println("* integer");

            System.out.println((x<-2147483648 | x>2147483647) ? ("*  long  "): (""));
            //if(x<-2147483648 | x>2147483647) System.out.print("* Long");

            //Complete the code
        }
        catch(Exception e)
        {
            System.out.println(girdi.next()+" girdiginiz deger basit java veri tipleri tarafndan saklanamaz .");
        }


    }
}
