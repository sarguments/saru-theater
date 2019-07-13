package hika.saru.java.discount;

import hika.saru.java.vo.Money;
import hika.saru.java.Screening;
import hika.saru.java.discount.impl.AmountDiscount;

public class SequenceAmountDiscount extends AmountDiscount {
    private final int sequence;

    public SequenceAmountDiscount(Money amount, int sequence) {
        super(amount);
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening, int audienceCount) {
        return screening.sequence == sequence;
    }
}
