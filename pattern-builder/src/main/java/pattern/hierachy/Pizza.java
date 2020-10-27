package pattern.hierachy;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, SAUSAGE, ONION}

    ;
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        private final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

class NYPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    private NYPizza(Builder builder){
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "NYPizza{" +
                "toppings=" + toppings +
                ", size=" + size +
                '}';
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        Builder(Size size) {
            this.size = size;
        }

        @Override
        NYPizza build() {
            return new NYPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

class Calzone extends Pizza {
    private final boolean sauceInside;

    Calzone(CalzoneBuilder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "toppings=" + toppings +
                ", sauceInside=" + sauceInside +
                '}';
    }

    public static class CalzoneBuilder extends Pizza.Builder<CalzoneBuilder> {
        private boolean sauceInside = false;

        public CalzoneBuilder addSauce() {
            sauceInside = true;
            return self();
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected CalzoneBuilder self() {
            return this;
        }
    }
}