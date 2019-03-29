package com.proyecto.application.views;

import com.proyecto.application.views.persona.PersonaView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.AppLayoutMenu;
import com.vaadin.flow.component.applayout.AppLayoutMenuItem;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

	private VerticalLayout mainLayout;

	AppLayout appLayout;

	AppLayoutMenu menu;


	public MainView() {
		this.mainLayout = new VerticalLayout();

		appLayout = new AppLayout();
		menu = appLayout.createMenu();

		menu.addMenuItems(new AppLayoutMenuItem("Personas", e->openPersonaView()),
				new AppLayoutMenuItem("Pagina 2"),
				new AppLayoutMenuItem("Pagina 3"),
				new AppLayoutMenuItem("Pagina 4"));

		Component content = new Span(new H3("Aplicación Prueba"),
				new Span("TP Proyecto I"));
		appLayout.setContent(content);

		this.add(mainLayout);
		mainLayout.add(appLayout);
	}

	private void openPersonaView() {
		appLayout.removeContent();
		appLayout.setContent(new PersonaView());
	}
}

