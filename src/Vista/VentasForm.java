

package Vista;

import Modelo.Cliente;
import Modelo.DetalleVentas;
import Modelo.Producto;
import Modelo.Vendedor;
import Modelo.Ventas;
import ModeloOperacion.ClienteDAO;
import ModeloOperacion.ProductoDAO;
import ModeloOperacion.VentasDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentasForm extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VentasDAO vd = new VentasDAO();
    Producto p = new Producto();
    ProductoDAO pd= new ProductoDAO();
    Vendedor v = LoginForm.ve;
    int idCliente;
    int item = 1;
    double totalPagar;
    public VentasForm() {
        initComponents();
        generarSerie();
        generarFecha();
        txtVendedor.setText(v.getNombre());
        
    }
    
    void generarFecha(){
        Calendar fecha = new GregorianCalendar();
        txtFecha.setText(fecha.get(Calendar.YEAR)+"-"+(fecha.get(Calendar.MONTH)+1)+"-"+fecha.get(Calendar.DAY_OF_MONTH));
    }

    void generarSerie(){
        String serie = vd.nroSerie();
        if (serie == null){
            txtSerie.setText("0000001");
        }else{
            int incremento = Integer.parseInt(serie);
            incremento = incremento++;
            txtSerie.setText("000000"+incremento);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        VentanaVenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        txtFecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Sistema de Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"TESLA\"");

        jLabel2.setText("Venta de Productos Tecnológicos");

        jLabel3.setText("Tel: 3245678789");

        jLabel4.setText("NRO SERIE :");

        txtSerie.setEditable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tesla.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addComponent(jLabel5)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "CODPRO", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        VentanaVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("DNI CLIENTE: ");

        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("CLIENTE :");

        txtCliente.setEditable(false);

        jLabel8.setText(" COD PROD :");

        btnBuscarProducto.setText("BUSCAR");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel9.setText(" PRODU  :");

        txtProducto.setEditable(false);

        txtPrecio.setEditable(false);

        jLabel10.setText(" PRECIO  :");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel11.setText("STOCK :");

        txtStock.setEditable(false);

        jLabel12.setText("CANTIDAD:");

        txtFecha.setEditable(false);

        jLabel13.setText("VENDE :");

        txtVendedor.setEditable(false);

        javax.swing.GroupLayout VentanaVentaLayout = new javax.swing.GroupLayout(VentanaVenta);
        VentanaVenta.setLayout(VentanaVentaLayout);
        VentanaVentaLayout.setHorizontalGroup(
            VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaVentaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VentanaVentaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaVentaLayout.createSequentialGroup()
                        .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VentanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addGroup(VentanaVentaLayout.createSequentialGroup()
                                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(VentanaVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VentanaVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(txtPrecio))
                                .addGap(18, 18, 18)
                                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(10, 10, 10)
                        .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentanaVentaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        VentanaVentaLayout.setVerticalGroup(
            VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(jLabel7)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(jLabel9)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel11)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(VentanaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("TOTAL A PAGAR :");

        txtTotalPagar.setEditable(false);

        btnGenerarVenta.setText("GENERAR VENTA");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarVenta)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btnGenerarVenta)
                    .addComponent(btnCancelar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VentanaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if(txtTotalPagar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar datos");
        }else{
            guardarVentas();
            guardarDetalle();
            actualizarStock();
            JOptionPane.showMessageDialog(null, "Venta generada con éxito");
            nuevo();
            generarSerie();
        }
        
    }//GEN-LAST:event_btnGenerarVentaActionPerformed
    void nuevo(){
        limpiarTabla();
        txtDni.setText("");
        txtCodProducto.setText("");
        txtProducto.setText("");
        txtCliente.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtTotalPagar.setText("");
        spinnerCantidad.setValue(1);
        txtDni.requestFocus();
    }
    void limpiarTabla(){
        
        for (int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    void buscarCliente(){
        String dni = txtDni.getText();
        int rpta;
        if (dni.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo a buscar");
        }else{
            ClienteDAO cd = new ClienteDAO();
            Cliente c = cd.buscarCliente(dni);
            if (c.getDni() != null){
                txtCliente.setText(c.getNombres());
                txtCodProducto.requestFocus();
                idCliente = c.getId();
            }else{
                
                rpta = JOptionPane.showConfirmDialog(null, "Cliente no registrado, Desea Registrar?");
                
                if (rpta == 0){
                    ClientesForm cf = new ClientesForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
             
        }
    }
    
    void buscarProducto(){
        String id = txtCodProducto.getText();
        int rpta;
        if (id.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo a buscar");
        }else{
            pd = new ProductoDAO();
            p = pd.buscarProducto(Integer.parseInt(id));
            if (p.getId()!= 0){
                txtProducto.setText(p.getNombre());
                txtPrecio.setText(String.valueOf(p.getPrecio()));
                txtStock.setText(String.valueOf(p.getStock()));
                txtCodProducto.requestFocus();
            }else{
                
                rpta = JOptionPane.showConfirmDialog(null, "Producto no registrado, Desea Registrar?");
                
                if (rpta == 0){
                    ProductosForm pf = new ProductosForm();
                    Principal.VentanaPrincipal.add(pf);
                    pf.setVisible(true);
                }
            }
             
        }
    }
    
    void agregarProducto(){
        modelo = (DefaultTableModel)TablaVentas.getModel();
        int idp = p.getId();
        String nomp = txtProducto.getText();
        double precio = p.getPrecio();
        int  cantidad = Integer.parseInt(spinnerCantidad.getValue().toString());
        int stock = p.getStock();
        double total = cantidad*precio;
        
        ArrayList lista = new ArrayList(); 
        if (stock>0){
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(total);
            
            Object [] obj = new Object[6];
            obj[0] = lista.get(0);
            obj[1] = lista.get(1);
            obj[2] = lista.get(2);
            obj[3] = lista.get(3);
            obj[4] = lista.get(4);
            obj[5] = lista.get(5);
            modelo.addRow(obj);
            TablaVentas.setModel(modelo);
            calcularTotal();
            item = item + 1;
            System.out.println(item);
        }else{
            JOptionPane.showMessageDialog(null, "Stock Producto no disponible");
        }
        
    }
    
    void calcularTotal(){
        totalPagar = 0;
        
        for (int i = 0; i<modelo.getRowCount();i++){
            totalPagar = totalPagar + Double.parseDouble(TablaVentas.getValueAt(i,5).toString());
        }
        
        txtTotalPagar.setText(String.valueOf(totalPagar));
    }
    
    void guardarVentas(){
       
        int cliente = idCliente;
        int vendedor = v.getId();
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = totalPagar;
        String estado = "1";
        
        Ventas v = new Ventas();
        
        v.setIdCliente(cliente);
        v.setIdVendedor(vendedor);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        
        vd.guardarVentas(v);     
    }
    
    void guardarDetalle(){
        
        String idVentas = vd.idVentas();
        int idv = Integer.parseInt(idVentas);
        
        for (int i=0; i< TablaVentas.getRowCount(); i++){
            int idp = Integer.parseInt(TablaVentas.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(TablaVentas.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(TablaVentas.getValueAt(i, 5).toString());
            
            DetalleVentas dv = new DetalleVentas();
            dv.setIdVentas(idv);
            dv.setIdProducto(idp);
            dv.setCantidad(cantidad);
            dv.setPrecioVenta(precio);
            vd.guardarDetallaVentas(dv);
        }
    }
    
    void actualizarStock(){
        
        for (int i=0; i<modelo.getRowCount();i++){
            int idp = Integer.parseInt(TablaVentas.getValueAt(i,1).toString());
            int cant = Integer.parseInt(TablaVentas.getValueAt(i,3).toString());
            p = pd.buscarProducto(idp);
            int ncant = p.getStock() - cant; 
            pd.actualziarStock(idp, ncant);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JPanel VentanaVenta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
