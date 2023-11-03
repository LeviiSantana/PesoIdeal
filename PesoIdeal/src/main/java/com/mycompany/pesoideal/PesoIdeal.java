/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pesoideal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aluno
 */
public class PesoIdeal {

    private JButton Homem;
    private JButton Mulher;
    private JTextField valor1;

    private JTextField result;

    double resultado;

    public void janela() {
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();
        JLabel label1 = new JLabel(" Digite a sua altura ");

        valor1 = new JTextField(15);

        JLabel label3 = new JLabel();

        Homem = new JButton("Homem");
        Mulher = new JButton("Mulher");
        jpanel.add(label1);
        jpanel.add(valor1);

        jpanel.add(label3);
        result = new JTextField(15);

        jpanel.add(Homem);
        jpanel.add(Mulher);
        jpanel.add(result);
        jframe.add(jpanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(150, 150, 250, 250);
        jframe.setVisible(true);

        Handler cont = new Handler();
        Homem.addActionListener(cont);
        Mulher.addActionListener(cont);

    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            if (evento.getActionCommand().equals("Homem")) {
                resultado = 72.7 * Double.parseDouble(valor1.getText()) - 58;
            }

            if (evento.getActionCommand().equals("Mulher")) {
                resultado = 62.1 * Double.parseDouble(valor1.getText()) - 44.7;

            }
            result.setText(String.valueOf(resultado));

        }
    }

public static void main(String[] args) {
            PesoIdeal CS = new PesoIdeal();
            CS.janela();
        }
    }
