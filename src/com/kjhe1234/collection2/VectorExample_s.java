package com.kjhe1234.collection2;

import java.util.*;

public class VectorExample_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board_s> list = new Vector<Board_s>();
		
		list.add(new Board_s("제목1", "내용1", "글쓴이1"));
		list.add(new Board_s("제목2", "내용2", "글쓴이2"));
		list.add(new Board_s("제목3", "내용3", "글쓴이3"));
		list.add(new Board_s("제목4", "내용4", "글쓴이4"));
		list.add(new Board_s("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i=0;i<list.size();i++) {
			Board_s board = list.get(i);
			System.out.println(board.subject + "\t"+board.content+"\t"+board.writer);
			
		}
		
	}

}
