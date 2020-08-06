package com.minseok.star;

public class FireBat extends AttackUnit implements Cureable {
	//파이어뱃 능력치
	public FireBat(){
		this.max_hp = 50;
		this.hp = max_hp;
		this.powerOfAttack = 8;
		this.speedMoving = 5;
	}
	
	@Override
	public String toString() {
		return "(파이어뱃)" + super.toString();
	}
}
