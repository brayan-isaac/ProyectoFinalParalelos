/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import clases.TimeMemoryWrapper;
import clases.Utils;
import static clases.Utils.getRandomNumber;
import static clases.Utils.memoryHistogram;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodolfo
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        secuencial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        binaria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        burbuja = new javax.swing.JButton();
        insersion = new javax.swing.JButton();
        quickSort = new javax.swing.JButton();
        generarLista = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        binariaVsSecuencial = new javax.swing.JButton();
        BurbujaVsInsertVsQuickSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setColumns(20);
        list.setLineWrap(true);
        list.setRows(5);
        jScrollPane1.setViewportView(list);

        result.setColumns(20);
        result.setRows(5);
        jScrollPane2.setViewportView(result);

        secuencial.setText("SECUENCIAL");
        secuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuencialActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda");

        binaria.setText("BINARIA");
        binaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binariaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ordenar");

        burbuja.setText("BURBUJA");
        burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burbujaActionPerformed(evt);
            }
        });

        insersion.setText("INSERSION");
        insersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insersionActionPerformed(evt);
            }
        });

        quickSort.setText("QUICK SORT");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });

        generarLista.setText("GENERAR LISTA");
        generarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarListaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Entrada (Separar elementos por coma)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Salida");

        binariaVsSecuencial.setText("COMPETIR");
        binariaVsSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binariaVsSecuencialActionPerformed(evt);
            }
        });

        BurbujaVsInsertVsQuickSort.setText("COMPETIR");
        BurbujaVsInsertVsQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurbujaVsInsertVsQuickSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secuencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(burbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(binaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quickSort)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(binariaVsSecuencial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(generarLista))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BurbujaVsInsertVsQuickSort)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secuencial)
                    .addComponent(binaria)
                    .addComponent(binariaVsSecuencial)
                    .addComponent(generarLista))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burbuja)
                    .addComponent(insersion)
                    .addComponent(quickSort)
                    .addComponent(BurbujaVsInsertVsQuickSort))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarListaActionPerformed
        // TODO add your handling code here:
        String listLenght = JOptionPane.showInputDialog(null, "Ingrese el numero de elementos a generar");
        
        int leght = Integer.parseInt(listLenght);
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < leght; i++) {
            sb.append(getRandomNumber(1,1000)+", ");
        }
        
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        
        
        
        list.setText(sb.toString());
        
        
    }//GEN-LAST:event_generarListaActionPerformed

    private void secuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuencialActionPerformed
        // TODO add your handling code here:
        String search = JOptionPane.showInputDialog(null, "Ingrese el numero a buscar");
        String items = list.getText();
        
        int buscar = Integer.parseInt(search);
        int[] array = Utils.stringToArray(items);
        
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setItemBuscar(buscar);
        tWrapper.setBusqueda((numeros, busqueda) -> {
            return Utils.busquedaSecuencial(numeros, busqueda); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        StringBuilder sb = new StringBuilder();
        sb.append("===== Busqueda Secuencial =====\n\n");
        sb.append("Tiempo de busqueda => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        sb.append(tWrapper.getResultSearch()==-1?"No se encontro el elemento '"+search+"' en la lista":"Elemento '"+search+"' encontrado en la posicion "+(tWrapper.getResultSearch()+1));
        
        result.setText(sb.toString());
    }//GEN-LAST:event_secuencialActionPerformed

    private void binariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binariaActionPerformed
        // TODO add your handling code here:
        String search = JOptionPane.showInputDialog(null, "Ingrese el numero a buscar");
        String items = list.getText();
        
        int buscar = Integer.parseInt(search);
        int[] array = Utils.stringToArray(items);
        Arrays.sort(array);
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setItemBuscar(buscar);
        tWrapper.setBusqueda((numeros, busqueda) -> {
            return Utils.busquedaBinaria(numeros, busqueda); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        StringBuilder sb = new StringBuilder();
        sb.append("===== Busqueda Binaria =====\n\n");
        sb.append("Tiempo de busqueda => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        sb.append(tWrapper.getResultSearch()==-1?"No se encontro el elemento '"+search+"' en la lista":"Elemento '"+search+"' encontrado en el salto "+(tWrapper.getResultSearch()+1));
        
        result.setText(sb.toString());
        
    }//GEN-LAST:event_binariaActionPerformed

    private void binariaVsSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binariaVsSecuencialActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        
        String search = JOptionPane.showInputDialog(null, "Ingrese el numero a buscar");
        String items = list.getText();
        
        int buscar = Integer.parseInt(search);
        int[] array = Utils.stringToArray(items);
        
        //Arrays.sort(array);
        //Busqueda secuencial
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setItemBuscar(buscar);
        tWrapper.setBusqueda((numeros, busqueda) -> {
            return Utils.busquedaSecuencial(numeros, busqueda); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        
        sb.append("===== Busqueda Secuencial =====\n");
        sb.append("Tiempo de busqueda => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        sb.append(tWrapper.getResultSearch()==-1?"No se encontro el elemento '"+search+"' en la lista":"Elemento '"+search+"' encontrado en la posicion "+(tWrapper.getResultSearch()+1));
        
        Arrays.sort(array);
        tWrapper.setBusqueda((numeros, busqueda) -> {
            return Utils.busquedaBinaria(numeros, busqueda); //To change body of generated lambdas, choose Tools | Templates.
        });
        
        sb.append("\n\n======= Busqueda Binaria ======\n");
        sb.append("Tiempo de busqueda => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        sb.append(tWrapper.getResultSearch()==-1?"No se encontro el elemento '"+search+"' en la lista":"Elemento '"+search+"' encontrado en el salto "+(tWrapper.getResultSearch()+1));
        
        
        result.setText(sb.toString());
    }//GEN-LAST:event_binariaVsSecuencialActionPerformed

    private void burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burbujaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        
        String items = list.getText();
        
        int[] array = Utils.stringToArray(items);
        
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setSortear((numeros) -> {
            Utils.ordenamientoBurbuja(array);//To change body of generated lambdas, choose Tools | Templates.
        });
       
        sb.append("===== Ordenamiento de Burbuja =====\n\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        int i=0;
        for (int item : array) {
            sb.append(item+", ");
            i++;
            if(i>=11){sb.append("\n"); i=0;}
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        result.setText(sb.toString());
        
    }//GEN-LAST:event_burbujaActionPerformed

    private void insersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insersionActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        
        String items = list.getText();
        
        int[] array = Utils.stringToArray(items);
        
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setSortear((numeros) -> {
            Utils.ordenamientoInsercion(numeros);//To change body of generated lambdas, choose Tools | Templates.
        });
       
        sb.append("===== Ordenamiento por insercion =====\n\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        int i=0;
        for (int item : array) {
            sb.append(item+", ");
            i++;
            if(i>=11){sb.append("\n"); i=0;}
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        result.setText(sb.toString());
    }//GEN-LAST:event_insersionActionPerformed

    private void quickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSortActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        
        String items = list.getText();
        
        int[] array = Utils.stringToArray(items);
        
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setSortear2((numeros, bajo, alto) -> {
            Utils.ordenamientoQuickSort(numeros, bajo, alto);//To change body of generated lambdas, choose Tools | Templates.
        });
       
        sb.append("===== Ordenamiento Quick Sort =====\n\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        int i=0;
        for (int item : array) {
            sb.append(item+", ");
            i++;
            if(i>=11){sb.append("\n"); i=0;}
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        result.setText(sb.toString());
    }//GEN-LAST:event_quickSortActionPerformed

    private void BurbujaVsInsertVsQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurbujaVsInsertVsQuickSortActionPerformed
        // TODO add your handling code here:
        
        StringBuilder sb = new StringBuilder();
        
        String items = list.getText();
        
        int[] array = Utils.stringToArray(items);
        
        TimeMemoryWrapper tWrapper = new TimeMemoryWrapper();
        tWrapper.setArray(array);
        tWrapper.setSortear((numeros) -> {
            Utils.ordenamientoBurbuja(array);//To change body of generated lambdas, choose Tools | Templates.
        });
             
        sb.append("===== Ordenamiento de Burbuja =====\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
        
        tWrapper.setSortear((numeros) -> {
            Utils.ordenamientoInsercion(array);//To change body of generated lambdas, choose Tools | Templates.
        });
        
        sb.append("\n===== Ordenamiento por insercion =====\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n");
       
        tWrapper.setSortear2((numeros, bajo, alto) -> {
            Utils.ordenamientoQuickSort(numeros, bajo, alto);//To change body of generated lambdas, choose Tools | Templates.
        });
       
        sb.append("\n===== Ordenamiento Quick Sort =====\n");
        sb.append("Tiempo de Ordenamiento => "+tWrapper.run()+" nanosegundos\n");
        sb.append("Memoria usada => "+Long.toString(tWrapper.getMemoryUsed())+" bytes\n\n");
        
        
        int i=0;
        for (int item : array) {
            sb.append(item+", ");
            i++;
            if(i>=11){sb.append("\n"); i=0;}
        }
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        result.setText(sb.toString());
    }//GEN-LAST:event_BurbujaVsInsertVsQuickSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurbujaVsInsertVsQuickSort;
    private javax.swing.JButton binaria;
    private javax.swing.JButton binariaVsSecuencial;
    private javax.swing.JButton burbuja;
    private javax.swing.JButton generarLista;
    private javax.swing.JButton insersion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea list;
    private javax.swing.JButton quickSort;
    private javax.swing.JTextArea result;
    private javax.swing.JButton secuencial;
    // End of variables declaration//GEN-END:variables
}
