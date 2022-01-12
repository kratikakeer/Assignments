package com.te.springautowire;

public class Laptop {
	Battery b;
	Screen s;
	HardDisk hd1;
	HardDisk hd2;
		
public Laptop(Battery b, Screen s, HardDisk hd1, HardDisk hd2) {
		super();
		this.b = b;
		this.s = s;
		this.hd1 = hd1;
		this.hd2 = hd2;
	}


//	
//	public void setB(Battery b) {
//		this.b = b;
//	}
//	public void setS(Screen s) {
//		this.s = s;
//	}
//	public void setHd1(HardDisk hd1) {
//		this.hd1 = hd1;
//	}
//	public void setHd2(HardDisk hd2) {
//		this.hd2 = hd2;
//	}
	
	
//	public void test() {
//		b.demo();
//	}


	@Override
	public String toString() {
		return "Laptop [b=" + b + ", s=" + s + ", hd1=" + hd1 + ", hd2=" + hd2 + "]";
	}

}
