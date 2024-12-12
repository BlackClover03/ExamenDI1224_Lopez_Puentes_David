/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examendi;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dl260
 */
public final class JlabelPersonalizado extends JLabel{
    public JlabelPersonalizado() {
        super("Texto por defecto");
    }
    
    public JlabelPersonalizado(String texto, int notaAlumno) {
        super(texto);
        configurarEstilo(texto, notaAlumno);
    }

    void configurarEstilo(String texto, int notaAlumno) {
        setForeground(determinarColor(texto, notaAlumno));
        setBackground(Color.CYAN);
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new Font("Arial", Font.BOLD, 12));
    }
    
    public Color determinarColor(String texto, int notaAlumno) {
        switch (notaAlumno) {
            case 1:
                if (notaAlumno <= 5){
                    texto = "suspenso";
                    return Color.RED;
                }
            case 2:
                if (notaAlumno > 5){
                    texto = "aprobado";
                    return Color.BLACK;
                }
            default:
                return Color.BLACK;
        }
    }
}
