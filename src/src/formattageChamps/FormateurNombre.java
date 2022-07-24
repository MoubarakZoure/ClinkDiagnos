/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.formattageChamps;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author MoubarakZoure
 */
public class FormateurNombre {

    private boolean isNumpad;

    /**
     * ajoute des listenneurs aux champs textField qui le permet de prendre
     * unique des chiffres
     *
     * @param textField
     */
    public void formatter(JTextField textField) {

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                control(e, textField);
            }

            /**
             * Invoked when a key has been pressed.
             */
            @Override
            public void keyPressed(KeyEvent e) {
                isNumpad = (e.getKeyLocation() == KeyEvent.KEY_LOCATION_NUMPAD);

            }

        });

    }

    /**
     *
     * Cette méthode vérifie que la touche temps est pour un nombre décimal
     *
     * @param e
     * @param textField
     *
     */
    public void control(KeyEvent e, JTextField textField) {

        if (!(isTypedKeyNumpad(e) && isNumpad)) //entrée non valide
        {
            e.consume();
            return;

        }
        String fieldValue = textField.getText();
        String typedChar = e.getKeyChar() + "";
        if ((e.getKeyChar() == KeyEvent.VK_DELETE) && fieldValue.equals("0")) {
            textField.setText("");
            return;

        }

        if (fieldValue.equals("0") && (!typedChar.equals("."))) {

            e.consume();
          
            textField.setText(typedChar);
            return;

        }
        if (fieldValue.startsWith("0") && fieldValue.length() == 1 && typedChar.equals("0")) //condition du ou est de ne pas avoir 055 ou 005
        {
            e.consume();
            return;

        }

        if (fieldValue.contains(".") && typedChar.equals(".")) {
            e.consume();
            return;

        }
    }

    public boolean isTypedKeyNumpad(KeyEvent e) {
        char typedKeyChar = e.getKeyChar();
        return (((typedKeyChar >= '0') && (typedKeyChar <= '9')) || typedKeyChar == '.') || ((typedKeyChar == KeyEvent.VK_DELETE));
    }

}
