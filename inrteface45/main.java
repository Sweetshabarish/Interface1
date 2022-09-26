package inrteface45;

public class main implements engine,objects_of_csr {
public static void main(String[] args) {
	objects_of_csr.ac();
	objects_of_csr.wheels();
	main s=new main();
	s.start();
	
	s.acc();
	s.stop();
}

@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println("statrt the car");
	
}

@Override
public void stop() {
	// TODO Auto-generated method stub
	System.out.println("stop the car");
	
}

@Override
public void acc() {
	// TODO Auto-generated method stub
	System.out.println("accesc the car as per the use ");
	
}

}
