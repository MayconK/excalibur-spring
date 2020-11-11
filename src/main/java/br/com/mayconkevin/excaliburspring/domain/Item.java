package br.com.mayconkevin.excaliburspring.domain;

import br.com.mayconkevin.excaliburspring.domain.enums.TypeItem;

public class Item {

	private Integer category;
	private String name;
	private Integer level;
	
	public Item() {}

	public Item(Integer category, String name, Integer level) {
		super();
		this.category = category;
		this.name = name;
		this.level = level;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
}
