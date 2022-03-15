public class Carriage extends Vehicle {

    private int numHorses;

    public Carriage(String name, int wheels, int numHorses) {
        super(name, wheels);
        this.numHorses = numHorses;
    }

    public int getNumHorses() {
        return numHorses;
    }

    public void feedHorses() {
        System.out.println("The horses have been fed and are ready for travel!");
    }

}
