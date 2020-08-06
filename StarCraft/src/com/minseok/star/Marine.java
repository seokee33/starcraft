package com.minseok.star;

public class Marine extends AttackUnit implements Cureable {
	//마린의 능력치
	public Marine() {
		// 객체가 되면 (생성이 되면)
		// hp값은 50,
		// powerOfAttack은 10
		// speedMoving 5로 세팅되게 해주세요.
		this.max_hp = 30;
		this.hp = max_hp;
		this.powerOfAttack = 5;
		this.speedMoving = 5;
	}

	
	@Override
	public String toString() {
		return "(마린)" + super.toString();
	}
	
	
	
}
