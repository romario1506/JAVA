package lesson8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text){
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN,30));
        setBackground(new Color(0xFFF8BE06, true));

    }
}
