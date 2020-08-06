package com.minseok.star;

public class Barrack {

	Unit makeUnit(int no) {
		switch (no) {
		case 1:
			return new Marine();
		case 2:
			return new FireBat();
		case 3:
			return new Medic();
		default:
			return null;
		}

	}

	// no : 1 > 마린을 객체화 한 다음에 그 주소값을 리턴
	// no : 2 > 파이어뱃을 객체화 한 후 주소값 리턴
	// no : 3 > 메딕을 객체화 한 후 주소값 리턴
}
