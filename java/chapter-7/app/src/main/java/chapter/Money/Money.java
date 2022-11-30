package chapter.Money;

public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;

        if (!getClass().equals(money.getClass())) {
            return false;
        }
        return amount == money.amount;
    }
}
