package UpDownCasting;
class machine {
	public void star () {System.out.println("started");}
}
class cmaera extends machine {
	
	public void star () {System.out.println("camera started");}
	public void snap () {System.out.println("Clitch ");}
}

public class App {

	public static void main(String[] args) {
machine m=new machine();	

cmaera a=new cmaera();
		// upcasting 
	machine m2= new  cmaera(); // machine m2=a; 
	m2.star();
		// error : m2.snap();
	    // downCasting
	machine m3 = new machine ();
	//cmaera mm= (cmaera )m3;
	// mm.snap(); its  possible to use methodes of cmaera now sauf star()
	// error: we can't call now mm.star(); 
     
	}

}
