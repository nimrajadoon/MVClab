/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controller.controller;

/**
 *
 * @author CUI
 */

import mvc.model.Book;
import mvc.model.Library;
import mvc.model.Member;
import mvc.View.view.LibraryView;

public class LibraryController {
    private Library model;
    private LibraryView view;

    public LibraryController(Library model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        model.addBook(book);
    }

    public void addMember(String name, int id) {
        Member member = new Member(name, id);
        model.addMember(member);
    }

    public void showBooks() {
        view.displayBooks(model.getBooks());
    }

    public void showMembers() {
        view.displayMembers(model.getMembers());
    }
}
