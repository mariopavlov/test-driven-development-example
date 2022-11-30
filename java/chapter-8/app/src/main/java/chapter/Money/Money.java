package chapter.Money;

public abstract class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;

        if (!getClass().equals(money.getClass())) {
            return false;
        }
        return amount == money.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);
}
