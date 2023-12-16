package Lab11;

public class Rectangle {
    int a,b;
    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void pr(){
        System.out.println("a = "+a+"\n"+"b = " + b);
    }
    public int per(){
        return ((a+b)*2);
    }
    public double pl(){
        return (a*b);
    }
    public static void main(String[] args){
        Rectangle rc = new Rectangle(3,4);
        rc.pr();
        System.out.println("Площадь = "+rc.pl() + "\n" + "Периметр = "+rc.per());
    }
}
