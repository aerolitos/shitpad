package GUI;
import functions.functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GUI extends JFrame {
    public static void main(String[] args) {

        //instanciando o objeto, e ''sh!tpad" é o nome que vai aparecer na janela
        JFrame window = new JFrame("sh!tpad");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane, BorderLayout.CENTER);

        functions func = new functions(window, textArea);
        func.createMenu();

        window.setVisible(true);

    }
}

