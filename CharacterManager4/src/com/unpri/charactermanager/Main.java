
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // MENAMBAHKAN 6 KARAKTER
        manager.add(new Character(
                "Arjuna", CharacterType.WARRIOR, 5));

        manager.add(new Character(
                "Merlin", CharacterType.MAGE, 3));

        manager.add(new Character(
                "Athena", CharacterType.ARCHER, 4));

        manager.add(new Character(
                "Luna", CharacterType.HEALER, 6));

        manager.add(new Character(
                "Ragnar", CharacterType.WARRIOR, 8));

        manager.add(new Character(
                "Elara", CharacterType.MAGE, 2));

        // MENJALANKAN GUI
        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow(manager);

            window.setVisible(true);
        });
    }
}
