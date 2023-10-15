package lld.dog_owner.dog;

import lld.dog_owner.food.Food;
import lombok.Data;

@Data
public class Dog implements IDog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.println("Dog is eating: " + food.getName());
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void bark() {

    }
}
