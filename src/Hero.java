public class Hero extends Character{
    public Hero(String name, int health, int power, int agility, int exp, int gold) {
        super(name, health, power, agility, exp, gold);
        //int sayer();
    }
}

//Тут мы просто наследуемся от Character и создаем конструктор, в параметрах которого
// мы пробрасываем значения в родительский класс. Также вы можете добавить в будущем особые черты
// для этого класса, например умение разговаривать.