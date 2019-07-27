package hika.saru.java.discount.impl;

import hika.saru.java.discount.DiscountCondition;
import hika.saru.java.discount.DiscountPolicy;
import hika.saru.java.vo.Money;

public abstract class PercentDiscount implements DiscountPolicy.PERCENT, DiscountCondition {
    private final double percent;

    public PercentDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public final Money calculateFee(Money fee) {
        return fee.minus(fee.multi(percent));
    }
}
