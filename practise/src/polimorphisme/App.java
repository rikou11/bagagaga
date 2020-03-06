package polimorphisme;

public class App {

	public static void main(String[] args) {
planet p1=new planet();
tree t1=new tree();
planet p2=t1;
planet p3=p1;
p1.grow();
t1.grow();
p2.grow();
p3.grow();
//mat9derch dir tree t2 = p1; t2.grow(); // prsq rahi class fils
/* par expl 3nd autre methodes f tree w habin za3ma n3aytolhom b p2 wela p3 chhouf wsh yesra*/
p2.teste();
p3.teste();

	}

}
