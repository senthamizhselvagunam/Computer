
package org.comp;

public class Desktop  implements Hardware,Software{//Multiple Inheritance
	
	public void desktopModel1() {
		System.out.println("desktopModel1 is Hp");
	}

	@Override
	public void softwareResources() {
		System.out.println("OS");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Moniter");
		
	}
	@Override
	public void desk() {
		System.out.println("keyboard");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel1();
		d.softwareResources();
		d.hardwareResources();
		d.desk();
	}
	
	
	
	
	
	

}
