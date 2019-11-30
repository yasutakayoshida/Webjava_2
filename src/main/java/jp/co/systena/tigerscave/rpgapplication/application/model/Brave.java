package jp.co.systena.tigerscave.rpgapplication.application.model;

public class Brave extends Work {
	private String attack;
	private String heal;

	@Override
	public void fight() {
		//自動生成されたメソッド・スタブ
		attack= super.getName()+"は剣で攻撃した！";

	}
	@Override
	public void recovery() {
		//自動生成されたメソッド・スタブ
		heal=super.getName()+"はやくそうで回復した！";
	}
	public String getAttack() {
		return attack;

	}

	public void setAttack(String attack) {
		this.attack = attack;

	}

	public String getHeal() {
		return heal;
	}

	public void setHeal(String heal) {
		this.heal = heal;
	}

}