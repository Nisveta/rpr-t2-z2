package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna_tacka, krajnja_tacka;
    private boolean Tp,Tk;
    public Interval(double pocetna_tacka, double krajnja_tacka, boolean Tp, boolean Tk){
        this.krajnja_tacka=krajnja_tacka;
        this.pocetna_tacka=pocetna_tacka;
        this.Tp=Tp;
        this.Tk=Tk;
    }
    public Interval(){
        krajnja_tacka=0;
        pocetna_tacka=0;
        Tp=false;
        Tk=false;
    }
    public boolean isNull(){
        if(krajnja_tacka==0 && pocetna_tacka==0 && Tp==false && Tk==false) return true;
        return false;
    }
    public boolean isln(double T){
        if(Tp==false && Tk==false && T>pocetna_tacka && T<krajnja_tacka) return true;
        else if(Tp==true && Tk==false && T>=pocetna_tacka && T<krajnja_tacka) return true;
        else if(Tp==false && Tk==true && T>pocetna_tacka && T<=krajnja_tacka) return true;
        else if(Tp==true && Tk==true && T>=pocetna_tacka && T<=krajnja_tacka) return true;
        return false;
    }
    public Interval intersect(Interval i1){
        double p,k;
        if(pocetna_tacka>=i1.pocetna_tacka) p=pocetna_tacka;
        else p=i1.pocetna_tacka;
        if(krajnja_tacka<=i1.krajnja_tacka) k=krajnja_tacka;
        else k=i1.krajnja_tacka;
        Interval i=new Interval(p,k,true, true);
        return i;
    }
    public static Interval intersect(Interval i1, Interval i2){
        double p,k;
        if(i1.pocetna_tacka>=i2.pocetna_tacka) p=i1.pocetna_tacka;
        else p=i2.pocetna_tacka;
        if(i1.krajnja_tacka<=i2.krajnja_tacka) k=i1.krajnja_tacka;
        else k=i2.krajnja_tacka;
        Interval i=new Interval(p,k,true, true);
        return i;
    }


}
