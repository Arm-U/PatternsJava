public abstract class Unit implements UnitInterface {
    public int attack;
    public int health;
    public String name;

    Unit(int attack_new, int health_new, String name_new) {
        attack = attack_new;
        health = health_new;
        name = name_new;
    }

    @Override
    public int GetAttack() {
        return attack;
    }

    @Override
    public int GetHealth() {
        return health;
    }

    @Override
    public void Attack() {}
}
