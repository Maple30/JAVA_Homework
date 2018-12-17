
public class Student {
	//7個instance
	private int quiz1;		//save quiz1's grade
	private int quiz2;		//save quiz2's grade
	private int quiz3;		//save quiz3's grade
	private int Midexam;	//save Midexam's grade
	private int Finalexam;	//save Finalexam's grade
	private int Totalgrade;	//save Totalgrade's grade
	private char FinalLetter;//save FinalLetter's grade
	
	
	
	//兩種建構方式
	public Student() {
		quiz1 = -1;
		quiz2 = -1;
		quiz3 = -1;
		Midexam = -1;
		Finalexam = -1;
		Totalgrade = -1;
		FinalLetter = 'N';
		
	}
	public Student(int quiz1, int quiz2, int quiz3, int Midexam, int Finalexam) {
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.Midexam = Midexam;
		this.Finalexam = Finalexam;
	}
	
	public String Computeletter() {
		if(Totalgrade < 60) {
			FinalLetter = 'F';
			return "F";
		}else if(Totalgrade >= 60 && Totalgrade < 70) {
			FinalLetter = 'D';
			return "D";
		}else if(Totalgrade >= 70 && Totalgrade < 80) {
			FinalLetter = 'C';
			return "C";
		}else if(Totalgrade >= 80 && Totalgrade < 90) {
			FinalLetter = 'B';
			return "B";
		}else if(Totalgrade >= 90 && Totalgrade <= 100) {
			FinalLetter = 'A';
			return "A";
		}
		return "No This Score";
	}
	
	public int Computeoverall() {
		Totalgrade = (int)((quiz1+quiz2+quiz3)*10*0.25 + Midexam*0.35 + Finalexam*0.4);
		return Totalgrade;
	}
	
	public void setq1(int quiz1) {
		if(quiz1<=100 && quiz1 >= 0)
			this.quiz1 = quiz1;
	}
	
	public void setq2(int quiz2) {
		if(quiz2 <= 100 && quiz2 >= 0)	
			this.quiz2 = quiz2;
	}
	
	public void setq3(int quiz3) {
		if(quiz3 <= 100 && quiz3 >= 0)
			this.quiz3 = quiz3;
	}
	
	public void setMid(int Midexam) {
		if(Midexam <= 100 && Midexam >= 0)
			this.Midexam = Midexam;
	}
	
	public void setFinal(int Finalexam) {
		if(Finalexam <= 100 && Finalexam >= 0)
			this.Finalexam = Finalexam;
	}
	
	public void setall(int quiz1, int quiz2, int quiz3, int Midexam, int Finalexam) {
		if(quiz1 <= 100 && quiz1 >=0 && quiz2 <= 100 && quiz2 >=0 && quiz3 <= 100 && quiz3 >= 0 && Midexam <= 100 && Midexam >= 0 && Finalexam <= 100 && Finalexam >= 0)
			this.quiz1 = quiz1;
			this.quiz2 = quiz2;
			this.quiz3 = quiz3;
			this.Midexam = Midexam;
			this.Finalexam = Finalexam;
	}
	
	public int getq1() {
		return this.quiz1;
	}
	
	public int getq2() {
		return this.quiz2;
	}
	
	public int getq3() {
		return this.quiz3;
	}
	
	public int getMidexam() {
		return this.Midexam;
	}
	
	public int getFinalexam() {
		return this.Finalexam;
	}
	
	public char getletter() {
		return this.FinalLetter;
	}
	
	public int getoverall() {
		return this.Totalgrade;
	}
	public boolean equals(int quiz1, int quiz2, int quiz3, int Midexam, int Finalexam) {
		if(this.quiz1 == quiz1 && this.quiz2 == quiz2 && this.quiz3 == quiz3 && this.Midexam == Midexam && this.Finalexam == Finalexam) {
			return true;
		} else {
			return false;
		}
	}
	
	public String tostring() {
		return "quiz1 = " + quiz1 + "\nquiz2 = " + quiz2 + "\nquiz3 = " + quiz3 + "\nMidexam = " + Midexam + "\nFianlexam = " + Finalexam;
	}
}
