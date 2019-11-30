package jp.co.systena.tigerscave.rpgapplication.application.model;

public class Monk extends Work{
	private String attack;
	@Override
	public void fight() {
		//自動生成されたメソッド・スタブ
		attack=super.getName()+"は拳で攻撃した！";

	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}

}