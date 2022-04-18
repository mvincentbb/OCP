package chapter6;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speiesName, boolean hopper, boolean swimmer){
        species = speiesName;
        canHop = hopper;
        swimmer = canSwim;
    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim() { return canSwim; }
    public String toString(){ return species; }
}


