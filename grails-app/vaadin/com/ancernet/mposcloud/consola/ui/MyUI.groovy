package com.ancernet.mposcloud.consola.ui

import com.vaadin.ui.AbsoluteLayout
import com.vaadin.ui.Button
import com.vaadin.ui.Component
import com.vaadin.ui.MenuBar
import com.vaadin.ui.Notification
import com.vaadin.ui.PopupDateField
import com.vaadin.ui.PopupView
import com.vaadin.ui.ProgressBar
import com.vaadin.ui.TabSheet
import com.vaadin.ui.Table
import com.vaadin.ui.TextField
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.Window
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.Button.ClickEvent
import com.vaadin.ui.Button.ClickListener
import com.vaadin.ui.MenuBar.Command
import com.vaadin.ui.MenuBar.MenuItem
import com.vaadin.ui.PopupView.PopupVisibilityEvent
import com.vaadin.data.Container
import com.vaadin.data.Property.ValueChangeEvent
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.data.util.BeanItemContainer
import com.vaadin.grails.Grails
import com.vaadin.shared.ui.datefield.Resolution

import java.text.DecimalFormat

import org.apache.commons.logging.LogFactory

import com.ancernet.mposcloud.connectors.FranquiciasConnectorService
import com.ancernet.mposcloud.domain.Cliente
import com.ancernet.mposcloud.domain.Producto
import com.ancernet.mposcloud.domain.Existencia
import com.ancernet.mposcloud.domain.Precio
import com.ancernet.mposcloud.domain.PromocionPorCliente;
import com.ancernet.mposcloud.domain.PromocionPorClienteDetalle;
import com.ancernet.mposcloud.domain.PromocionPorClienteRango;
import com.ancernet.mposcloud.domain.PromocionPorTipoCliente;
import com.ancernet.mposcloud.domain.PromocionPorTipoClienteDetalle;
import com.ancernet.mposcloud.domain.PromocionPorTipoClienteRango;

/**
 *
 *
 * @author
 */


class MyUI extends UI {
	private TextField textClientes,textProductos,textPrecios
	
    Button button

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		AbsoluteLayout layout = new AbsoluteLayout()
		layout.setWidth("800px")
		layout.setHeight("500px")
		
		
		// Layout de menu y session
		AbsoluteLayout menuLayout = new AbsoluteLayout()
		menuLayout.setWidth("800px")
		menuLayout.setHeight("30px")
		layout.addComponent(menuLayout,"top:1px; left:1px")
		//menuLayout.addStyleName("layout-menu");

		TabSheet tabSheet = new TabSheet();

		layout.addComponent(tabSheet,"top:30px; left:1px")



		AbsoluteLayout layoutTabSincronizar = new AbsoluteLayout()
		layoutTabSincronizar.setWidth("800px")
		layoutTabSincronizar.setHeight("500px")


		button = new Button(Grails.i18n("app.sincronizar"))
		button.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						UI.getCurrent().setPollInterval(500);
						llamarServicio()
					}
				})
		layoutTabSincronizar.addComponent(button,"top:40px; left:40px")
		
	//	button.setEnabled(false)

		textClientes = new TextField(Grails.i18n("app.clientes.label"))
		textClientes.setEnabled(false)
		layoutTabSincronizar.addComponent(textClientes,"top:80px; left:20px" )

		textProductos = new TextField(Grails.i18n("app.productos.label"))
		textProductos.setEnabled(false)
		layoutTabSincronizar.addComponent(textProductos,"top:80px; left:200px" )
		
		layoutTabSincronizar.setCaption(Grails.i18n("app.sincronizar.mobil"))
		tabSheet.addTab(layoutTabSincronizar)
		
		
		

		setContent(layout)
	}

	// CLIENTES
	public Thread importEntityThread(domain, nombre, textField, Closure c){
		def	mainThread = Thread.start{

			textField.setValue("0")
			//barClientes.setValue(0.0f)
			System.out.println   "Buscando ${nombre} ..."

			int cantidad = c()
			textField.setValue(cantidad+"");
			System.out.println   "<<${nombre} finalizado >>"

		}
		return mainThread
	}

	public Thread monitorEntityThread(nombre, textField, Closure c){

		def progressThread = Thread.start{
			int progreso = 0
			while(progreso<100){
				progreso = new Float(c().getPorcentaje(nombre)*100).round()
				String progresoS = progreso+"%"
				System.out.println  "Progreso de ${nombre}  = "+progresoS
				//barClientes.setValue(Grails.get(FranquiciasConnectorService).getPorcentaje())
				textField.setValue(progresoS);

			}


		}

		return progressThread
	}




	boolean llamarServicio(){

		def clientesMainThread = importEntityThread(Cliente, "Clientes", textClientes) {return Grails.get(FranquiciasConnectorService).getClientes()}
		def clientesProgressThread = monitorEntityThread("Clientes", textClientes ){ return Grails.get(FranquiciasConnectorService)}

		def productosMainThread = importEntityThread(Producto, "Productos", textProductos) {return Grails.get(FranquiciasConnectorService).getProductos()}
		def productosProgressThread = monitorEntityThread("Productos", textProductos ){ return Grails.get(FranquiciasConnectorService)}


		clientesMainThread.join()
		clientesProgressThread.join()

		productosMainThread.join()
		productosProgressThread.join()




		return true
	}
}










