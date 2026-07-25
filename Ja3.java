package ja3;
class Ja3 {
    String name;
    int age;
    Ja3() {
        name = "mohid ";
        age = 0;
    }
    Ja3(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + "pathan " + age);
    }
    void display(String course) {
        System.out.println(name + " " + age + " " + course);
    }
    static void collegeName() {
        System.out.println("mvlu college");
    }
    public static void main(String[] args) {
        Ja3 s1 = new Ja3();
        Ja3 s2 = new Ja3("mohid", 20);
        collegeName();
        s1.display();
        s2.display("bsc cs");
    }
}