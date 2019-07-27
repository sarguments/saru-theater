package hika.saru.java.discount;

import hika.saru.java.Screening;
import hika.saru.java.vo.Money;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening, int audienceCount);

    public Money calculateFee(Money fee);
}
