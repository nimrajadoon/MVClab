package mvc.Main.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CUI
 */
import mvc.Controller.controller.LibraryController;
import mvc.model.Library;
import mvc.View.view.LibraryView;

public class Main {
    public static void main(String[] args) {
     
        Library library = new Library();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(library, view);

        controller.addBook("To Kill a Mockingbird", "Harper Lee");
        controller.addBook("1984", "George Orwell");
        controller.addBook("The Great Gatsby", "F. Scott Fitzgerald");

        controller.addMember("Alice", 1);
        controller.addMember("Bob", 2);

        controller.showBooks();
        controller.showMembers();
    }
}
