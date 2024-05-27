package com.kjhe1234.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member_s> memberList = new ArrayList<Member_s>();
		
		Member_s member1 = new Member_s();
		member1.setId("tiger");
		member1.setPw("12345");
		member1.setAge(25);
		member1.setName("홍길동");
		member1.setPhone("010-1234-5678");
		
		Member_s member2 = new Member_s();
		member2.setId("lion");
		member2.setPw("33333");
		member2.setAge(32);
		member2.setName("이순신");
		member2.setPhone("010-7777-5555");
		
		Member_s member3 = new Member_s("cat", "12333", "김고양", 23, "010-1233-3211");
		
		memberList.add(member1);		
		memberList.add(member2);
		memberList.add(member3);
		
		if (memberList.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
		
	}

}
