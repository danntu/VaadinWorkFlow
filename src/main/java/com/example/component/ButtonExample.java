package com.example.component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("button")
@PWA(name="Project based for Vaadin flow", shortName = "Project Base")
public class ButtonExample extends VerticalLayout {
	public ButtonExample() {
		Button button = new Button("Click me",
				buttonClickEvent -> Notification.show("Clicked",1000, Notification.Position.MIDDLE));
		add(button);
 	}
}
