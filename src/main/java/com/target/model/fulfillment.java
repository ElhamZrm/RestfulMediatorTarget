package com.target.model;

public class fulfillment {
	 private boolean is_po_box_prohibited;
	 private String po_box_prohibited_message;


	 // Getter Methods 

	 public boolean getIs_po_box_prohibited() {
	  return is_po_box_prohibited;
	 }

	 public String getPo_box_prohibited_message() {
	  return po_box_prohibited_message;
	 }

	 // Setter Methods 

	 public void setIs_po_box_prohibited(boolean is_po_box_prohibited) {
	  this.is_po_box_prohibited = is_po_box_prohibited;
	 }

	 public void setPo_box_prohibited_message(String po_box_prohibited_message) {
	  this.po_box_prohibited_message = po_box_prohibited_message;
	 }
	}

