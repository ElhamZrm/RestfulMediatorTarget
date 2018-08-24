package com.target.model;

import java.util.ArrayList;
import java.util.List;

public class Item {
	 private String tcin;
	 bundle_components bundle_components;
	 private String dpci;
	 private String upc;
	 product_description product_description;
	 private String parent_items;
	 private String buy_url;
	 variation variation;
	 enrichment enrichment;
	 private String return_method;
	 handling handling;
	 recall_compliance recall_compliance;
	 tax_category tax_category;
	 display_option display_option;
	 fulfillment fulfillment;
	 package_dimensions package_dimensions;
	 environmental_segmentation environmental_segmentation;
	 manufacturer manufacturer;
	 ArrayList < product_vendors > product_vendors = new ArrayList < product_vendors > ();
	 product_classification product_classification;
	 product_brand product_brand;
	 private String item_state;
	 ArrayList < Object > specifications = new ArrayList < Object > ();
	 attributes attributes;
	 private String country_of_origin;
	 private String relationship_type_code;
	 private boolean subscription_eligible;
	 ArrayList < Object > ribbons = new ArrayList < Object > ();
	 ArrayList < Object > tags = new ArrayList < Object > ();
	 private String estore_item_status_code;
	 return_policies Return_policiesObject;
	 private boolean gifting_enabled;
	public String getTcin() {
		return tcin;
	}
	public void setTcin(String tcin) {
		this.tcin = tcin;
	}
	public bundle_components getBundle_components() {
		return bundle_components;
	}
	public void setBundle_components(bundle_components bundle_components) {
		this.bundle_components = bundle_components;
	}
	public String getDpci() {
		return dpci;
	}
	public void setDpci(String dpci) {
		this.dpci = dpci;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public product_description getProduct_description() {
		return product_description;
	}
	public void setProduct_description(product_description product_description) {
		this.product_description = product_description;
	}
	public String getParent_items() {
		return parent_items;
	}
	public void setParent_items(String parent_items) {
		this.parent_items = parent_items;
	}
	public String getBuy_url() {
		return buy_url;
	}
	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}
	public variation getVariation() {
		return variation;
	}
	public void setVariation(variation variation) {
		this.variation = variation;
	}
	public enrichment getEnrichment() {
		return enrichment;
	}
	public void setEnrichment(enrichment enrichment) {
		this.enrichment = enrichment;
	}
	public String getReturn_method() {
		return return_method;
	}
	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}
	public handling getHandling() {
		return handling;
	}
	public void setHandling(handling handling) {
		this.handling = handling;
	}
	public recall_compliance getRecall_compliance() {
		return recall_compliance;
	}
	public void setRecall_compliance(recall_compliance recall_compliance) {
		this.recall_compliance = recall_compliance;
	}
	public tax_category getTax_category() {
		return tax_category;
	}
	public void setTax_category(tax_category tax_category) {
		this.tax_category = tax_category;
	}
	public display_option getDisplay_option() {
		return display_option;
	}
	public void setDisplay_option(display_option display_option) {
		this.display_option = display_option;
	}
	public fulfillment getFulfillment() {
		return fulfillment;
	}
	public void setFulfillment(fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}
	public package_dimensions getPackage_dimensions() {
		return package_dimensions;
	}
	public void setPackage_dimensions(package_dimensions package_dimensions) {
		this.package_dimensions = package_dimensions;
	}
	public environmental_segmentation getEnvironmental_segmentation() {
		return environmental_segmentation;
	}
	public void setEnvironmental_segmentation(environmental_segmentation environmental_segmentation) {
		this.environmental_segmentation = environmental_segmentation;
	}
	public manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public ArrayList<product_vendors> getProduct_vendors() {
		return product_vendors;
	}
	public void setProduct_vendors(ArrayList<product_vendors> product_vendors) {
		this.product_vendors = product_vendors;
	}
	public product_classification getProduct_classification() {
		return product_classification;
	}
	public void setProduct_classification(product_classification product_classification) {
		this.product_classification = product_classification;
	}
	public product_brand getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(product_brand product_brand) {
		this.product_brand = product_brand;
	}
	public String getItem_state() {
		return item_state;
	}
	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}
	public ArrayList<Object> getSpecifications() {
		return specifications;
	}
	public void setSpecifications(ArrayList<Object> specifications) {
		this.specifications = specifications;
	}
	public attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(attributes attributes) {
		this.attributes = attributes;
	}
	public String getCountry_of_origin() {
		return country_of_origin;
	}
	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}
	public String getRelationship_type_code() {
		return relationship_type_code;
	}
	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}
	public boolean isSubscription_eligible() {
		return subscription_eligible;
	}
	public void setSubscription_eligible(boolean subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}
	public ArrayList<Object> getRibbons() {
		return ribbons;
	}
	public void setRibbons(ArrayList<Object> ribbons) {
		this.ribbons = ribbons;
	}
	public ArrayList<Object> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Object> tags) {
		this.tags = tags;
	}
	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}
	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}
	public return_policies getReturn_policiesObject() {
		return Return_policiesObject;
	}
	public void setReturn_policiesObject(return_policies return_policiesObject) {
		Return_policiesObject = return_policiesObject;
	}
	public boolean isGifting_enabled() {
		return gifting_enabled;
	}
	public void setGifting_enabled(boolean gifting_enabled) {
		this.gifting_enabled = gifting_enabled;
	}


	 
	 
	
	}
