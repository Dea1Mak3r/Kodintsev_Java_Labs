package Lab_4.family;

class GrandChild extends Child {

    public GrandChild(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Это внук");
    }
}
