package JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit;

import lombok.Getter;

import java.util.Random;
@Getter
public abstract class Fruit {

        public Fruit() {
            this.isRotten = false;
        }

        protected String color;
        protected Double weight;
        private boolean isRotten;

        public boolean isRotten() {
            if(!isRotten) {
                isRotten = new Random().nextBoolean();
            }
            return isRotten;
        }
}
