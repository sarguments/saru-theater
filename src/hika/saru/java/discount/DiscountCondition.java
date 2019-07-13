package hika.saru.java.discount;

import hika.saru.java.vo.Money;
import hika.saru.java.Screening;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening, int audienceCount);

    public Money calculateFee(Money fee);
}
