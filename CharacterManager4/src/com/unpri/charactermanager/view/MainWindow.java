
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

    private static final int GOLD_LEVEL_THRESHOLD = 5;

    private final CharacterManager manager;
    private final JPanel characterPanel;

    private final JLabel totalLabel;
    private final JLabel averageLabel;

    public MainWindow(CharacterManager manager) {

        this.manager = manager;

        setTitle("Character Manager - TP10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PANEL UTAMA
        JPanel mainPanel = new JPanel(
                new BorderLayout(12, 12));

        mainPanel.setBackground(AppTheme.BACKGROUND);
        mainPanel.setOpaque(true);
        mainPanel.setBorder(AppTheme.MAIN_PADDING_BORDER);

        // JUDUL
        JLabel titleLabel = new JLabel(
                "CHARACTER MANAGER",
                SwingConstants.CENTER);

        titleLabel.setFont(AppTheme.TITLE_FONT);
        titleLabel.setForeground(AppTheme.TEXT_COLOR);

        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // PANEL KARAKTER
        characterPanel = new JPanel(
                new GridLayout(0, 2, 12, 12));

        characterPanel.setBackground(AppTheme.BACKGROUND);
        characterPanel.setOpaque(true);

        JScrollPane scrollPane =
                new JScrollPane(characterPanel);

        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(
                AppTheme.BACKGROUND);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // PANEL STATISTIK
        JPanel statsPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 20, 10));

        statsPanel.setBackground(AppTheme.CARD_BACKGROUND);
        statsPanel.setBorder(AppTheme.CARD_BORDER);
        statsPanel.setOpaque(true);

        totalLabel = new JLabel("Total karakter: 0");
        totalLabel.setFont(AppTheme.BODY_FONT);
        totalLabel.setForeground(AppTheme.TEXT_COLOR);

        averageLabel = new JLabel("Rata-rata level: 0.0");
        averageLabel.setFont(AppTheme.MONO_FONT);
        averageLabel.setForeground(AppTheme.TEXT_COLOR);

        statsPanel.add(totalLabel);
        statsPanel.add(averageLabel);

        mainPanel.add(statsPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);

        refreshCharacters();

        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
    }

    // MEMPERBARUI DATA KARAKTER
    public void refreshCharacters() {

        characterPanel.removeAll();

        List<Character> characters = manager.getAll();

        int totalLevel = 0;

        for (Character character : characters) {

            characterPanel.add(
                    createCharacterCard(character));

            totalLevel += character.getLevel();
        }

        totalLabel.setText(
                "Total karakter: " + characters.size());

        double averageLevel = characters.isEmpty()
                ? 0.0
                : (double) totalLevel / characters.size();

        averageLabel.setText(
                String.format(
                        "Rata-rata level: %.1f",
                        averageLevel));

        characterPanel.revalidate();
        characterPanel.repaint();
    }

    // MEMBUAT KARTU KARAKTER
    private JPanel createCharacterCard(Character character) {

        JPanel card = new JPanel(
                new GridLayout(0, 1, 4, 4));

        card.setBackground(
                AppTheme.colorFor(character.getType()));

        card.setBorder(
                AppTheme.borderFor(character.getType()));

        card.setOpaque(true);

        // NAMA
        JLabel nameLabel =
                new JLabel(character.getName());

        nameLabel.setFont(AppTheme.NAME_FONT);
        nameLabel.setForeground(AppTheme.TEXT_COLOR);

        // ROLE
        JLabel typeLabel =
                new JLabel("Role: " + character.getType());

        typeLabel.setFont(AppTheme.BODY_FONT);
        typeLabel.setForeground(AppTheme.TEXT_COLOR);

        // LEVEL
        JLabel levelLabel =
                new JLabel("Level: " + character.getLevel());

        levelLabel.setFont(AppTheme.BODY_FONT);
        levelLabel.setForeground(AppTheme.TEXT_COLOR);

        // LEVEL 5 KE ATAS BERWARNA EMAS DAN TEBAL
        if (character.getLevel() >= GOLD_LEVEL_THRESHOLD) {

            levelLabel.setForeground(AppTheme.GOLD);
            levelLabel.setFont(AppTheme.GOLD_LEVEL_FONT);
        }

        // HP
        JLabel hpLabel =
                new JLabel("HP: " + character.getHitPoints());

        hpLabel.setFont(AppTheme.BODY_FONT);
        hpLabel.setForeground(AppTheme.TEXT_COLOR);

        // ATTACK POWER
        JLabel attackLabel =
                new JLabel(
                        "Attack Power: "
                        + character.getAttackPower());

        attackLabel.setFont(AppTheme.BODY_FONT);
        attackLabel.setForeground(AppTheme.TEXT_COLOR);

        card.add(nameLabel);
        card.add(typeLabel);
        card.add(levelLabel);
        card.add(hpLabel);
        card.add(attackLabel);

        // PROPERTI TAMBAHAN 1: TOOLTIP
        card.setToolTipText(
                character.getName()
                + " - " + character.getType()
                + " - HP: " + character.getHitPoints()
                + " - Attack: " + character.getAttackPower());

        return card;
    }
}
