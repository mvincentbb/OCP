package chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {
    public static void main(String[] args) {
        /*list of animal*/
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false,true));
        animals.add(new Animal("kangourou", true,false));
        animals.add(new Animal("rabbit", true,false));
        animals.add(new Animal("turtle", false,true));

//        print(animals, new CheckIfHooper())
        print(animals, (Animal a ) -> a.canHop());
    }


    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals) {
            //the general check
            if(checker.test(animal)){
                System.out.println(animal + "");
            }
            System.out.println();
        }
    }
 /*   public void variables(int a){
        int b = 2;
        Predicate<Integer> p1 = a *//* a is already defined in this scope*//*->{
            int b =0;
            int c = 0;
            return b == c;
        } // missing a ; because you just declare a p1 variables
    }*/

}