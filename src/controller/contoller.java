package controller;

import model.modele;
import view.View;

public class contoller {
    private modele model;
    private View view;

    public contoller(modele model, View view){
        this.model = model;
        this.view = view;
    }
    public void initialize(){
        view.update(model.getData());
        view.show();
    }
}
