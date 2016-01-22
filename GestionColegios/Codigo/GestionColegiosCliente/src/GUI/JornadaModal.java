/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code.Business.AnioBusiness;
import Code.Business.AuxiliaresBusiness;
import Code.Business.InstitucionEducativaBusiness;
import Code.Business.JornadaBusiness;
import Code.Business.SedeBusiness;
import Code.Business.TipoJornadaBusiness;
import Code.Domain.Anio;
import Code.Domain.InstitucionEducativa;
import Code.Domain.Jornada;
import Code.Domain.Sede;
import Code.Domain.TipoJornada;
import GUI.Util.ControllerComboJornada;
import GUI.Util.Objeto;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Andres Orduz Grimaldo
 */
public class JornadaModal extends javax.swing.JDialog {

    /**
     * Creates new form JornadaModal
     */
    
    private boolean ALLOW_ROW_SELECTION = true;
    TipoJornadaBusiness tipoJoranadaBusiness;
    ControllerComboJornada controller;
    JornadaBusiness jornadaBusiness;
    InstitucionEducativaBusiness institucionEducativaBusiness;
    AuxiliaresBusiness auxiliaresBusiness;
    Jornada jornadaActual;
    InstitucionEducativa actualColegio;
    ArrayList<Jornada> jornadas;
    SedeBusiness sedeBusiness;
    AnioBusiness anioBusiness;
    
    final String[] columnNames = {"Id", "Nombre", "Tipo Jornada","ID Tipo Jornada", "Año", "ID Año"};
    
    
    //Creates new form JornadaModal
    public JornadaModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.controller = new ControllerComboJornada(this);
        this.anioBusiness = new AnioBusiness();
        this.sedeBusiness = new SedeBusiness();
        this.tipoJoranadaBusiness = new TipoJornadaBusiness();
        this.auxiliaresBusiness = new AuxiliaresBusiness();
        this.institucionEducativaBusiness = new InstitucionEducativaBusiness();
        this.actualColegio = this.institucionEducativaBusiness.selectColegio();
        
        this.controller = new ControllerComboJornada(this);
        this.auxiliaresBusiness = new AuxiliaresBusiness();
        this.jornadaBusiness = new JornadaBusiness();
        this.jornadas = this.jornadaBusiness.getTodasLasJornadas();
        
        this.jornadaActual = new Jornada();
        
        JTable jtable = this.createJTable(this.dataTable());
        this.scrollListadoJornada.setViewportView(jtable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbSedeJornada = new GUI.Util.JComboBox();
        cmbAnioJornada = new GUI.Util.JComboBox();
        txtNombreJornada = new javax.swing.JTextField();
        btnGuardarJornada = new javax.swing.JButton();
        btnLimparCamposJornada = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scrollListadoJornada = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        lblIdJornada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionJornada = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbTipoDeJornada = new GUI.Util.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Agregar o Modificar una Jornada");

        jLabel2.setText("Sede");

        jLabel3.setText("Año");

        jLabel4.setText("Jornada");

        cmbSedeJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSedeJornadaActionPerformed(evt);
            }
        });

        cmbAnioJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnioJornadaActionPerformed(evt);
            }
        });

        btnGuardarJornada.setText("Guardar");
        btnGuardarJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarJornadaActionPerformed(evt);
            }
        });

        btnLimparCamposJornada.setText("Nueva Jornada");
        btnLimparCamposJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposJornadaActionPerformed(evt);
            }
        });

        jLabel5.setText("Descripción");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel6.setText("(Opcional)");

        jLabel7.setText("Identificador");

        txtDescripcionJornada.setColumns(20);
        txtDescripcionJornada.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionJornada);

        jLabel8.setText("jLabel8");

        jLabel9.setText("Tipo de Jornada");

        cmbTipoDeJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDeJornadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparCamposJornada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarJornada))
                    .addComponent(scrollListadoJornada)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombreJornada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAnioJornada, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
                                    .addComponent(cmbSedeJornada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoDeJornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdJornada)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbSedeJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cmbTipoDeJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAnioJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimparCamposJornada)
                            .addComponent(btnGuardarJornada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollListadoJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarJornadaActionPerformed
        // TODO add your handling code here:
        Object anio = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbAnioJornada);
        Object tipoJornada = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbTipoDeJornada);
        this.jornadaActual.setAnioId(((Anio)anio).getId());
        this.jornadaActual.setNombre(this.txtNombreJornada.getText());
        this.jornadaActual.setTipoJornada(((TipoJornada)tipoJornada));
        
        
        if(this.jornadaActual.getId()>0){
            this.jornadaActual = this.jornadaBusiness.updateJornada(jornadaActual);
            for(int i=0;i<this.jornadas.size();i++){
                Jornada jord = this.jornadas.get(i);
                if(jord.getId()==this.jornadaActual.getId()){
                    this.jornadas.set(i, this.jornadaActual);
                }
            }
        }else{
            this.jornadaActual = this.jornadaBusiness.guardarJornada(this.jornadaActual);
            this.jornadas.add(this.jornadaActual); 
        }
        
        this.lblIdJornada.setText(String.valueOf(this.jornadaActual.getId()));
        this.scrollListadoJornada.setViewportView(null);
        
        JTable jTable2 = this.createJTable(this.dataTable());
        
        this.scrollListadoJornada.setViewportView(jTable2);
         
    }//GEN-LAST:event_btnGuardarJornadaActionPerformed

    private void cmbSedeJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSedeJornadaActionPerformed
        // TODO add your handling code here:
        Object sede = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbSedeJornada);
        Sede s = (Sede) sede;
        if(s.getId()!=-1){
            this.controller.llenarAnioJornada(s.getId());
        }
    }//GEN-LAST:event_cmbSedeJornadaActionPerformed

    private void btnLimparCamposJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposJornadaActionPerformed
        // TODO add your handling code here:
        this.controller = new ControllerComboJornada(this);
        this.jornadaActual = new Jornada();
        this.lblIdJornada.setText("");
        this.txtNombreJornada.setText("");
        this.txtDescripcionJornada.setText("");
    }//GEN-LAST:event_btnLimparCamposJornadaActionPerformed

    private void cmbAnioJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnioJornadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAnioJornadaActionPerformed

    private void cmbTipoDeJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDeJornadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDeJornadaActionPerformed

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
            java.util.logging.Logger.getLogger(JornadaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JornadaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JornadaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JornadaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JornadaModal dialog = new JornadaModal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarJornada;
    private javax.swing.JButton btnLimparCamposJornada;
    public javax.swing.JComboBox cmbAnioJornada;
    public javax.swing.JComboBox cmbSedeJornada;
    public javax.swing.JComboBox<String> cmbTipoDeJornada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdJornada;
    private javax.swing.JScrollPane scrollListadoJornada;
    private javax.swing.JTextArea txtDescripcionJornada;
    private javax.swing.JTextField txtNombreJornada;
    // End of variables declaration//GEN-END:variables

    private Object[][] dataTable(){
        int tamJornadas = this.jornadas.size();
        Object[][] data = new Object [tamJornadas][6];
        
        for ( int i =0;i<jornadas.size();i++){
            Jornada j = jornadas.get(i);
            data[i][0] = j.getId();
            data[i][1] = j.getNombre();
            data[i][2] = j.getTipoJornada().getNombre();
            data[i][3] = j.getTipoJornada().getId();
            Anio a = this.anioBusiness.getAnioPorId(j.getAnioId());
            data[i][4] = a.getAnio();
            data[i][5] = j.getAnioId();
        }
        return data;
    }
    
    private JTable createJTable (Object[][] data){
        JTable jTable = new JTable(data, columnNames);
        jTable.setPreferredScrollableViewportSize(new Dimension(500, 70));
        jTable.setFillsViewportHeight(true);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
        if (ALLOW_ROW_SELECTION) {
            ListSelectionModel rowSM = jTable.getSelectionModel();
            rowSM.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    
                    if (e.getValueIsAdjusting()) 
                        return;

                    ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                    if (!lsm.isSelectionEmpty()) {
                        getJornadaSelected(jTable, lsm.getMinSelectionIndex());
                    }
                }
            });
        } else {
            jTable.setRowSelectionAllowed(false);
        }
        
        return jTable;
    }


    private void getJornadaSelected(JTable table, int row) {
        int numRows = table.getRowCount();

        if(row<numRows){
            
            javax.swing.table.TableModel model = table.getModel();
            this.jornadaActual= new Jornada();
            
            this.jornadaActual.setId((Integer)(model.getValueAt(row,0)));
            this.jornadaActual.setNombre((String)(model.getValueAt(row,1)));
            int tipojorn = ((Integer)model.getValueAt(row,3));
            this.jornadaActual.setTipoJornada(this.tipoJoranadaBusiness.tipoJornadaPorId(tipojorn));
            this.jornadaActual.setAnioId((Integer)(model.getValueAt(row,5)));
            
            this.txtNombreJornada.setText(this.jornadaActual.getNombre());
            this.lblIdJornada.setText(""+this.jornadaActual.getId());
            
            Anio anio =this.anioBusiness.getAnioPorId(this.jornadaActual.getAnioId());
            Sede sede =  this.sedeBusiness.sedePorId(anio.getSede().getId());
            TipoJornada tj = this.tipoJoranadaBusiness.tipoJornadaPorId(this.jornadaActual.getTipoJornada().getId());
            this.controller= new ControllerComboJornada(this);
            this.controller.setSelectedItemSede(sede);
            this.controller.llenarAnioJornada(sede.getId());
            this.controller.setSelectedItemAnio(anio);
            this.controller.setSelectedItemTipoJornada(tj);
            
        }
        
    }
}
