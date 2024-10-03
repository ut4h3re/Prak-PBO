class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void play() {
        System.out.println("Bermain lempar tangkap frisbee");
    }

    public void eat() {
        System.out.println("Sedang memakan daging");
    }

    @Override
    public void walk() {
        System.out.println("Berjalan bersama pemiliknya");
    }
}