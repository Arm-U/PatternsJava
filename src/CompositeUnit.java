import java.util.ArrayList;

public class CompositeUnit extends Unit {
    public ArrayList<Unit> squad;

    CompositeUnit() {
        super(0, 0, "Squad");
    }

    void AddUnit(Unit unit) {
        squad.add(unit);
    }

    @Override
    public void Attack() {
        System.out.println("Squad of units made attack");
    }

    @Override
    public int GetAttack() {
        int total_attack = 0;
        for (Unit unit : squad) {
            total_attack += unit.GetAttack();
        }
        return total_attack;
    }

    @Override
    public int GetHealth() {
        int total_health = 0;
        for (Unit unit : squad) {
            total_health += unit.GetHealth();
        }
        return total_health;
    }
}
