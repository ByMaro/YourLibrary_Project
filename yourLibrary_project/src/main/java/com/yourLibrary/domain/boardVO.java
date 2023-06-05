package com.yourLibrary.domain;

import java.util.Date;

import lombok.Data;

@Data
public class boardVO {
	private int board_index;
	private String userid;
	private String title;
	private String genre;
	private String book_content;
	private Date regdate;
	private char upload_image_check;
	private int score;
	private String keyword1;
	private String keyword2;
	private String keyword3;
}