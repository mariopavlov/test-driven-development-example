package chapter.Money;

public class Dollar {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }

    private int amount;
}