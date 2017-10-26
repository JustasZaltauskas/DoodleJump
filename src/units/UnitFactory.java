package units;

import java.util.HashMap;

public class UnitFactory {
//    HashMap<String, HashMap<String, Boolean>> unitFamilies = new HashMap<String, HashMap<String, Boolean>>();
//    unitFamilies.put("platform", new HashMap<String, Boolean>());
    public Unit createUnit(String familyType, String unitType) {
        switch (familyType) {
            case "platform":
                switch (unitType) {
                    case "normal":
                        break;
                }
                break;
            case "enemy":
                break;
        }

        return null;
    }
}
