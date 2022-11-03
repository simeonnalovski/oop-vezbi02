package oop.fikt.vezhbi02;
public class Predmet {
    public String ime_predmet;
    public String ime_profesor;
    public String semestar;
    public String broj_krediti;

    public Predmet(){

    }
    public Predmet( String ime_predmet){
        this.ime_predmet=ime_predmet;
    }
    public Predmet( String ime_predmet,String ime_profesor,String broj_krediti){
        this.ime_predmet=ime_predmet;
        this.ime_profesor=ime_profesor;
        this.broj_krediti=broj_krediti;
    }
}
