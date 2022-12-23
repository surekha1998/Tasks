import java.util.ArrayList;

public class ElementPresentIn3rdIndexInarrayList
{
	public void thirdposition()
    {
    ArrayList<Integer> al=new ArrayList<>();
      {
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(3);
        System.out.println("Elements in an Arraylist :"+ al);
        System.out.println("Elements in the 3rd position  :"+ al.get(2));
      }
    }
public static void main(String args[])
  {
	ElementPresentIn3rdIndexInarrayList a=new ElementPresentIn3rdIndexInarrayList();
	a.thirdposition();
  }
}
