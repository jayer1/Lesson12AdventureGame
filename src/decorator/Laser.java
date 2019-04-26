package decorator;

public class Laser extends CharacterDecorator {

    public Laser(Character character) {
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

