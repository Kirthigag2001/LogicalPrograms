package JavaProgramsTasks;

//WAJP to store employee object in a collection
import java.util.ArrayList;

public class Question29 {
	String name;
	int id;
	double sal;

    public Question29(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Question29("Kirthiga",1,100000));
		a.add(new Question29("Lavanya",2,50000));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
