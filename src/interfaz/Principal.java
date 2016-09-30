/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumerodeColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumerodeFilas1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumerodeColumnas1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNumerodeFilas4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumerodeColumnas4 = new javax.swing.JTextField();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        cmbOperaciones = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("No. de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        txtNumerodeFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerodeFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerodeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel3.setText("No. de Columnas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));

        txtNumerodeColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerodeColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumerodeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No. de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel3.add(txtNumerodeFilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel5.setText("No. de Columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel3.add(txtNumerodeColumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("No. de Filas:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel7.add(txtNumerodeFilas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel11.setText("No. de Columnas: ");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel7.add(txtNumerodeColumnas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel6.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel6.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel6.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel6.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 480, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MATRIZ CON OPERACIONES ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 330, 220));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 330, 220));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Diagonal secundaria", "2. Triangular superior", "3. Triangular Inferior", "4. Matriz Traspuesta", "5. Letra A", "6. Letra Z", "7. Letra T", "8. Letra V", "9. Letra E", "10.Letra F", "11. Letra P ", "12. Letra I", "13. Letra N", "14. Letra Y", "15. Letra X", " " }));
        cmbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbOperaciones, 0, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 180, 80));

        setSize(new java.awt.Dimension(912, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;

        if (txtNumerodeFilas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por Favor Ingrese el valor De Numero de Filas", 3);
            txtNumerodeFilas.requestFocusInWindow();

            JButton botonesH[] = {cmdCrear};
            Helper.habilitarBotones(botonesH);
            } else if (txtNumerodeColumnas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Por Favor Ingrese el valor DeNumero de Columnas", 3);
            txtNumerodeColumnas.requestFocusInWindow();

            JButton botonesH[] = {cmdCrear};
            Helper.habilitarBotones(botonesH);
            } else {

            nf = Integer.parseInt(txtNumerodeFilas.getText());
            nc = Integer.parseInt(txtNumerodeColumnas.getText());
            if (nf==0) {
                Helper.mensaje(this, "El Numero A Ingresar No Puede Ser Cero", 3);
                txtNumerodeFilas.requestFocusInWindow();
                txtNumerodeFilas.selectAll();
            }else if(nc==0){
                Helper.mensaje(this, "El Numero A Ingresar No Puede Ser Cero", nc);
                txtNumerodeFilas.selectAll();
                 } else if (nf % 2 == 0) {
                Helper.mensaje(this, "Ingrese un numero impar para Diseñar Mejor las Letras", 2);
                txtNumerodeColumnas.setText("");
                txtNumerodeFilas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
            } else if (nc % 2 == 0) {
                Helper.mensaje(this, "Ingrese Un Numero Impar Para Diseñar Mejor las Letras", 2);
                txtNumerodeFilas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
                txtNumerodeColumnas.setText("");
                } else if (nc <= 5 || nf <= 5) {
                Helper.mensaje(this, "Ingrese Numeros Mayores para Diseñar Mejor las Letras", 3);
                txtNumerodeFilas.setText("");
                txtNumerodeColumnas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
            } else if (nc > 13 || nf > 13) {
                Helper.mensaje(this, "Ingrese Numero Menores para Diseñar Mejor las Letras", 3);
                txtNumerodeFilas.setText("");
                txtNumerodeColumnas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
                } else if (nc != nf) {
                Helper.mensaje(this, "Ingrese el Mismo numero de Filas y Columnas, Para Ofrecerle Una Matriz Mejor Diseñada", 3);
                txtNumerodeFilas.setText("");
                txtNumerodeColumnas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
        }else {

        nf = Integer.parseInt(txtNumerodeFilas.getText());
        nc = Integer.parseInt(txtNumerodeColumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);
        
        
         JButton botonesH[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperacion};

                Helper.habilitarBotones(botonesH);
                Helper.deshabilitarBotones(botonesD);
          }
       }       
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);
        
        switch (op) {
            case 0:
                Helper.diagonalSecundaria(tblTablaInicial, tblTablaResultado);
                break;
            case 1:
                Helper.triangularSuperior(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.triangularInferior(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.matrizTranspuesta(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.LetraA(tblTablaInicial, tblTablaResultado);
                 break;
            case 5:
                Helper.LetraZ(tblTablaInicial, tblTablaResultado);
                 break;
            case 6:
                Helper.LetraT(tblTablaInicial, tblTablaResultado);
                 break;
            case 7:
                Helper.LetraV(tblTablaInicial, tblTablaResultado);
                 break;
            case 8:
                Helper.LetraE(tblTablaInicial, tblTablaResultado);
                 break;
            case 9:
                Helper.LetraF(tblTablaInicial, tblTablaResultado);
                 break;
            case 10:
                Helper.LetraP(tblTablaInicial, tblTablaResultado);
                 break;
            case 11:
                Helper.LetraI(tblTablaInicial, tblTablaResultado);
                 break;
            case 12:
                Helper.LetraN(tblTablaInicial, tblTablaResultado);
                 break;
            case 13:
                Helper.LetraY(tblTablaInicial, tblTablaResultado); 
                break;
            case 14:
                Helper.LetraX(tblTablaInicial, tblTablaResultado);
                break;
        }
                           
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtNumerodeFilas.setText("");
        txtNumerodeColumnas.setText("");
        txtNumerodeFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        
        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperacionesActionPerformed

    private void txtNumerodeFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerodeFilasKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerodeFilasKeyTyped

    private void txtNumerodeColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerodeColumnasKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerodeColumnasKeyTyped

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc, n;

        int sw, res;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[]={cmdOperacion, cmdLimpiar};
        JButton botonesD[]={cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumerodeColumnas;
    private javax.swing.JTextField txtNumerodeColumnas1;
    private javax.swing.JTextField txtNumerodeColumnas4;
    private javax.swing.JTextField txtNumerodeFilas;
    private javax.swing.JTextField txtNumerodeFilas1;
    private javax.swing.JTextField txtNumerodeFilas4;
    // End of variables declaration//GEN-END:variables
}
