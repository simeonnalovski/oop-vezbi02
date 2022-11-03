package oop.fikt.vezhbi02;
public class Triagolnik {
    public int a;
    public int b;
    public int c;

    public Triagolnik(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void Perimetar(int a, int b,int c){
        int l=a+b+c;
        System.out.println("Perimetarot na triagolnikot iznesuva "+l+" cm" );
    }
    public void Plostina(int a,int b,int c){
        double s=(a+b+c)/2;
        double p=  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Plostinata na triagolnikot iznesuva "+p);
    }
    
}
