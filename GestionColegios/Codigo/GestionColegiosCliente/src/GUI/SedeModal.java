/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code.Business.AuxiliaresBusiness;
import Code.Business.InstitucionEducativaBusiness;
import Code.Business.SedeBusiness;
import Code.Domain.Departamento;
import Code.Domain.InstitucionEducativa;
import Code.Domain.Municipio;
import Code.Domain.Sede;
import GUI.Util.ControllerComboSede;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author laynegranadosmogollon
 */
public class SedeModal extends javax.swing.JDialog {

    private boolean ALLOW_ROW_SELECTION = true;
    
    ControllerComboSede controller;
    SedeBusiness sedeBusiness;
    InstitucionEducativaBusiness institucionEducativaBusiness;
    AuxiliaresBusiness auxiliaresBusiness;
    Sede sedeActual;
    InstitucionEducativa actualColegio;
    ArrayList<Sede> sedes;
    
    final String[] columnNames = {"Id", "Nombre", "Consecutivo", "Antiguo DANE", "Id Municipio" ,"Municipio" };

    /**
     * Creates new form SedeModal
     */
    public SedeModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.controller= new ControllerComboSede(this);
        this.sedeBusiness= new SedeBusiness();
        this.auxiliaresBusiness = new AuxiliaresBusiness();
        
        this.institucionEducativaBusiness= new InstitucionEducativaBusiness();
        this.actualColegio = this.institucionEducativaBusiness.selectColegio();
        this.sedes =this.sedeBusiness.selectAllSedes(actualColegio.getId());
        
        this.sedeActual = new Sede();
        
        JTable jtable = this.createJTable(this.dataTable());
        this.scrollPaneListadoSede.setViewportView(jtable);
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
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreSede = new javax.swing.JTextField();
        txtCodigoDANEAnterior = new javax.swing.JTextField();
        btnGuardarSede = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtConsecutivoSede = new javax.swing.JTextField();
        btnLimparCamposSede = new javax.swing.JButton();
        cmbDepartamentoSede = new GUI.Util.JComboBox();
        cmbMunicipioSede = new GUI.Util.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        scrollPaneListadoSede = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        lblIdSede = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("SEDES");

        jLabel7.setText("Nombre");

        jLabel8.setText("<html>Código DANE<br />Anterior</html> ");

        jLabel10.setText("Departamento");

        txtCodigoDANEAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDANEAnteriorActionPerformed(evt);
            }
        });

        btnGuardarSede.setText("Guardar Cambios");
        btnGuardarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSedeActionPerformed(evt);
            }
        });

        jLabel2.setText("Consecutivo");

        btnLimparCamposSede.setText("Nueva Sede");
        btnLimparCamposSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposSedeActionPerformed(evt);
            }
        });

        cmbDepartamentoSede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDepartamentoSedeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbDepartamentoSedeMousePressed(evt);
            }
        });
        cmbDepartamentoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoSedeActionPerformed(evt);
            }
        });

        cmbMunicipioSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipioSedeActionPerformed(evt);
            }
        });

        jLabel11.setText("Municipio");

        jLabel1.setText("Identificador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneListadoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCodigoDANEAnterior, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbDepartamentoSede, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbMunicipioSede, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtConsecutivoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtNombreSede)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnLimparCamposSede)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGuardarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblIdSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel6)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdSede, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoDANEAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtConsecutivoSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDepartamentoSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmbMunicipioSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSede)
                    .addComponent(btnLimparCamposSede))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneListadoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDepartamentoSedeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDepartamentoSedeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentoSedeMousePressed

    private void cmbDepartamentoSedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDepartamentoSedeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentoSedeMouseClicked

    private void cmbDepartamentoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoSedeActionPerformed
        // TODO add your handling code here:
        
        Object dpto = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbDepartamentoSede);
        Departamento d = (Departamento) dpto;
        if(d.getId()!=-1){
            this.controller.llenarMunicipioSede(d.getId());
        }
      
    }//GEN-LAST:event_cmbDepartamentoSedeActionPerformed

    private void cmbMunicipioSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMunicipioSedeActionPerformed

    private void btnGuardarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSedeActionPerformed
        // TODO add your handling code here:
        Object mun = this.controller.getObjetoSeleccionado((GUI.Util.JComboBox)this.cmbMunicipioSede);
        this.sedeActual.setMunicipio(((Municipio)mun));
        this.sedeActual.setNombre(this.txtNombreSede.getText());
        this.sedeActual.setColegio(actualColegio.getId());
        this.sedeActual.setCodigoDANEantiguo(this.txtCodigoDANEAnterior.getText());
        this.sedeActual.setConsecutivo(Integer.parseInt(this.txtConsecutivoSede.getText()));
        
        
        if(this.sedeActual.getId()>0){
            this.sedeActual = this.sedeBusiness.updateSede(sedeActual);
            for(int i=0;i<this.sedes.size();i++){
                Sede sed = this.sedes.get(i);
                if(sed.getId()==this.sedeActual.getId()){
                    this.sedes.set(i, this.sedeActual);
                }
            }
        }else{
            this.sedeActual = this.sedeBusiness.guardarSede(this.sedeActual);
            this.sedes.add(this.sedeActual); 
        }
        
        this.lblIdSede.setText(String.valueOf(this.sedeActual.getId()));
        this.scrollPaneListadoSede.setViewportView(null);
        
        JTable jTable2 = this.createJTable(this.dataTable());
        
        this.scrollPaneListadoSede.setViewportView(jTable2);
    }//GEN-LAST:event_btnGuardarSedeActionPerformed

    private void btnLimparCamposSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposSedeActionPerformed
        // TODO add your handling code here:
        this.controller= new ControllerComboSede(this);
        this.sedeActual = new Sede();
        this.lblIdSede.setText("");
        this.txtNombreSede.setText("");
        this.txtConsecutivoSede.setText("");
        this.txtCodigoDANEAnterior.setText("");
        
    }//GEN-LAST:event_btnLimparCamposSedeActionPerformed

    private void txtCodigoDANEAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDANEAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDANEAnteriorActionPerformed

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
            java.util.logging.Logger.getLogger(SedeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SedeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SedeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SedeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SedeModal dialog = new SedeModal(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardarSede;
    private javax.swing.JButton btnLimparCamposSede;
    public javax.swing.JComboBox cmbDepartamentoSede;
    public javax.swing.JComboBox cmbMunicipioSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIdSede;
    public javax.swing.JScrollPane scrollPaneListadoSede;
    private javax.swing.JTextField txtCodigoDANEAnterior;
    private javax.swing.JTextField txtConsecutivoSede;
    private javax.swing.JTextField txtNombreSede;
    // End of variables declaration//GEN-END:variables

    private Object[][] dataTable(){
        int tamSedes = this.sedes.size();
        Object[][] data = new Object[tamSedes][6];
        
        for(int i=0;i<sedes.size();i++){
           Sede s = sedes.get(i);
            data[i][0]= s.getId();
            data[i][1]= s.getNombre();
            data[i][2]= s.getCodigoDANEantiguo();
            data[i][3]= s.getMunicipio().getId();
            data[i][4]= s.getMunicipio().getNombre();
            data[i][5]= s.getConsecutivo();
        }
        return data;
    }
    
    private JTable createJTable(Object[][] data){
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
                        getSedeSelected(jTable, lsm.getMinSelectionIndex());
                    }
                }
            });
        } else {
            jTable.setRowSelectionAllowed(false);
        }
        
        return jTable;
    }
    
    private void getSedeSelected(JTable table, int row) {
        int numRows = table.getRowCount();

        if(row<numRows){
            
            javax.swing.table.TableModel model = table.getModel();
            this.sedeActual= new Sede();
            
            this.sedeActual.setId((Integer)(model.getValueAt(row,0)));
            this.sedeActual.setNombre((String)(model.getValueAt(row,1)));
            this.sedeActual.setConsecutivo((Integer)(model.getValueAt(row,2)));
            this.sedeActual.setCodigoDANEantiguo(((String)model.getValueAt(row,3)));
            
            Municipio m = new Municipio();
            m.setId((Integer)(model.getValueAt(row,4)));
            m.setNombre((String)model.getValueAt(row,5));
            this.sedeActual.setMunicipio(m);
            
            this.txtNombreSede.setText(this.sedeActual.getNombre());
            this.txtConsecutivoSede.setText(""+this.sedeActual.getConsecutivo());
            this.txtCodigoDANEAnterior.setText(this.sedeActual.getCodigoDANEantiguo());
            this.lblIdSede.setText(""+this.sedeActual.getId());
            
            Municipio municipio = this.auxiliaresBusiness.getMunicipioPorId(this.sedeActual.getMunicipio().getId());
            Departamento departamento =  this.auxiliaresBusiness.getDepartamentoPorId(municipio.getDepartamentoId());
            
            this.controller= new ControllerComboSede(this);
            this.controller.setSelectedItemDepartamento(departamento);
            this.controller.llenarMunicipioSede(departamento.getId());
            this.controller.setSelectedItemMunicipio(municipio);
            
        }
        
    }
    
}
