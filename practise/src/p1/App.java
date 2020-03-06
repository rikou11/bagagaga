package p1;

public class App {

	public static void main(String[] args) {//les interfaces
	machine mach1=new machine();
mach1.start();

	persone p=new persone("bob");
p.greet();
p.showInfo();
info info1= new machine();/*bch y9der y3ayt la methode li dakhel linterface li khasa
b chaque objet crienah 
*/
info1.showInfo();
info info2= p;
info2.showInfo();
System.out.println("mmmmmmmmmmmmmm");
output_info(mach1);
output_info(p);
	}
private static void output_info (info infoo) { 
	
	infoo.showInfo();
}
}
