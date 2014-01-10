vaadin {

    // Your Vaadin UI classes that extends com.vaadin.ui.UI.
    // The application will be available at e.g. http://localhost:8080/grails-vaadin7-demo/
    mapping = [
            "/*": "com.ancernet.mposcloud.consola.ui.MyUI"
    ]

    // Extra mapping in case you need 'reserve' a URL and it shouldn't be mapped to e.g. /* by Vaadin
    // mappingExtras = [
    //         '/console/*'
    // ]

    // This is optional because the servlet is provided by default.
    // servletClass = "com.mycompany.MyGrailsAwareApplicationServlet"
	// Uncomment this to enable asynchronous communication, useful for vaadin-push
    asyncSupported = true
    productionMode = false
}

environments {
    production {
        vaadin {
            productionMode = true
        }
    }
}
