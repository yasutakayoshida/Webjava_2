package jp.co.systena.tigerscave.rpgapplication.application.model;

public abstract class Work {

	private String name;

	public abstract void fight();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}