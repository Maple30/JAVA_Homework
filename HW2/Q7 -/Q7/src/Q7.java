
public class Q7 {

	public static void main(String[] args) {
		//use constructor reset
		Temperature record1 = new Temperature();
		Temperature record2 = new Temperature(0);
		Temperature record3 = new Temperature('C');
		Temperature record4 = new Temperature(0,'F');
		
		Temperature record5 = new Temperature(-40, 'F');
		Temperature record6 = new Temperature(212, 'F');
		Temperature record7 = new Temperature(100, 'F');
		Temperature record8 = new Temperature(100, 'F');
		//print to check
		System.out.println(record1.tostring());
		System.out.println(record2.tostring());
		System.out.println(record3.tostring());
		System.out.println(record4.tostring() + "\n");
		
		//test mutator methods
		record1.setall(10, 'F');
		record2.setScale('F');
		record4.setValue(10);
		//print to check
		System.out.println(record1.tostring());
		System.out.println(record2.tostring());
		System.out.println(record3.tostring());
		System.out.println(record4.tostring() + "\n");
		//test comparison methods
		if(record1.equals(record4)) {
			System.out.println("record1 is equals to record4");
			System.out.println(record1.tostring());
			System.out.println(record4.tostring() + "\n");
		}else {
			System.out.println("record1 is not equals to record4" + "\n");
		}
		//test comparison methods
		if(record1.greater(record2)) {
			System.out.println("record1 is greater than record2" );
			System.out.println(record1.tostring());
			System.out.println(record2.tostring() + "\n");
		}else {
			System.out.println("record1 is not greater than record2" );
			System.out.println(record1.tostring());
			System.out.println(record2.toString() + "\n");
		}
		//test comparison methods
		if(record1.less(record2)) {
			System.out.println("record1 is less than record2" );
			System.out.println(record1.tostring());
			System.out.println(record2.tostring() + "\n");
		}else {
			System.out.println("record1 is not less than record2" );
			System.out.println(record1.tostring());
			System.out.println(record2.tostring() + "\n");
		}
		//test 題目的要求
		record1.setall(-40, 'C');
		record2.setall(100, 'C');
		record3.setall(-30, 'C');
		record4.setall(50, 'C');
		//print to check
		System.out.println(record1.getemperatureC() + "C = " + record1.getemperatureF() + "F");
		System.out.println(record2.getemperatureC() + "C = " + record2.getemperatureF() + "F");
		System.out.println(record3.getemperatureC() + "C = " + record3.getemperatureF() + "F\n\n\n\n");
		
		if(record1.less(record5)) {
			System.out.println(record1.tostring() + " < " +record5.tostring());
			
		}else if(record1.greater(record5)){
			System.out.println(record1.tostring() + " > " +record5.tostring());
			
		}else if(record1.equals(record5)) {
			System.out.println(record1.tostring() + " = " +record5.tostring());
		}
		
		if(record2.less(record6)) {
			System.out.println(record2.tostring() + " < " +record6.tostring());
			
		}else if(record2.greater(record6)){
			System.out.println(record2.tostring() + " > " +record6.tostring());
			
		}else if(record2.equals(record6)) {
			System.out.println(record2.tostring() + " = " +record6.tostring());
		}
	
		
		if(record3.less(record7)) {
			System.out.println(record3.tostring() + " < " +record7.tostring());
			
		}else if(record3.greater(record7)){
			System.out.println(record1.tostring() + " > " +record7.tostring());
			
		}else if(record3.equals(record7)) {
			System.out.println(record3.tostring() + " = " +record7.tostring());
		}
		
		if(record4.less(record8)) {
			System.out.println(record4.tostring() + " < " +record8.tostring());
			
		}else if(record4.greater(record8)){
			System.out.println(record4.tostring() + " > " +record8.tostring());
			
		}else if(record4.equals(record8)) {
			System.out.println(record4.tostring() + " = " +record8.tostring());
		}
	}

}
