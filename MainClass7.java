package oop.fikt.vezhbi02;
import java.util.*; 
public class MainClass7 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Vnesi ja dolzinata na stranata a ");  
            int a= sc.nextInt();  
            System.out.print("Vnesi ja dolzinata na stranata b");  
            int b= sc.nextInt();  
            System.out.print("Vnesi ja dolzinata na stranata c");  
            int c= sc.nextInt();  
            Triagolnik t=new Triagolnik(a, b, c);
            t.Perimetar(a, b, c);
            t.Plostina(a,b,c);
        }


  
    }
}
