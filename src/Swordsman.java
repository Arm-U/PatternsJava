public class Swordsman extends Unit{
    public Swordsman() {
        super(5, 5, "Swordsman");
    }

    @Override
    public void Attack() {
        System.out.println("Swordsman made attack with sword");
    }
}
