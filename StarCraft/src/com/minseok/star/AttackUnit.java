package com.minseok.star;

public class AttackUnit extends Unit {
	int powerOfAttack;
	
	//유닛들간 공격할 수 있음
		void attack(Unit enemy) {
			enemy.hp -= this.powerOfAttack;
		}
}
