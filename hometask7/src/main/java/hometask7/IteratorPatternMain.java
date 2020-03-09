package hometask7;

public class IteratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewRepository namesRepository = new NewRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	}

}
