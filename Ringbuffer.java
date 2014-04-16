import java.util.ArrayList;

class Ringbuffer {
	ArrayList<Double> buffer;
	int capacity;
	int start = 0;
	int end = 0;
	
	public Ringbuffer(int num)
	{
		buffer = new ArrayList<Double>();
		capacity = num;
	}
	
	public void enQueue(double n)
	{
		if(buffer.size() < capacity){
			buffer.add(n);
//		System.out.println(buffer.get(n));
			return;
		}
		else{
			buffer.set(end, n);
			end += 1;
			if(end >= capacity)
				end = 0;
		}
	}
	
	public Double deQueue()
	{
		if(isQEmpty())
		{System.out.println("Nothing in buffer");
		return (double) 0;
		}
		Double temp = buffer.get(start);
		buffer.set(start,(double) -10);
		start += 1;
		if (start >= capacity)
			start = 0;
		if(temp == (double) -10)
			throw(new NullPointerException("Deleted value"));
		return temp;
	}
	
	public void listQueue()
	{
		for (int i = 0; i < buffer.size(); i++){
			System.out.println((i+1) + ". " + buffer.get(i));
		}
	}
	
	public boolean isQEmpty()
	{
		if(buffer.size() == 0)
			return true;
//		System.out.println(buffer.size());
		return false;
	}
	
	public Double peek()
	{
		try{
			if(buffer.get(start) != (double) -10)
				return buffer.get(start);
			return (double) 0;
		}
		catch(ArrayIndexOutOfBoundsException err){
			return (double) 0;
		}
	}

}
