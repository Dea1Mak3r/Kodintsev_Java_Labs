package Lab_4.family;

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Это ребенок");
    }
}
