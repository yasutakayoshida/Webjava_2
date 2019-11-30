package jp.co.systena.tigerscave.rpgapplication.application.model;

public class Witch extends Work{
	private String attack;
	private String heal;
	@Override
	public void fight() {
		//自動生成されたメソッド・スタブ
		attack=super.getName()+"はまほうで攻撃した！";

	}
	@Override
	public void recovery() {
		//自動生成されたメソッド・スタブ
		heal = super.getName() + "はまほうで回復した！";
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