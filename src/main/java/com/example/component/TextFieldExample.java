package com.example.component;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("component")
public class TextFieldExample extends VerticalLayout{
    public TextFieldExample() {
        final TextField textField = new TextField();
        textField.setClearButtonVisible(true);
        final Span greeting = new Span("Hello Stranger");

        textField.addValueChangeListener(event->
                greeting.setText("Hello " + textField.getValue()));
        add(textField,greeting);
    }
}
