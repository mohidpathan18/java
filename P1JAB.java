package ja4;
class mohid {
    void sound() {
        System.out.println("i am studing in mumbai ");
    }
}
class amruta extends mohid {
    @Override
    void sound() {
        System.out.println("i am in mvlu collge");
    }
}
public class Ja4 {
    public static void main(String[] args) {
        mohid a = new mohid();
        a.sound();
        amruta d = new amruta();
        d.sound();
    }
}