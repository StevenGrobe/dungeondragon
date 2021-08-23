package com.dnd.dungeondragon.dao;
import com.dnd.dungeondragon.model.Character;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao {
    public static List<Character> characters = new ArrayList<>();
    static {
        characters.add(new Character(1, new String("Ordinateur portable"), "warrior"));
        characters.add(new Character(2, new String("Aspirateur Robot"), "mage"));
        characters.add(new Character(3, new String("Table de Ping Pong"), "monk"));
    }

    @Override
    public List<Character> findAll() {
        return characters;
    }

    @Override
    public Character findById(int id) {
        Character c = characters.stream()
                .filter(character -> character.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No data !"));
        return c;
    }

    @Override
    public Character save(Character character) {
        characters.add(character);
        return character;
    }
}
