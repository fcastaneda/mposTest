package com.ancernet.mposcloud.connectors

import liquibase.changelog.filter.ActuallyExecutedChangeSetFilter;

import com.ancernet.franquicias.FranquiciasWsWrapper;
import com.ancernet.franquicias.FranquiciasWsWrapperProxy;
import com.ancernet.franquicias.FranquiciasWsWrapperServiceLocator;
import com.ancernet.franquicias.Cliente;
import com.ancernet.franquicias.Producto;
import com.ancernet.franquicias.Existencia;
import com.ancernet.franquicias.Precio;
import com.ancernet.franquicias.PromocionPorCliente;
import com.ancernet.mposcloud.domain.Factura;
import com.ancernet.mposcloud.domain.DetalleFactura;
import com.ancernet.mposcloud.domain.PromocionPorClienteDetalle;
import com.ancernet.mposcloud.domain.PromocionPorClienteRango;
import com.ancernet.mposcloud.domain.PromocionPorTipoCliente;
import com.ancernet.mposcloud.domain.PromocionPorTipoClienteDetalle;
import com.ancernet.mposcloud.domain.PromocionPorTipoClienteRango;
import com.vaadin.ui.ProgressBar;



class FranquiciasConnectorService  {

	volatile int contadorClientes,contadorProductos
	volatile float porcentajeClientes, porcentajeProductos

	float getPorcentaje(String entidad){

		switch(entidad){
			case "Clientes": return porcentajeClientes
			case "Productos": return porcentajeProductos
			
		}
	}


	int getClientes() {
		contadorClientes=0
		(1..100).each {

         Thread.sleep(200)
			System.out.println  "contador clientes:"+contadorClientes++
			
			porcentajeClientes=((float)contadorClientes)/100.00f
		}

		porcentajeClientes=1
		return contadorClientes
	}

	int getProductos() {
		contadorProductos=0
			(1..100).each {
				Thread.sleep(100)

			
		System.out.println  	"contador productos:"+contadorProductos++
			porcentajeProductos=((float)contadorProductos)/100.00f
		}
		porcentajeProductos=1
		return contadorProductos
	}

	


}