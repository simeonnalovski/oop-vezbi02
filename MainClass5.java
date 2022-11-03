package oop.fikt.vezhbi02;
public class MainClass5 {
    public static void main(String[] args){
        Predmet SP= new Predmet();
        SP.ime_predmet="Strukturirano programiranje";
        SP.ime_profesor="Ramona Markovska";
        SP.broj_krediti="6";
        SP.semestar="prv";
        System.out.println("Prviot predmet se vika "+SP.ime_predmet+" , go predava prof."+SP.ime_profesor+" vo "+SP.semestar+" i nosi "+SP.broj_krediti);
        //vo System.out.println na red 9 se pecatat atributite na objektot SP, kreira so prviot konstruktor
        Predmet Mat2= new Predmet("Matematika 2");
        Mat2.ime_profesor="Sonja Machevska";
        Mat2.semestar="vtor";
        Mat2.broj_krediti="6";
        System.out.println("Vtoriot predmet se vika "+Mat2.ime_predmet+" , go predava prof."+Mat2.ime_profesor+" vo "+Mat2.semestar+" i nosi "+Mat2.broj_krediti);
        //vo System.out.println na red 15 se pecatat atributite na objektot Mat2, kreira so vtoriot konstruktor
        Predmet PKM=new Predmet("Podatocni mrezi i komunikacii","Pece Mitrevski", "6");
        PKM.semestar="tret";
        System.out.println("Tretiot predmet se vika "+PKM.ime_predmet+" , go predava prof."+PKM.ime_profesor+" vo "+PKM.semestar+" i nosi "+PKM.broj_krediti);
    // vo System.out.println na red 19 se pecatat atributite na objektot PKM, kreiran so tretiot konstruktor
    }
    
}
