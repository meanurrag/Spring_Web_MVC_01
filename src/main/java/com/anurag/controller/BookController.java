package com.anurag.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anurag.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String bookDetails(Model model) {
		
		Book b1 = new Book("Ikigai", 101, 240.00);
		Book b2 = new Book("Atomic Habits", 102, 500.00);
		Book b3 = new Book("HarryPotter", 103, 480.00);
		
		model.addAttribute("book", Arrays.asList(b1, b2, b3));
		return "book";
	}
}
