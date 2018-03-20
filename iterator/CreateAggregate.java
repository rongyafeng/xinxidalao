package iterator;
import java.util.Vector; 

public class CreateAggregate implements Aggregate {
	public String words[] = {"hello","word","cxue"};
	//Vector<String> words;

	@Override
	public Iterator getIterator() {
		return new CreateIterator();
	}
	
	
	
private class CreateIterator implements Iterator{
	int nums;

	@Override
	public boolean hasNext() {
		if(nums < words.length) {
			return true;
		}
		return false;
	}
	
	@Override
	public Object next() {
		if(this.hasNext()) {
			
			return words[nums++];
		}
		return null;
	}
	
}

}
