package hu.kutya.car.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GPS extends BaseAccessory {
    public GPS(UUID id, int price) {
        this(id, price, new HashSet<>());
    }

    public GPS(
            UUID id,
            int price,
            Set<CompatibilityHolder> compatibilities
    ) {
        super(id, price, compatibilities);
    }

    @Override
    public void visit(Car car) {
        car.setGps(this);
    }
}
