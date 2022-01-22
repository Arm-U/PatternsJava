public class Archer extends Unit {
    public Archer() {
        super(6, 3, "Archer");
    }

    @Override
    public void Attack() {
        System.out.println("Archer made attack with arrows");
    }
}
