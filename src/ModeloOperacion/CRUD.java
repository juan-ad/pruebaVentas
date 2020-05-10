package ModeloOperacion;

import java.util.List;

public interface CRUD {
    
    public List listado();
    public int add(Object[] obj);
    public int actualizar(Object[] obj);
    public void eliminar(int id);
}
