package lld.dog_owner;

import lld.dog_owner.dog.Dog;
import lld.dog_owner.dog.IDog;
import lld.dog_owner.food.Food;
import lombok.Data;

@Data
public class DogOwner {
    private String name;
    private IDog dog;
    private Food food;

    public DogOwner(String name, IDog dog, Food food) {
        this.name = name;
        this.dog = dog;
        this.food = food;
    }

    public void feedDog() {
        this.dog.eat(this.food);
    }

    public static void main(String[] args) {
        DogOwner dogOwner = new DogOwner("Anz", new Dog("Murph"), new Food("Bone"));
        dogOwner.feedDog();
    }
}
