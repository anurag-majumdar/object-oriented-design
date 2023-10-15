package lld.dog_owner.food;

import lombok.Data;

@Data
public class Food {
    private String name;
    public Food(String name) {
        this.name = name;
    }
}
