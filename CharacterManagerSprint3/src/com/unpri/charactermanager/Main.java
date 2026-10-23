
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.controller.CharacterController;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Tiga karakter awal
        manager.addCharacter(
            new Character("Arjuna", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("Merlin", CharacterType.MAGE, 3)
        );

        manager.addCharacter(
            new Character("Athena", CharacterType.ARCHER, 4)
        );

        // Dua karakter baru
        manager.addCharacter(
            new Character("Bima", CharacterType.WARRIOR, 7)
        );

        manager.addCharacter(
            new Character("Sakura", CharacterType.HEALER, 6)
        );

        CharacterController controller =
            new CharacterController(manager);

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(controller);
            window.setVisible(true);
        });
    }
}
