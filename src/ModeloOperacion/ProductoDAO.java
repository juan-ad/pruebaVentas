package ModeloOperacion;

import Modelo.Producto;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ProductoDAO implements CRUD {
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public void actualziarStock(int idp, int cantidad){
        
        String sql = "update producto set stock=? from producto where idproducto = ?";
        try{            
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, idp);
            ps.executeUpdate();          
            
        }catch(Exception ex){
            
        }
    }
    public Producto buscarProducto(int id){
        
        String sql = "select * from producto where idproducto = ?";
        Producto p = new Producto();
        try{            
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));   
            }
        }catch(Exception ex){
            
        }
        return p;
    }
      
    @Override
    public List listado() {
        String sql = "select * from producto";
        List <Producto> lista = new ArrayList();
        try { 
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery(); //executeQuery solo permite ejecutar consultas de recuperacion select
            
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                lista.add(p);
            }
        
        } catch (Exception ex) {
            
        }
       return lista;
    }

    @Override
    public int add(Object[] obj) {
        String sql = "insert into producto (nomProducto,precio,stock,estado) values(?,?,?,?)";
        int r = 0;       
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            r = ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
        
        return r;
    }

    @Override
    public int actualizar(Object[] obj) {
        
        String sql = "update producto set nomProducto=?,precio=?,stock=?,estado=? where idProducto=?";
        int r = 0;       
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            ps.setObject(5, obj[4]);
            r = ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
        
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from producto where idProducto=?";
               
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
    }
    
    public void generarReporte(){
        
        try {
            acceso = con.conectar();
            JasperReport reporte = null;
            String path = "src/Reportes/ReporteProductos.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, acceso);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
}
