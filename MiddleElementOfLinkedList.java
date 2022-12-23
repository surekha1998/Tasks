import java.util.LinkedList;
public class MiddleElementOfLinkedList
{
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	System.out.println(l);
	if(l.size()%2==0)
	{
	//even logic
		System.out.println(" Mid element in a LinkedList is :" +l.get(l.size()/2-1) + " " +l.get(l.size()/2));
	}
	else
	{
		//odd logic
		System.out.println(" Mid element in a LinkedList is :"+l.get(l.size()/2));
	}
    }

}
