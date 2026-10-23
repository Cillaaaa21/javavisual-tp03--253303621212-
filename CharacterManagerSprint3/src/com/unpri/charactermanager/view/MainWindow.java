
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.controller.CharacterController;
import com.unpri.charactermanager.model.Character;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class MainWindow extends JFrame {

    private final CharacterController controller;
    private final JPanel characterPanel;
    private final JLabel totalLabel;
    private final JLabel averageLevelLabel;

    public MainWindow(CharacterController controller) {
        this.controller = controller;

        setTitle("Character Manager - Sprint #3");
        setSize(520, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        JLabel titleLabel = new JLabel(
            "DAFTAR KARAKTER",
            SwingConstants.CENTER
        );
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        characterPanel = new JPanel();
        characterPanel.setLayout(
            new BoxLayout(characterPanel, BoxLayout.Y_AXIS)
        );

        JScrollPane scrollPane = new JScrollPane(characterPanel);

        JPanel statisticsPanel = new JPanel(
            new GridLayout(2, 1, 5, 5)
        );

        totalLabel = new JLabel();
        averageLevelLabel = new JLabel();

        totalLabel.setFont(new Font("Arial", Font.BOLD, 14));
        averageLevelLabel.setFont(new Font("Arial", Font.BOLD, 14));

        statisticsPanel.add(totalLabel);
        statisticsPanel.add(averageLevelLabel);

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(statisticsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        tampilkanKarakter();
    }

    private void tampilkanKarakter() {
        characterPanel.removeAll();

        for (Character character : controller.getAllCharacters()) {
            JLabel characterLabel = new JLabel(
                character.getName()
                + " | Tipe: " + character.getType()
                + " | Level: " + character.getLevel()
            );

            characterLabel.setBorder(
                BorderFactory.createEmptyBorder(8, 5, 8, 5)
            );

            characterPanel.add(characterLabel);
        }

        totalLabel.setText(
            "Jumlah Karakter: " + controller.getTotalCharacters()
        );

        averageLevelLabel.setText(
            String.format(
                Locale.ROOT,
                "Rata-rata Level: %.2f",
                controller.getAverageLevel()
            )
        );

        characterPanel.revalidate();
        characterPanel.repaint();
    }
}
