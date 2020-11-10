package br.com.mayconkevin.excaliburspring.domain;

public class Warframe {

	private String name;
	private Integer health;
	private Integer shield;
	private Integer armor;
	private Integer energy;
	private Double speed;
	
	private Integer strenght;
	private Integer range;
	private Integer efficiency;
	private Integer Duration; 

	public Warframe() {}

	public Warframe(String name) {
		this.name = name;
	}

	public Warframe(String name, Integer health, Integer shield, Integer armor, Integer energy, Double speed) {
		super();
		this.name = name;
		this.health = health;
		this.shield = shield;
		this.armor = armor;
		this.energy = energy;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getShield() {
		return shield;
	}

	public void setShield(Integer shield) {
		this.shield = shield;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Integer getStrenght() {
		return strenght;
	}

	public void setStrenght(Integer strenght) {
		this.strenght = strenght;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Integer getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Integer efficiency) {
		this.efficiency = efficiency;
	}

	public Integer getDuration() {
		return Duration;
	}

	public void setDuration(Integer duration) {
		Duration = duration;
	}


}