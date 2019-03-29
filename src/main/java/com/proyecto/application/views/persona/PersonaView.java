package com.proyecto.application.views.persona;


import com.proyecto.application.model.Persona;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class PersonaView extends VerticalLayout {
	Grid<Persona> grid;
	TextField filter;
	private Button addNewBtn;

	public PersonaView() {
		this.grid = new Grid<>(Persona.class);
		this.filter = new TextField();
		this.addNewBtn = new Button("Nueva Persona", VaadinIcon.PLUS.create());

		HorizontalLayout actions = new HorizontalLayout(filter, addNewBtn);
		this.add(actions, grid);

		grid.setHeight("200px");
		grid.setColumns("id", "nombre", "apellido");
		grid.getColumnByKey("id").setWidth("50px").setFlexGrow(0);

		filter.setPlaceholder("Ingrese Nombre");

	}
}
