package io.github.stephenlindstrom.taco_cloud;
import java.util.Optional;

public interface IngredientRepository {

  Iterable<Ingredient> findAll();

  Optional<Ingredient> findById(String id);

  Ingredient save(Ingredient ingredient);
  
} 
