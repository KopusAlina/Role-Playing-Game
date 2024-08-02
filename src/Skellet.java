public class Skellet extends Character{
    public Skellet(String name, int health, int power, int agility, int exp, int gold) {
        super(name, health, power, agility, exp, gold);
    }
}
//В теории мы могли бы обойтись и одним классом, а при создании просто давать разные имена и устанавливать разные параметры,
// но в будущем мы можем дать разным монстрам разные специальные атаки и особенности.