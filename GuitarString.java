import java.util.Random;

public class GuitarString {
int numofsamples = 0;
int max;
Ringbuffer buffer;

public GuitarString(double frequency){
	max = (int)(44100/frequency);
	buffer = new Ringbuffer(max);
	pluck();
	}

public GuitarString(double[] values){
	max = values.length;
	buffer = new Ringbuffer(max);
	for(int i = 0; i < max; i++){
		buffer.enQueue(values[i]);
	}
	}

public void pluck(){
	Random random = new Random(123456);
	for(int i = 0; i < max; i++){
		buffer.enQueue(random.nextDouble() - .5);
	}
}

public void tic(){
	buffer.enQueue(.995*(.5*(buffer.deQueue() + buffer.peek())));
	numofsamples ++;
}

public double sample(){
	return buffer.peek();
//	System.out.println(buffer.peek());
}

public int time(){
	return numofsamples;
}

}
