/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CUI
 */
public class Main {
    public static void main(String[] args) {
       
        Model model = new Model();

        View view = new View();

        Controller controller = new Controller(model, view);

    
        controller.setModelData("MVC Pattern Example");
        controller.updateView();

        controller.setModelData("Updated Data in MVC");
        controller.updateView();
    }
}

