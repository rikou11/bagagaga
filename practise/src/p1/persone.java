package p1;

public class persone implements info{
private String nom;

public persone(String nom) {
	
	this.nom = nom;
}
public void greet() {
	System.out.println("hello there ");
}
@Override
public void showInfo() {
System.out.println("persone name issss : "+nom);	
}

}

