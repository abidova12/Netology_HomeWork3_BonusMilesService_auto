public class BonusMilesService {

    public int calculate(int price) {
        int cost = 20;
        int bonusMiles = price / cost;
        return bonusMiles;
    }
}
