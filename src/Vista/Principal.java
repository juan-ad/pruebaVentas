package Vista;

import Modelo.Vendedor;
import ModeloOperacion.ProductoDAO;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {
    Vendedor v = LoginForm.ve;
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        datosVendedor();
        validarUsuario();
    }
    void datosVendedor(){
        
        lbId.setText("Id : "+v.getId());
        lbNombre.setText("Nombre : "+v.getNombre());
        lbUser.setText("Usuario : "+ v.getUser());
    }

    void validarUsuario(){
        switch (v.getTipo()){
                                           
            case "CAJERO":
                menuItemVendedor.setEnabled(false);
                break;                
            case "INVITADO":
                menuVentas.setEnabled(false);
                menuMantenimiento.setEnabled(false); 
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        lbId = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuItemVendedor = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        lbId.setForeground(new java.awt.Color(255, 255, 255));
        lbId.setText("IdVendedor");

        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre");

        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("Usuario");

        VentanaPrincipal.setLayer(lbId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(lbNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        VentanaPrincipal.setLayer(lbUser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbId, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(541, Short.MAX_VALUE))
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        getContentPane().add(VentanaPrincipal);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jMenu1.setText("Menú");

        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Cambiar Usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem9.setText("Cambiar Clave");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        menuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/carritocompras.jpg"))); // NOI18N
        menuVentas.setText("Ventas");

        jMenuItem6.setText("GenerarVenta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem6);

        jMenuBar1.add(menuVentas);

        menuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.jpg"))); // NOI18N
        menuMantenimiento.setText("Mantenimiento");

        jMenuItem3.setText("Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuMantenimiento.add(jMenuItem3);

        jMenuItem4.setText("Producto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuMantenimiento.add(jMenuItem4);

        menuItemVendedor.setText("Vendedor");
        menuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendedorActionPerformed(evt);
            }
        });
        menuMantenimiento.add(menuItemVendedor);

        jMenuBar1.add(menuMantenimiento);

        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte.jpg"))); // NOI18N
        MenuReportes.setText("Reportes");

        jMenuItem7.setText("Reporte de Ventas");
        MenuReportes.add(jMenuItem7);

        jMenuItem8.setText("Reporte Prductos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        MenuReportes.add(jMenuItem8);

        jMenuBar1.add(MenuReportes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ClientesForm cf = new ClientesForm();
        centrarVentana(cf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        VentasForm vf = new VentasForm();
        centrarVentana(vf);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ProductosForm pf = new ProductosForm();
        centrarVentana(pf);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendedorActionPerformed
        VendedorForm vf = new VendedorForm();
        centrarVentana(vf);
    }//GEN-LAST:event_menuItemVendedorActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ProductoDAO pd = new ProductoDAO();
        pd.generarReporte();
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        LoginForm lg = new LoginForm();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
        
     
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DialogCambioClave cc = new DialogCambioClave(this, true);
        cc.setUser(v.getUser());
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dFrame = cc.getSize();
        cc.setLocation((dimension.width - dFrame.width)/2, (dimension.height - dFrame.height)/2);
        cc.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void centrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dFrame = frame.getSize();
        frame.setLocation((dimension.width - dFrame.width)/2, (dimension.height - dFrame.height)/2);
        frame.setVisible(true);
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuReportes;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbUser;
    private javax.swing.JMenuItem menuItemVendedor;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
}
