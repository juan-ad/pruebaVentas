
package ModeloOperacion;

import Modelo.Cliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public int verificarRepetido(String dni){
        int rpta = 0;
        String sql = "select count(idCliente) from cliente where dniCliente = ? ";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()){
                
                rpta = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rpta;
    }
    
    public Cliente buscarCliente(String dni){
        
        String sql = "select idCliente,dniCliente,nombres from cliente where dniCliente = ?";
        Cliente c = new Cliente();
        try{            
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            
            while(rs.next()){
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));   
            }
        }catch(Exception ex){
            
        }
        return c;
    }
    
    @Override
    public List listado() {
        String sql = "select * from cliente";
        List <Cliente> lista = new ArrayList();
        try { 
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery(); //executeQuery solo permite ejecutar consultas de recuperacion select
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
        
        } catch (Exception ex) {
            
        }
       return lista;
    }

    @Override
    public int add(Object[] obj) {
        String sql = "insert into cliente (dniCliente,nombres,direccionCliente,estadoCliente) values(?,?,?,?)";
        int r = 0;       
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            r = ps.executeUpdate(); //devuelve el numero de filas afectadas o 0 si no se afecto ninguna fila
        
        } catch (Exception ex) {
            
        }
        
        return r;
    }

    @Override
    public int actualizar(Object[] obj) {
        
        String sql = "update cliente set dniCliente=?,nombres=?,direccionCliente=?,estadoCliente=? where idCliente=?";
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
        String sql = "delete from cliente where idCliente=?";
               
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
        } catch (Exception ex) {
            
        }
    }
}
