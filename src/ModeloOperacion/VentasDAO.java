package ModeloOperacion;

import Modelo.Conexion;
import Modelo.DetalleVentas;
import Modelo.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentasDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    int rpta = 0;
    
    public String nroSerie(){
        String serie = "";
        String sql = "select max(numSerie) from ventas";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               serie = rs.getString(1);
            }
        }catch(Exception ex){
        
        }
        return serie;
    }
    
    public String idVentas(){
        String idVentas = "";
        String sql = "select max(idVentas) from ventas"; // max devuelve el valor mas grande de la columna seleccionada
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                idVentas = rs.getString(1);
            }
        }catch(Exception ex){
            
        }
        return idVentas;
    }
    
    public int guardarVentas(Ventas v){
        Ventas ventas = new Ventas();
        String sql = "insert into ventas (cliente,vendedor,numSerie,fechaVenta,monto,estado) values(?,?,?,?,?,?)";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            rpta = ps.executeUpdate();
        }catch (Exception ex){
            
        }
        return rpta;
    }
    
    public int guardarDetallaVentas(DetalleVentas dv){
        DetalleVentas dVentas = new DetalleVentas();
        String sql = "insert into detalle_ventas (venta,producto,cantidad,precio_venta) values(?,?,?,?)";
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, dVentas.getIdVentas());
            ps.setInt(2, dVentas.getIdProducto());
            ps.setInt(3, dVentas.getCantidad());
            ps.setDouble(4, dVentas.getPrecioVenta());
            rpta = ps.executeUpdate();
        }catch (Exception ex){
            
        }
        return rpta;
    }
}
