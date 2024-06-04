package dao;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoDAO implements DAO <Producto> {

	private List <Producto> productos = new ArrayList <>();

	@Override
	public void crear(Producto t) {

		productos.add(t);
		
		
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
