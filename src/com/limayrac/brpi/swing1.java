package com.limayrac.brpi;

import javax.swing.*;
import java.awt.event.*;

public class swing1 extends JFrame {

    public swing1() {
        super("Mots Flechés");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(500,400);
        setVisible(true);
    }
}