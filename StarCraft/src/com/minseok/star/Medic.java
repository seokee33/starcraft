package com.minseok.star;

public class Medic extends Unit implements Cureable {
	//메딕의 능력치
	public Medic() {
		this.max_hp = 40;
		this.hp = max_hp;
		this.speedMoving = 6;
	}

	//메딕이 힐하는것
	void cure(Unit unit) {
		if(unit instanceof Cureable) {
			if(unit.hp <unit.max_hp) {
				while(unit.hp < unit.max_hp) {
					unit.hp++;
				}
			}
		}else {
			System.out.println("치료할 수 없습니다.");
		}
		
	
	}
	
	@Override
	public String toString() {
		return "(메딕)" + super.toString();
	}
}
