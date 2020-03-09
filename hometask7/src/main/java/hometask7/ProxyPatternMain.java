package hometask7;

public class ProxyPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("test_10mb.jpg");
	      image.display(); 
	      System.out.println("");
	      image.display(); 	
	}

}
