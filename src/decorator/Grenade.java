package decorator;

public class Grenade extends CharacterDecorator {

    public Grenade(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Grenade-Launcher";
    }

    @Override
    public double getMight() {
        return character.getMight() + 5;
    }
}
