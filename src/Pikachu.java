public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactTrueno() { System.out.println("Hola soy Pikachu y este es mi ataque Impact Trueno"); }

    @Override
    public void atacarPunio() { System.out.println("Hola soy Pikachu y este es mi ataque Puño"); }
}
