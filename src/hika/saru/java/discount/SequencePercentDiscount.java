package hika.saru.java.discount;

import hika.saru.java.Screening;
import hika.saru.java.discount.impl.PercentDiscount;

public class SequencePercentDiscount extends PercentDiscount {
    private final int sequence;

    public SequencePercentDiscount(double pecent, int sequence) {
        super(pecent);
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening, int audienceCount) {
        return screening.sequence == sequence;
    }
}
