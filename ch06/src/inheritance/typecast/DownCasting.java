package inheritance.typecast;

public class DownCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;
		//Faculty f1 = (Faculty) she;
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456);
		//staff s = p;
		Staff s= (Staff) p;
		s.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.println(s.division);
	}
}
