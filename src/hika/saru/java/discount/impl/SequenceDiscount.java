package hika.saru.java.discount.impl;

import hika.saru.java.Screening;
import hika.saru.java.discount.DiscountCondition;

public abstract class SequenceDiscount implements DiscountCondition {
    private final int sequence;

    SequenceDiscount(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public final boolean isSatisfiedBy(Screening screening, int audienceCount) {
        return screening.sequence == sequence;
    }
}