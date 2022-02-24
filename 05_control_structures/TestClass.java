
public class TestClass{
	private int[] array;
	
	public class TestIterator{
		//nested class
	}
	public TestClass()
	{
		
	}
	
	public TestClass(int[] a)
	{
		setArray(a);
		
	}


	public void setArray(int[] array) throws Error{
		this.array = array;
	}

	// bool hasNext();
	// <T> next();
	
}
