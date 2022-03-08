package controlador;

import modelo.dao.MascotaDao;
import modelo.dao.NacimientoDao;
import modelo.dao.PersonaDao;
import modelo.dao.PersonaProductoDao;
import modelo.dao.ProductoDao;
import vista.gui.RegistrarMascotasGui;
import vista.gui.RegistrarPersonasGui;
import vista.gui.RegistrarProductosGui;
import vista.gui.VentanaPrincipal;

public class Relaciones {
	public Relaciones() {
		//Se declaran las clases que van a representar instancias unicas
		VentanaPrincipal miVentanaPrincipal;
		RegistrarPersonasGui miRegistrarPersonasGui;
		RegistrarMascotasGui miRegistrarMascotasGui;
		RegistrarProductosGui miRegistrarProductosGui;
		Coordinador miCoordinador;
		PersonaDao miPersonaDao;
		NacimientoDao miNacimientoDao;
		MascotaDao miMascotaDao;
		ProductoDao miProductoDao;
		PersonaProductoDao miPersonaProductoDao;
		
		//Se instancian por unica ocasión las clases declaradas
		miVentanaPrincipal= new VentanaPrincipal();
		miRegistrarPersonasGui= new RegistrarPersonasGui(miVentanaPrincipal, true);
		miRegistrarMascotasGui= new RegistrarMascotasGui(miVentanaPrincipal, true, "");
		miRegistrarProductosGui= new RegistrarProductosGui(miVentanaPrincipal, true);
		miCoordinador= new Coordinador();
		miPersonaDao= new PersonaDao();
		miMascotaDao= new MascotaDao();
		miNacimientoDao= new NacimientoDao();
		miProductoDao= new ProductoDao();
		miPersonaProductoDao= new PersonaProductoDao();
		
		//Se establece la relación entre el coordinador y cada instancia unica
		//Al coordinador se le asigna el control de cada clase unica
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setRegistrarPersonasGui(miRegistrarPersonasGui);
		miCoordinador.setRegistrarMascotasGui(miRegistrarMascotasGui);
		miCoordinador.setRegistrarProductosGui(miRegistrarProductosGui);
		miCoordinador.setPersonaDao(miPersonaDao);
		miCoordinador.setMascotaDao(miMascotaDao);
		miCoordinador.setNacimientoDao(miNacimientoDao);
		miCoordinador.setProductoDao(miProductoDao);
		miCoordinador.setPersonaProductoDao(miPersonaProductoDao);
		
		//A cada clase unica se le asigna la unica instancia del coordinador
		miVentanaPrincipal.setMiCordinador(miCoordinador);
		miRegistrarPersonasGui.setMiCordinador(miCoordinador);
		miRegistrarMascotasGui.setMiCordinador(miCoordinador);
		miRegistrarProductosGui.setMiCordinador(miCoordinador);
		miPersonaDao.setMiCordinador(miCoordinador);
		miNacimientoDao.setMiCordinador(miCoordinador);
		miMascotaDao.setMiCordinador(miCoordinador);
		miProductoDao.setMiCordinador(miCoordinador);
		miPersonaProductoDao.setMiCordinador(miCoordinador);
		
		//Se muestra la ventana principal.
		miVentanaPrincipal.setVisible(true);
	}

}
