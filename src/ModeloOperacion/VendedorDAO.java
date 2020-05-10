package ModeloOperacion;

import Modelo.Conexion;
import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class VendedorDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public int cambiarContraseña(String dni, String user, String nc){
        System.out.println(user);
        System.out.println(dni);
        System.out.println(nc);
        String sql = "update vendedor set dniVendedor=? where dniVendedor=? and user_2=?";
        int rpta = 0;
        try{
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, nc);
            ps.setString(2, dni);
            ps.setString(3, user);
            rpta = ps.executeUpdate();
                        
        }catch(Exception ex){
            
        }
        return rpta;
    }
    
    public Vendedor ValidarVendedor(String dni, String user){
        Vendedor ven = new Vendedor();
        String sql = "select * from vendedor where dniVendedor=? and user_2=?";
        
        try{
            
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            
            while(rs.next()){
               
                ven.setId(rs.getInt(1));
                ven.setDni(rs.getString(2));
                ven.setNombre(rs.getString(3));
                ven.setTelefono(rs.getString(4));
                ven.setEstado(rs.getString(5));
                ven.setUser(rs.getString(6));
                ven.setTipo(rs.getString(7));
            }
        }catch(SQLException ex){
             
        }
        
        return ven;
    }
    
    @Override
    public List listado() {
        String sql = "select * from vendedor";
        List <Vendedor> lista = new ArrayList();
        try { 
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery(); //executeQuery solo permite ejecutar consultas de recuperacion select
            
            while(rs.next()){
                Vendedor v = new Vendedor();
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNombre(rs.getString(3));
                v.setTelefono(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUser(rs.getString(6));
                v.setTipo(rs.getString(7));
                lista.add(v);
            }
        
        } catch (Exception ex) {
            
        }
       return lista;
    }

    @Override
    public int add(Object[] obj) {
        String sql = "insert into vendedor (dniVendedor,nomVendedor,telVendedor,estado,user_2,tipo_usuario) values(?,?,?,?,?,?)";
        int r = 0;       
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            ps.setObject(5, obj[4]);
            ps.setObject(6, obj[5]);
            r = ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
        
        return r;
    }

    @Override
    public int actualizar(Object[] obj) {
        
        String sql = "update vendedor set dniVendedor=?,nomVendedor=?,telVendedor=?,estado=?,user_2=?,tipo_usuario=? where idVendedor=?";
        int r = 0;       
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            ps.setObject(5, obj[4]);
            ps.setObject(6, obj[5]);
            ps.setObject(7, obj[6]);
            r = ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
        
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from vendedor where idVendedor=?";
               
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
    }
    
    
}
