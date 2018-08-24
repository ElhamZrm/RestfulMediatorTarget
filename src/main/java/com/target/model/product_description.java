package com.target.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class product_description {
	 private String title;
	 ArrayList < Object > bullet_description = new ArrayList < Object > ();
	 private String general_description;


	 // Getter Methods 

	 public String getTitle() {
	  return title;
	 }

	 public String getGeneral_description() {
	  return general_description;
	 }

	 // Setter Methods 

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setGeneral_description(String general_description) {
	  this.general_description = general_description;
	 }
	}
