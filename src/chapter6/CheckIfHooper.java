package chapter6;

public class CheckIfHooper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
