package Lab5;

import java.io.InputStream;
import java.util.Scanner;

public class Device {

	String name;
	int ram;
	int rom;
	int extStorage;
	int diplaySize;
	int fCam;
	int rCam;
	int batteryCap;
	int price;

	public Device(String name, int ram, int rom, int extStorage, int diplaySize, int fCam, int rCam, int batteryCap, int price) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.extStorage = extStorage;
		this.diplaySize = diplaySize;
		this.fCam = fCam;
		this.rCam = rCam;
		this.batteryCap = batteryCap;
		this.price = price;
	}

	public void print(){
		System.out.println(this.name );
		System.out.println(this.ram + "GB RAM");
		System.out.println(this.rom + "GB ROM");
		System.out.println("Expandable Upto " + this.extStorage + "GB");
		System.out.println(this.diplaySize + " inch Display•");
		System.out.println(this.fCam + " Front Camera");
		System.out.println(this.rCam + " Rear Camera");
		System.out.println(this.batteryCap + " mAh Li-ion Battery");
		System.out.println("Price: Rs " + this.price);
	}

	public static void main(String[] args) {
		Device dev1= new Device("Samsung Galaxy On Nxt", 3, 16, 256, 5, 13, 8, 3300, 11900);
		dev1.print();
		Device dev2= new Device("iVooMi Me 4", 1, 8, 64, 4, 5, 5, 2000, 299);
		dev2.print();
	
	}
	
}

