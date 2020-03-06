package p1;

public class machine implements info {
	 private int id = 7;
	    
	    public void start() {
	        System.out.println("Machine started.");
	    }

		@Override
		public void showInfo() {
			System.out.println("machine id :"+id);
		}
}
