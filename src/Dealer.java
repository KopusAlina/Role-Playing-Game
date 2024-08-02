public class Dealer implements Seller{

    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "продал зелье";
        }
        return result;
    }

    @Override
    public String buy(Goods goods) {
        String result = "";
        if (goods == Goods.FOOD) {
            result = "купил еду";
        }
        return result;
    }

    public enum Goods {
        POTION, FOOD
    }
}
