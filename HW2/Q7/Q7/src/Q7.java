
public class Q7 {

	public static void main(String[] args) {
		//use constructor reset
		Temperature record1 = new Temperature();
		Temperature record2 = new Temperature(0);
		Temperature record3 = new Temperature('C');
		Temperature record4 = new Temperature(0,'F');
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
		record1.setall(0, 'C');
		record2.setall(-40, 'C');
		record3.setall(100, 'C');
		//print to check
		System.out.println(record1.getemperatureC() + "C = " + record1.getemperatureF() + "F");
		System.out.println(record2.getemperatureC() + "C = " + record2.getemperatureF() + "F");
		System.out.println(record3.getemperatureC() + "C = " + record3.getemperatureF() + "F");
	}

}
