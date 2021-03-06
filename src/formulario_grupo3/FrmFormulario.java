/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_grupo3;

import com.sun.istack.internal.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kriz_
 */
public class FrmFormulario extends javax.swing.JFrame implements ChangeListener, ActionListener {

    /**
     * Creates new form FrmFormulario
     */
    public FrmFormulario() {
        initComponents();
        Datos();
        setLocationRelativeTo(null);
        setTitle("Uso de componentes");
    }

    String sexo, desSof = "", cieDat = "", sisInf = "", otr = "";
    int pos, pos2;

    public void Datos() {
        jTxAreaDatos.setText("\t\tDatos\nNombre: " + jTxfNomApe.getText() + "\nEdad: " + jSprEdad.getValue()
                + "\nPeso: " + jSprPeso.getValue() + "\nSemestre Aprobado: " + jLstSem.getModel().getElementAt(pos)
                + "\nSexo: " + sexo + "\nSector de Residencia: " + jCmBxSector.getItemAt(pos2) + "\nLinea de Investigacion: " + desSof + cieDat + sisInf + otr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLblNomApe = new javax.swing.JLabel();
        jTxfNomApe = new javax.swing.JTextField();
        jLblEdad = new javax.swing.JLabel();
        jLblPeso = new javax.swing.JLabel();
        jSprEdad = new javax.swing.JSpinner();
        jSprPeso = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLblSem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstSem = new javax.swing.JList<>();
        jLblSexo = new javax.swing.JLabel();
        jRdBtnFem = new javax.swing.JRadioButton();
        jRdBtnMasc = new javax.swing.JRadioButton();
        jLblSector = new javax.swing.JLabel();
        jCmBxSector = new javax.swing.JComboBox<>();
        jLblInvst = new javax.swing.JLabel();
        jChkBxDesSoft = new javax.swing.JCheckBox();
        jChkBxCienDat = new javax.swing.JCheckBox();
        jChkBxSisInfor = new javax.swing.JCheckBox();
        jChkBxOtros = new javax.swing.JCheckBox();
        jTxfOtros = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxAreaDatos = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jTgBtnGrabar = new javax.swing.JToggleButton();
        jBtnIngresar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblEstudiante = new javax.swing.JTable();
        jBtnEliminar = new javax.swing.JButton();
        jTxfBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblNomApe.setText("Nombres y Apellidos");

        jTxfNomApe.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                Datos();

            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        jLblEdad.setText("Edad");

        jLblPeso.setText("Peso Kg");

        jSprEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));
        jSprEdad.addChangeListener(this);

        jSprPeso.setModel(new javax.swing.SpinnerNumberModel(50.5d, 50.5d, 200.0d, 0.25d));
        jSprPeso.addChangeListener(this);

        jLabel1.setText("Valor Minimo 18 Máximo 60 Incremento 1");

        jLabel2.setText("Peso Mínimo 50.50 Máximo 200.00 Incremento 0.25");

        jLblSem.setText("Semestre aprobado");

        jLstSem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Semestre 1", "Semestre 2 ", "Semestre 3", "Semestre 4", "Semestre 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLstSem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jLstSem);
        jLstSem.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()) {
                    pos = jLstSem.getSelectedIndex();
                    Datos();
                }
            }

        });

        jLblSexo.setText("Sexo");

        jRdBtnFem.setText("Femenino");
        buttonGroup1.add(jRdBtnFem);
        jRdBtnFem.addActionListener(this);

        jRdBtnMasc.setText("Masculino");
        buttonGroup1.add(jRdBtnMasc);
        jRdBtnMasc.addActionListener(this);

        jLblSector.setText("Sector de residencia");

        jCmBxSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte", "Sur", "Este", "Oeste", "Centro" }));
        jCmBxSector.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                pos2 = jCmBxSector.getSelectedIndex();
                Datos();
            }
        });

        jLblInvst.setText("Lineas de Investigación que le gustaría realizar su tesis");

        jChkBxDesSoft.setText("Desarrollo de Software");
        jChkBxDesSoft.addActionListener(this);

        jChkBxCienDat.setText("Ciencia de Datos");
        jChkBxCienDat.addActionListener(this);

        jChkBxSisInfor.setText("Sistemas de Información");
        jChkBxSisInfor.addActionListener(this);
        jChkBxSisInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBxSisInforActionPerformed(evt);
            }
        });

        jChkBxOtros.setText("Otros");
        jChkBxOtros.addActionListener(this);

        jTxfOtros.setEnabled(false);

        jLabel3.setText("El textArea se actualiza cada vez que el usuario realiza un cambio en cada uno de los componentes:");

        jTxAreaDatos.setColumns(20);
        jTxAreaDatos.setRows(5);
        jScrollPane2.setViewportView(jTxAreaDatos);

        jLabel4.setText("Al dar click en grabar(Toggle Button) se inicia el progressbar y al finalizar se limpia el TextArea");

        jTgBtnGrabar.setText("Grabar");
        jTgBtnGrabar.addActionListener(this);

        jBtnIngresar.setText("Ingresar");
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });

        jTblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres y Apellidos", "Edad", "Sexo", "Semestre", "Sector", "Lineas", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTblEstudiante);

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jTxfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxfBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblNomApe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxfNomApe, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLblSexo)
                                            .addGap(42, 42, 42)
                                            .addComponent(jRdBtnFem)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRdBtnMasc))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLblSector)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCmBxSector, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblPeso)
                                            .addComponent(jLblEdad))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSprEdad)
                                            .addComponent(jSprPeso))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblSem)))
                            .addComponent(jLblInvst)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChkBxDesSoft)
                                .addGap(18, 18, 18)
                                .addComponent(jChkBxCienDat)
                                .addGap(18, 18, 18)
                                .addComponent(jChkBxSisInfor)
                                .addGap(18, 18, 18)
                                .addComponent(jChkBxOtros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTgBtnGrabar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBtnIngresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnEliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jTxfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNomApe)
                    .addComponent(jTxfNomApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEdad)
                    .addComponent(jSprEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLblSem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblPeso)
                            .addComponent(jSprPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblSexo)
                            .addComponent(jRdBtnFem)
                            .addComponent(jRdBtnMasc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblSector)
                            .addComponent(jCmBxSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLblInvst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkBxDesSoft)
                    .addComponent(jChkBxCienDat)
                    .addComponent(jChkBxSisInfor)
                    .addComponent(jChkBxOtros)
                    .addComponent(jTxfOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTgBtnGrabar)
                    .addComponent(jBtnIngresar)
                    .addComponent(jBtnEliminar))
                .addContainerGap())
        );

        jTgBtnGrabar.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                int estado = e.getStateChange();

                if(estado == ItemEvent.SELECTED){
                    jTgBtnGrabar.setEnabled(false);
                    int max = jProgressBar1.getMaximum();
                    Thread runner = new Thread() {
                        public void run() {
                            int cont = jProgressBar1.getMinimum();
                            while (cont <= max) {
                                jProgressBar1.setValue(cont);
                                cont++;
                                try {
                                    Thread.sleep(100);
                                    if(cont>100){
                                        jProgressBar1.setValue(0);
                                        jTxAreaDatos.setText("");
                                        jTgBtnGrabar.setEnabled(true);
                                        jTgBtnGrabar.setSelected(false);
                                    }
                                }catch (InterruptedException ex) {}
                            }}
                        };
                        runner.start();
                    }
                }
            });

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jChkBxSisInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkBxSisInforActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChkBxSisInforActionPerformed

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed
        try {
            this.jSprEdad.commitEdit();
            this.jSprPeso.commitEdit();
        } catch (ParseException ex) {
            //Logger.getLogger(FrmFormulario.class.getName()).log(Level.SEVERE,null, ex);
        }
        DefaultTableModel modelo = (DefaultTableModel) jTblEstudiante.getModel();
        Object[] datos = new Object[7];
        datos[0] = this.jTxfNomApe.getText();
        datos[1] = this.jSprEdad.getValue();
        if (jRdBtnFem.isSelected()) {
            datos[2] = jRdBtnFem.getText();
        }
        if (jRdBtnMasc.isSelected()) {
            datos[2] = jRdBtnMasc.getText();
        }
        if (jLstSem.getSelectedIndex() >= 0) {
            datos[3] = jLstSem.getSelectedValue();
        }
        if (jCmBxSector.getSelectedIndex() >= 0) {
            datos[4] = jCmBxSector.getSelectedItem();
        }
        if (jChkBxCienDat.isSelected()) {
            datos[5] = jChkBxCienDat.getText();
        }
        if (jChkBxDesSoft.isSelected()) {
            datos[5] = datos[5] + "" + jChkBxDesSoft.getText();
        }
        if (jChkBxSisInfor.isSelected()) {
            datos[5] = datos[5] + "" + jChkBxSisInfor.getText();
        }
        if (jChkBxOtros.isSelected()) {
            datos[5] = datos[5] + "" + jChkBxOtros.getText();
            datos[5] = datos[5] + "" + jTxfOtros.getText();
        }
        datos[6] = jSprPeso.getValue();
        modelo.addRow(datos);
        jTblEstudiante.setModel(modelo);
    }//GEN-LAST:event_jBtnIngresarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTblEstudiante.getModel();
        int pos = jTblEstudiante.getSelectedRow();
        if (pos >= 0) {
            int btn = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar la fila " + pos + "?", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
            if (btn == JOptionPane.OK_OPTION) {
                modelo.removeRow(pos);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay filas para eliminar", "Sistema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtnEliminarActionPerformed
    private TableRowSorter trsFiltro;
    private void jTxfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxfBuscarKeyPressed
        // TODO add your handling code here:
        trsFiltro = new TableRowSorter(jTblEstudiante.getModel());
        jTblEstudiante.setRowSorter(trsFiltro);
        trsFiltro.setRowFilter(RowFilter.regexFilter(this.jTxfBuscar.getText(),0));
    }//GEN-LAST:event_jTxfBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JCheckBox jChkBxCienDat;
    private javax.swing.JCheckBox jChkBxDesSoft;
    private javax.swing.JCheckBox jChkBxOtros;
    private javax.swing.JCheckBox jChkBxSisInfor;
    private javax.swing.JComboBox<String> jCmBxSector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblInvst;
    private javax.swing.JLabel jLblNomApe;
    private javax.swing.JLabel jLblPeso;
    private javax.swing.JLabel jLblSector;
    private javax.swing.JLabel jLblSem;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JList<String> jLstSem;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRdBtnFem;
    private javax.swing.JRadioButton jRdBtnMasc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSprEdad;
    private javax.swing.JSpinner jSprPeso;
    private javax.swing.JTable jTblEstudiante;
    private javax.swing.JToggleButton jTgBtnGrabar;
    private javax.swing.JTextArea jTxAreaDatos;
    private javax.swing.JTextField jTxfBuscar;
    private javax.swing.JTextField jTxfNomApe;
    private javax.swing.JTextField jTxfOtros;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        Object obj = e.getSource();
        if (obj == jSprEdad) {
            Datos();
        } else if (obj == jSprPeso) {
            Datos();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (jRdBtnFem.isSelected() == true) {
            sexo = jRdBtnFem.getText();
            Datos();
        } else if (jRdBtnMasc.isSelected() == true) {
            sexo = jRdBtnMasc.getText();
            Datos();
        }
        if (jChkBxCienDat.isSelected() == true) {
            cieDat = " " + jChkBxCienDat.getText();
            Datos();
        } else {
            cieDat = "";
            Datos();
        }
        if (jChkBxSisInfor.isSelected() == true) {
            sisInf = " " + jChkBxSisInfor.getText();
            jTxfOtros.setEnabled(false);
            Datos();
        } else {
            sisInf = "";
            Datos();
        }
        if (jChkBxDesSoft.isSelected() == true) {
            desSof = " " + jChkBxDesSoft.getText();
            Datos();
        } else {
            desSof = "";
            Datos();
        }
        if (jChkBxOtros.isSelected() == true) {
            jTxfOtros.setEnabled(true);
            jTxfOtros.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    otr = " " + jTxfOtros.getText();
                    Datos();
                }

                @Override
                public void keyPressed(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });
        } else {
            jTxfOtros.setEnabled(false);
            jTxfOtros.setText("");
            otr = "";
            Datos();
        }
    }

}
