

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.text.*;
import javax.swing.*;

import utilitarios.ConexaoBD;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PROJETO1 extends JFrame {

    int controla;
    ResultSet rs;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                login thisClass = new login();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
                thisClass.setTitle("Tela de Login");
                thisClass.setSize(289, 195);
            }
        });
    }

    public login() {
        super("Login");
    initialize();
    }
