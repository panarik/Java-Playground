package season1.work6.items;

public abstract class AbstractBowl {

    protected int amount; //объем емкости

    //кладём что-то
    public void putInto(int amount) {
        this.amount += amount;

    }

    //берем что-то
    public void decrease(int amount) {
        this.amount -= amount;
    }

    //узнаем сколько чего-то в миске
    public int getAmount() {
        return amount;
    }
}
