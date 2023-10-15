package lld.dog_owner.dog;

import lld.dog_owner.food.Food;

public interface IDog {
    public void eat(Food food);
    public void run();
    public void sleep();
    public void bark();
}
