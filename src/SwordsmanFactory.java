public class SwordsmanFactory implements UnitFactory {
    public Unit GetUnit() {
        return new Swordsman();
    }
}
