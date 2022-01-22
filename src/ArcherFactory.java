public class ArcherFactory implements UnitFactory {
    public Unit GetUnit() {
        return new Archer();
    }
}
