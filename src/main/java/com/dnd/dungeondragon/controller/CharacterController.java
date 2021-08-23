package com.dnd.dungeondragon.controller;
import com.dnd.dungeondragon.dao.CharacterDao;
import com.dnd.dungeondragon.dao.CharacterDaoImpl;
import com.dnd.dungeondragon.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    private CharacterDao characterDao;

    @GetMapping(value="Personnages")
    public List<Character>listePersonnages() {
        return characterDao.findAll();
    }

    @GetMapping(value = "/Personnages/{id}")
    public Character afficherUnPersonnage(@PathVariable int id) {
        return characterDao.findById(id);
    }

    @PostMapping(value = "Personnages")
    public void ajouterPersonnage(@RequestBody Character character) {
        characterDao.save(character);
    }
}
