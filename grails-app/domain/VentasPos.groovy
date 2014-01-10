

import java.util.Date;

class VentasPos {


  int 		empresa
  int 		compania
  int		cod_bodega
  Date 		fecha
  String 	referencia
  String	plu
  double	cantidad
  double	total
  double 	descuento
  String	cod_cliente
  String	cliente
  String 	vendedor
  int		tipo_documento
  
  
  Long version
  
  
	
	static constraints = {
	}
	static mapping = {
		
		version true
		id generator: 'assigned', name: "referencia", type: 'string'
		
	}
  
	
		
		
}
