
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.CharacterType;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    private AppTheme() {
    }

    // WARNA APLIKASI
    public static final Color BACKGROUND =
            new Color(245, 247, 250);

    public static final Color CARD_BACKGROUND =
            Color.WHITE;

    public static final Color TEXT_COLOR =
            new Color(45, 55, 72);

    public static final Color GOLD =
            new Color(184, 134, 11);

    // WARNA BERDASARKAN ROLE
    public static final Color WARRIOR_COLOR =
            new Color(255, 230, 230);

    public static final Color MAGE_COLOR =
            new Color(230, 235, 255);

    public static final Color ARCHER_COLOR =
            new Color(225, 245, 230);

    public static final Color HEALER_COLOR =
            new Color(255, 245, 215);

    // FONT APLIKASI
    public static final Font TITLE_FONT =
            new Font("SansSerif", Font.BOLD, 24);

    public static final Font NAME_FONT =
            new Font("SansSerif", Font.BOLD, 18);

    public static final Font BODY_FONT =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font MONO_FONT =
            new Font("Monospaced", Font.PLAIN, 13);

    public static final Font GOLD_LEVEL_FONT =
            BODY_FONT.deriveFont(Font.BOLD, 16f);

    // BORDER
    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(
                            new Color(220, 225, 232), 1),
                    BorderFactory.createEmptyBorder(
                            12, 12, 12, 12)
            );

    public static final Border MAIN_PADDING_BORDER =
            BorderFactory.createEmptyBorder(
                    16, 16, 16, 16);

    // MENGATUR WARNA BERDASARKAN ROLE
    public static Color colorFor(CharacterType type) {

        if (type == CharacterType.WARRIOR) {
            return WARRIOR_COLOR;
        } else if (type == CharacterType.MAGE) {
            return MAGE_COLOR;
        } else if (type == CharacterType.ARCHER) {
            return ARCHER_COLOR;
        } else {
            return HEALER_COLOR;
        }
    }

    // MENGATUR BORDER BERDASARKAN ROLE
    public static Border borderFor(CharacterType type) {

        Color borderColor;

        if (type == CharacterType.WARRIOR) {
            borderColor = new Color(220, 100, 100);
        } else if (type == CharacterType.MAGE) {
            borderColor = new Color(100, 120, 220);
        } else if (type == CharacterType.ARCHER) {
            borderColor = new Color(80, 160, 100);
        } else {
            borderColor = new Color(200, 160, 60);
        }

        return BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(borderColor, 2),
                BorderFactory.createEmptyBorder(
                        12, 12, 12, 12)
        );
    }
}
