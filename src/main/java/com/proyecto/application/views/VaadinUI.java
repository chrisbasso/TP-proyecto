package com.proyecto.application.views;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;

public class VaadinUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = VaadinUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
