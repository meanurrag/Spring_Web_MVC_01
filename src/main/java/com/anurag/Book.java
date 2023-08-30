package com.anurag;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private String bookName;
	private Integer bookID;
	private Double bookPrice;
}
