package com.minseok.star;

public class Unit {
	// hp, 공격력, 방어력, 업그레이드, 좌표, 이동속도
	int max_hp;
	int hp;
	int speedMoving;
	Coordinates location;

	// 이동할 수 있음
	void move(Coordinates location) {
		this.location = location;
	}	
	@Override
	public String toString() { // Object 에 있는 메서드
		return String.format("나의 위치는 %d, %d이다\n", this.location.x, this.location.y);
	}
}
