package com.example.Book_CRUD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Books {
    List<String> arr = new ArrayList<>(Arrays.asList("java","cpp","python","django","flutter"));

    // Get all books
    public List<String> allBook(){
        return arr;
    }

    // Get a specific by name
    public String getBookByName(String bookName){
        if(bookName.equals(arr.get(0))){
            return "Yes " + bookName + " is present in the list";
        }
        if(bookName.equals(arr.get(1))){
            return "Yes " + bookName + " is present in the list";
        }
        if(bookName.equals(arr.get(2))){
            return "Yes " + bookName + " is present in the list";
        }
        if(bookName.equals(arr.get(3))){
            return "Yes " + bookName + " is present in the list";
        }
        if(bookName.equals(arr.get(4))){
            return "Yes " + bookName + " is present in the list";
        }
        return "Not found or " + bookName + " isn't present in the list";
    }

    // Get specific book by bookIndex
    public String getBookByIdx(int bookIndex){
        switch(bookIndex){
            case 0:
            return "Yes " + arr.get(bookIndex) + " is present in the list";
            case 1:
            return "Yes " + arr.get(bookIndex) + " is present in the list";
            case 2:
            return "Yes " + arr.get(bookIndex) + " is present in the list";
            case 3:
            return "Yes " + arr.get(bookIndex) + " is present in the list";
            case 4:
            return "Yes " + arr.get(bookIndex) + " is present in the list";
            default : return "Not found or " + arr.get(bookIndex) + " isn't present in the list";
        }
    }

    // add new book by name
    public String addBook(String add){
        arr.add(add);
        return add + " add in the list successfully";
    }

    // Delete one book by bookIndex
    public String delete(int dlt){  
        String ans = arr.get(dlt);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(dlt)==arr.get(i)){
                arr.remove(arr.get(dlt));
            }
        }
        return ans + " is successfully deleted in the list";
    }

    // Update a specific book by bookIndex and bookName
    public String update(String newBook, int bookId){
        String deletedBook = arr.get(bookId);
        // String ans = newBook;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(bookId)==arr.get(i)){
                arr.add(bookId, newBook);
            }
        }
        return deletedBook + " is deleted successfully and " + newBook + " is added in the list";
    }
}
