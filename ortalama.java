import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
  
        Scanner klavye=new Scanner(System.in);
        System.out.print("VİZE NOTUNUZU GİRİNİZ=");
   int vize=klavye.nextInt();
          System.out.print("FİNAL NOTUNUZU GİRİNİZ=");
   int Final=klavye.nextInt();
   double ortalama=vize*0.4+Final*0.6;
   System.out.println("NOTUNUZ="+ortalama);
        if(ortalama>=50)
         System.out.println("GEÇTİNİZ");
        else
             System.out.println("KALDINIZ");
        
    }
    
}

