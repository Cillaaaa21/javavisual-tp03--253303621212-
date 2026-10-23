
package com.unpri.charactermanager.controller;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import java.util.ArrayList;

public class CharacterController {

    private final CharacterManager manager;

    public CharacterController(CharacterManager manager) {
        this.manager = manager;
    }

    public ArrayList<Character> getAllCharacters() {
        return manager.getAllCharacters();
    }

    public double getAverageLevel() {
        return manager.getAverageLevel();
    }

    public int getTotalCharacters() {
        return manager.getTotalCharacters();
    }
}
