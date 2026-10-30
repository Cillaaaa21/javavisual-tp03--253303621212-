
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private final List<Character> characters =
            new ArrayList<>();

    // Menambahkan karakter
    public boolean add(Character character) {

        if (character == null) {
            return false;
        }

        if (characters.contains(character)) {
            return false;
        }

        characters.add(character);
        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {

        for (Character character : characters) {

            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }
        }

        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean remove(String name) {

        Character character = findByName(name);

        if (character == null) {
            return false;
        }

        characters.remove(character);
        return true;
    }

    // Menghitung total karakter
    public int getTotal() {
        return characters.size();
    }

    // Mengambil semua karakter
    public List<Character> getAll() {
        return new ArrayList<>(characters);
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0.0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }
}
