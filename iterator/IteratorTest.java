package iterator;

public class IteratorTest {
	public static void main(String [] args) {
		CreateAggregate createAggregate = new CreateAggregate();
		
		for(Iterator iter = createAggregate.getIterator(); iter.hasNext();) {
			String words = (String)iter.next();
			System.out.println(words);
		}
	}

}
