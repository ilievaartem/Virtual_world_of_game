package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ArmyUnit implements MilitaryUnit {
    private String name;
    private List<MilitaryUnit> subUnits;

    public ArmyUnit(String name) {
        this.name = name;
        this.subUnits = new ArrayList<>();
    }

    public void addSubUnit(MilitaryUnit unit) {
        subUnits.add(unit);
    }

    @Override
    public void deploy() {
        System.out.println("Deploying " + name);
        for (MilitaryUnit unit : subUnits) {
            unit.deploy();
        }
    }
}
