package hika.saru.java.discount.impl;

import hika.saru.java.Money;
import hika.saru.java.discount.DiscountCondition;
import hika.saru.java.discount.DiscountPolicy;

public abstract class AmountDiscount implements DiscountPolicy.AMOUNT, DiscountCondition {
    private final Money amount;

    public AmountDiscount(Money amount) {
        this.amount = amount;
    }

    @Override
    public final Money calculateFee(Money fee) {
        return fee.minus(amount);
    }
}
