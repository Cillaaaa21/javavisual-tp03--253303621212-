
package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor utama
    public Character(String name, CharacterType type, int level) {

        this.name = name;
        this.type = type;
        this.mana = 0;

        setLevel(level);
    }

    // Getter
    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public void setLevel(int level) {

        if (level < 1) {
            throw new IllegalArgumentException(
                    "Level harus minimal 1");
        }

        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 20 + (level * 5);
    }

    public void setMana(int mana) {

        if (mana < 0) {
            throw new IllegalArgumentException(
                    "Mana tidak boleh negatif");
        }

        this.mana = mana;
    }

    // Membandingkan karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name != null
                && other.name != null
                && name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name == null ? null : name.toLowerCase());
    }
}
