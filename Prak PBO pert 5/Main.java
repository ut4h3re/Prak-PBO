public class Main {
    public static void main(String[] args) throws Exception {
        Spider LabaLaba = new Spider();
        LabaLaba.eat();

        Dog Darren = new Dog();
        Darren.setName("Darren");
        System.out.println("Nama Anjing Saya adalah " + Darren.getName());
        Darren.play();
        Darren.eat();
        Darren.walk();

        Cat Snowie = new Cat();
        Snowie.setName("Snowie");
        System.out.println("Nama Kucing Saya adalah " + Snowie.getName());
        Snowie.play();
        Snowie.eat();
        Snowie.walk();
    }
}