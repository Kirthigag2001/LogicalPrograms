package JavaProgramsTasks;

//WAJP to store student object with attributes name, id in an array
public class Question28 {
	String name;
	int id;
	public Question28(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "student name:"+this.name+" "+"student id:"+this.id;
		}
	public static void main(String[] args) {
		Question28 stu[]= {new Question28("Kirthi",1),new Question28("lavanya", 2), new Question28("Sowmi",2)};
        for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
}
