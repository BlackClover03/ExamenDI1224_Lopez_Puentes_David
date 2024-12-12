/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examendi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import java.awt.Component;
import java.awt.Container;
import javax.swing.WindowConstants;


/**
 *
 * @author dl260
 */
public class Escuela extends javax.swing.JFrame {
    private notasDefecto ventana = new notasDefecto();
    /**
     * Creates new form Escuela
     */
    public Escuela() {
        initComponents();
        
        CursosBox.setSelectedItem("CURSO 1");
        actualizarAlumnos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTabuladoDatos = new javax.swing.JTabbedPane();
        PanelDatos1 = new javax.swing.JPanel();
        Nota_Asignatura1 = new javax.swing.JSpinner();
        Nota_Asignatura4 = new javax.swing.JSpinner();
        Nota_Asignatura2 = new javax.swing.JSpinner();
        Nota_Asignatura3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelPersonalizado1 = new com.mycompany.examendi.JlabelPersonalizado();
        jButton1 = new javax.swing.JButton();
        PanelDatos2 = new javax.swing.JPanel();
        CursosBox = new javax.swing.JComboBox<>();
        AlumnosBox = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_pdf = new javax.swing.JButton();
        btn_grafica = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTabuladoDatos.setMinimumSize(new java.awt.Dimension(100, 100));

        PanelDatos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelDatos1.add(Nota_Asignatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 50));
        PanelDatos1.add(Nota_Asignatura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 150, 50));
        PanelDatos1.add(Nota_Asignatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 50));
        PanelDatos1.add(Nota_Asignatura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 150, 50));

        jLabel1.setText("nota asignatura 3");
        PanelDatos1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 140, 50));

        jLabel2.setText("nota asignatura 1");
        PanelDatos1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        jLabel3.setText("nota asignatura 2");
        PanelDatos1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 50));

        jLabel4.setText("nota asignatura 4");
        PanelDatos1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 140, 50));
        PanelDatos1.add(jlabelPersonalizado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, 40));

        jButton1.setText("Comprobar una asignatura");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        PanelDatos1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 190, 40));

        PanelTabuladoDatos.addTab("Datos1", PanelDatos1);

        PanelDatos2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelTabuladoDatos.addTab("Datos2", PanelDatos2);

        getContentPane().add(PanelTabuladoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 700, 270));

        CursosBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLASE 1", "CLASE 2" }));
        CursosBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursosBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CursosBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, 50));

        AlumnosBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosBoxActionPerformed(evt);
            }
        });
        getContentPane().add(AlumnosBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 230, 50));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 50));

        btn_pdf.setText("GENERAR PDF");
        btn_pdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pdfMouseClicked(evt);
            }
        });
        getContentPane().add(btn_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 140, 50));

        btn_grafica.setText("GENERAR GRAFICA");
        btn_grafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_graficaMouseClicked(evt);
            }
        });
        getContentPane().add(btn_grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 140, 50));

        jMenu1.setText("notas a 1");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tmaño minimo ventana");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CursosBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursosBoxActionPerformed
        actualizarAlumnos();
    }//GEN-LAST:event_CursosBoxActionPerformed

    private void AlumnosBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumnosBoxActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String cursoSeleccionado = (String) CursosBox.getSelectedItem();
        String alumnoSeleccionado = (String) AlumnosBox.getSelectedItem();

        if (alumnoSeleccionado == null || cursoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso y un alumno.");
            return;
        }

        try {
            int notaA1 = (int) Nota_Asignatura1.getValue();
            int notaA2 = (int) Nota_Asignatura2.getValue();
            int notaA3 = (int) Nota_Asignatura3.getValue();
            int notaA4 = (int) Nota_Asignatura4.getValue();


            File archivoExcel = new File(cursoSeleccionado + ".xlsx");
            Workbook libro;
            Sheet hoja;

            if (archivoExcel.exists()) {
                try (FileInputStream fis = new FileInputStream(archivoExcel)) {
                    libro = new XSSFWorkbook(fis);
                }
            } else {
                libro = new XSSFWorkbook();
            }

            hoja = libro.getSheet(alumnoSeleccionado);
            if (hoja == null) {
                hoja = libro.createSheet(alumnoSeleccionado);
                Row encabezado = hoja.createRow(0);
                encabezado.createCell(0).setCellValue("nota asignatura 1");
                encabezado.createCell(1).setCellValue("nota asignatura 2");
                encabezado.createCell(2).setCellValue("nota asignatura 3");
                encabezado.createCell(3).setCellValue("nota asignatura 4");
                
                encabezado.setHeightInPoints(25);
            }

            int ultimaFila = hoja.getLastRowNum() + 1;
            Row fila = hoja.createRow(ultimaFila);
            fila.createCell(0).setCellValue(notaA1);
            fila.createCell(1).setCellValue(notaA2);
            fila.createCell(2).setCellValue(notaA3);
            fila.createCell(3).setCellValue(notaA4);

            for (int col = 0; col <= 3; col++) {
                hoja.setColumnWidth(col, 20 * 256);
            }
            
            actualizarHojaMedias(libro, cursoSeleccionado);

            try (FileOutputStream fos = new FileOutputStream(archivoExcel)) {
                libro.write(fos);
            }
            libro.close();

            JOptionPane.showMessageDialog(this, "Estadísticas guardadas correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar estadísticas: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_graficaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_graficaMouseClicked
        String cursoSeleccionado = (String) CursosBox.getSelectedItem();
        String alumnoSeleccionado = (String) AlumnosBox.getSelectedItem();

        if (cursoSeleccionado == null || alumnoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso y un alumno.");
            return;
        }

        File archivoExcel = new File(cursoSeleccionado + ".xlsx");
        if (!archivoExcel.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo del curso seleccionado no existe.");
            return;
        }

        DefaultCategoryDataset datasetBarras = new DefaultCategoryDataset();
        DefaultCategoryDataset datasetLinea = new DefaultCategoryDataset();

        try (FileInputStream fis = new FileInputStream(archivoExcel)) {
            Workbook libro = new XSSFWorkbook(fis);
            Sheet hoja = libro.getSheet(alumnoSeleccionado);

            if (hoja == null) {
                JOptionPane.showMessageDialog(this, "No hay datos para el alumno seleccionado.");
                return;
            }

            Row encabezado = hoja.getRow(0);
            if (encabezado == null) {
                JOptionPane.showMessageDialog(this, "No hay encabezados en la hoja del alumno.");
                return;
            }

            Row ultimaFila = hoja.getRow(hoja.getLastRowNum());
            if (ultimaFila == null) {
                JOptionPane.showMessageDialog(this, "No hay datos de notas para el alumno seleccionado.");
                return;
            }

            for (int i = 0; i < encabezado.getLastCellNum(); i++) {
                String asignatura = encabezado.getCell(i).getStringCellValue();
                if (ultimaFila.getCell(i) != null && ultimaFila.getCell(i).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC) {
                    double nota = ultimaFila.getCell(i).getNumericCellValue();
                    datasetBarras.addValue(nota, "Notas", asignatura);
                }
            }

            for (int col = 0; col < encabezado.getLastCellNum(); col++) {
                double media = calcularMedia(hoja, col);
                String asignatura = encabezado.getCell(col).getStringCellValue();
                datasetLinea.addValue(media, "Medias", asignatura);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo Excel: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Notas por Asignatura de " + alumnoSeleccionado,
                "Asignaturas",
                "Notas",
                datasetBarras
        );

        JFreeChart graficoLineas = ChartFactory.createLineChart(
                "Medias por Asignatura de " + alumnoSeleccionado,
                "Asignaturas",
                "Media",
                datasetLinea
        );

        try {
            File carpetaGraficas = new File("graficas");
            if (!carpetaGraficas.exists()) {
                carpetaGraficas.mkdir();
            }

            File carpetaAlumno = new File(carpetaGraficas, alumnoSeleccionado);
            if (!carpetaAlumno.exists()) {
                carpetaAlumno.mkdir();
            }

            File archivoGraficoBarras = new File(carpetaAlumno, "grafico_notas_barras.jpg");
            if (archivoGraficoBarras.exists()) {
                archivoGraficoBarras.delete();
            }
            ChartUtils.saveChartAsJPEG(archivoGraficoBarras, graficoBarras, 800, 600);

            File archivoGraficoLineas = new File(carpetaAlumno, "grafico_medias_lineas.jpg");
            if (archivoGraficoLineas.exists()) {
                archivoGraficoLineas.delete();
            }
            ChartUtils.saveChartAsJPEG(archivoGraficoLineas, graficoLineas, 800, 600);

            JOptionPane.showMessageDialog(this, "Gráficas guardadas en la carpeta: " + carpetaAlumno.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar las gráficas: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_graficaMouseClicked

    private void btn_pdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pdfMouseClicked
        String cursoSeleccionado = (String) CursosBox.getSelectedItem();
        String alumnoSeleccionado = (String) AlumnosBox.getSelectedItem();

        if (cursoSeleccionado == null || alumnoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso y un alumno.");
            return;
        }

        File archivoExcel = new File(cursoSeleccionado + ".xlsx");
        if (!archivoExcel.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo del curso seleccionado no existe.");
            return;
        }

        double[] notas = new double[6];
        double totalNotas = 0;
        int numFilas = 0;

        try (FileInputStream fis = new FileInputStream(archivoExcel)) {
            Workbook libro = new XSSFWorkbook(fis);
            Sheet hoja = libro.getSheet(alumnoSeleccionado);

            if (hoja == null) {
                JOptionPane.showMessageDialog(this, "No hay datos para el alumno seleccionado.");
                return;
            }

            for (int i = 1; i <= hoja.getLastRowNum(); i++) {
                Row fila = hoja.getRow(i);
                if (fila == null) continue;

                for (int j = 0; j < 4; j++) {
                    if (fila.getCell(j) != null) {
                        notas[j] += fila.getCell(j).getNumericCellValue();
                    }
                }
                numFilas++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo Excel: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        double[] medias = new double[8];
        for (int i = 0; i < 8; i++) {
            medias[i] = numFilas > 0 ? notas[i] / numFilas : 0;
        }

        try {
            File carpetaGraficas = new File("graficas", alumnoSeleccionado);
            if (!carpetaGraficas.exists()) {
                JOptionPane.showMessageDialog(this, "No se encontraron las gráficas para el alumno seleccionado.");
                return;
            }

            String pdfFileName = carpetaGraficas.getAbsolutePath() + "/" + alumnoSeleccionado + "_" + cursoSeleccionado + ".pdf";
            PdfWriter writer = new PdfWriter(pdfFileName);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            
            pdfDoc.setDefaultPageSize(com.itextpdf.kernel.geom.PageSize.A4);

            PdfFont titleFont = PdfFontFactory.createFont();
            Paragraph title = new Paragraph(alumnoSeleccionado + " - " + cursoSeleccionado)
                    .setFont(titleFont)
                    .setFontSize(20)
                    .setBold()
                    .setTextAlignment(TextAlignment.CENTER);
            document.add(title);
            document.add(new Paragraph("\n"));

            File graficoBarrasFile = new File(carpetaGraficas, "grafico_notas_barras.jpg");
            if (graficoBarrasFile.exists()) {
                ImageData graficoBarrasData = ImageDataFactory.create(graficoBarrasFile.getAbsolutePath());
                Image graficoBarras = new Image(graficoBarrasData);
                graficoBarras.scaleToFit(250, 150);
                document.add(graficoBarras);
                document.add(new Paragraph("\n"));
            }

            File graficoLineasFile = new File(carpetaGraficas, "grafico_medias_lineas.jpg");
            if (graficoLineasFile.exists()) {
                ImageData graficoLineasData = ImageDataFactory.create(graficoLineasFile.getAbsolutePath());
                Image graficoLineas = new Image(graficoLineasData);
                graficoLineas.scaleToFit(250, 150);
                document.add(graficoLineas);
                document.add(new Paragraph("\n"));
            }

            Paragraph stats = new Paragraph("Notas y Medias:\n")
                    .setFont(titleFont)
                    .setFontSize(12)
                    .setTextAlignment(TextAlignment.LEFT);
            for (int i = 0; i < 8; i++) {
                stats.add("Asignatura " + (i + 1) + ": Nota Total: " + String.format("%.2f", notas[i]) + ", Media: " + String.format("%.2f", medias[i]) + "\n");
            }
            document.add(stats);

            document.close();

            JOptionPane.showMessageDialog(this, "PDF generado: " + pdfFileName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_pdfMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Nota_Asignatura1.setValue(1);
        Nota_Asignatura2.setValue(1);
        Nota_Asignatura3.setValue(1);
        Nota_Asignatura4.setValue(1);
        if (ventana == null || !ventana.isVisible()) {
                ventana = new notasDefecto();
                ventana.setVisible(true);
            } else {
                ventana.toFront();
            }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String texto = jlabelPersonalizado1.getText();
        int nota = (int) Nota_Asignatura1.getValue();
        for (Component component : getContentPane().getComponents()) {
            if (component instanceof JlabelPersonalizado) {
                JlabelPersonalizado label = (JlabelPersonalizado) component;
                label.configurarEstilo(texto, nota);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escuela().setVisible(true);
            }
        });
    }
    
    private void actualizarAlumnos() {
        String equipoSeleccionado = (String) CursosBox.getSelectedItem();
        AlumnosBox.removeAllItems();

        if ("CLASE 1".equals(equipoSeleccionado)) {
            AlumnosBox.addItem("Alumno 1A");
            AlumnosBox.addItem("Alumno 2A");
            AlumnosBox.addItem("Alumno 3A");
            AlumnosBox.addItem("Alumno 4A");
            AlumnosBox.addItem("Alumno 5A");
            AlumnosBox.addItem("Alumno 6A");
            AlumnosBox.addItem("Alumno 7A");
            AlumnosBox.addItem("Alumno 8A");
        } else if ("CLASE 2".equals(equipoSeleccionado)) {
            AlumnosBox.addItem("Alumno 1B");
            AlumnosBox.addItem("Alumno 2B");
            AlumnosBox.addItem("Alumno 3B");
            AlumnosBox.addItem("Alumno 4B");
            AlumnosBox.addItem("Alumno 5B");
            AlumnosBox.addItem("Alumno 6B");
            AlumnosBox.addItem("Alumno 7B");
            AlumnosBox.addItem("Alumno 8B");
        }
    }
    
    private void actualizarHojaMedias(Workbook libro, String cursoSeleccionado) {
        Sheet hojaMedias = libro.getSheet("Medias");
        if (hojaMedias == null) {
            hojaMedias = libro.createSheet("Medias");
            Row encabezado = hojaMedias.createRow(0);
            encabezado.createCell(0).setCellValue("Alumno");
            encabezado.createCell(1).setCellValue("Media nota asignatura 1");
            encabezado.createCell(2).setCellValue("Media nota asignatura 2");
            encabezado.createCell(3).setCellValue("Media nota asignatura 3");
            encabezado.createCell(4).setCellValue("Media nota asignatura 4");


            
            encabezado.setHeightInPoints(25);
        }

        int filaMedias = 1;
        for (int i = 0; i < AlumnosBox.getItemCount(); i++) {
            String Alumno = AlumnosBox.getItemAt(i);
            Sheet hojaAlumno = libro.getSheet(Alumno);
            if (hojaAlumno != null) {
                Row filaMedia = hojaMedias.getRow(filaMedias);
                if (filaMedia == null) {
                    filaMedia = hojaMedias.createRow(filaMedias);
                }
                filaMedia.createCell(0).setCellValue(Alumno);

                for (int col = 0; col <= 3; col++) {
                    double media = calcularMedia(hojaAlumno, col);
                    filaMedia.createCell(col + 1).setCellValue(media);
                }
                filaMedias++;
            }
        }
        for (int col = 0; col <= 4; col++) {
            hojaMedias.setColumnWidth(col, 25 * 256);
        }
    }
    
    private double calcularMedia(Sheet hoja, int columna) {
        double suma = 0;
        int filasValidas = 0;

        for (int i = 1; i <= hoja.getLastRowNum(); i++) {
            Row fila = hoja.getRow(i);
            if (fila != null) {
                if (fila.getCell(columna) != null && fila.getCell(columna).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC) {
                    suma += fila.getCell(columna).getNumericCellValue();
                    filasValidas++;
                }
            }
        }
        return filasValidas == 0 ? 0 : suma / filasValidas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AlumnosBox;
    private javax.swing.JComboBox<String> CursosBox;
    private javax.swing.JSpinner Nota_Asignatura1;
    private javax.swing.JSpinner Nota_Asignatura2;
    private javax.swing.JSpinner Nota_Asignatura3;
    private javax.swing.JSpinner Nota_Asignatura4;
    private javax.swing.JPanel PanelDatos1;
    private javax.swing.JPanel PanelDatos2;
    private javax.swing.JTabbedPane PanelTabuladoDatos;
    private javax.swing.JButton btn_grafica;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_pdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private com.mycompany.examendi.JlabelPersonalizado jlabelPersonalizado1;
    // End of variables declaration//GEN-END:variables
}
