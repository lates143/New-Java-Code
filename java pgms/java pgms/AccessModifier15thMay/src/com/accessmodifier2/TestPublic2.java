package com.accessmodifier2;

import com.accessmodifier1.Public;

public class TestPublic2 /*extends Public*/{

	public static void main(String[] args) {
		Public p = new Public();
		System.out.println(p.id);
		System.out.println(p.name);
		p.display();

	}

}
