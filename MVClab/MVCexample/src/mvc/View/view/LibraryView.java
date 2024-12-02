/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.View.view;

import mvc.model.Book;
import java.util.List;

/**
 *
 * @author CUI
 */;

import mvc.model.Book;
 import mvc.model.Member;
import mvc.model.Book;
import java.util.List;

public class LibraryView {
    public void displayBooks(List<Book> books) {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + " (" + status + ")");
        }
    }

 
    public void displayMembers(List<Member> members) {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println("Name: " + member.getName() + ", ID: " + member.getMemberId());
        }
    }
}

