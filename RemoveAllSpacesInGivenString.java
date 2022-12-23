public class RemoveAllSpacesInGivenString
{
public static void main(String[] args)
{	
String s="India is my country";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
 {
	if(c[i]!=' ')
	{
		System.out.print(c[i]);
    }
 }
}
}
