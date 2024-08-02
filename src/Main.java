import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Character User = new Character() {
        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public int getHealth() {
            return super.getHealth();
        }

        @Override
        public int getPower() {
            return super.getPower();
        }

        @Override
        public int getAgility() {
            return super.getAgility();
        }

        @Override
        public int getExp() {
            return super.getExp();
        }

        @Override
        public int getGold() {
            return super.getGold();
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public boolean attack(Character target) {
            return super.attack(target);
        }
    }
}