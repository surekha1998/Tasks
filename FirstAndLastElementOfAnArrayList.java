import java.util.ArrayList;

public class FirstAndLastElementOfAnArrayList
 {
	public static void main(String[] args)
 {
		
	ArrayList<Integer> a=new ArrayList<>();
	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	System.out.println("Elements in an ArrayList " +a);
	int first=a.get(0);
	int last=a.get(a.size()-1);
	System.out.println("First Element: " +first);
	System.out.println("Last Element: " +last);
}
}
