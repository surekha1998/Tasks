public class Replacedoubletosinglespace
 {

	public static void main(String[] args) {
		String s="I  am Learning  java";
		char c[]=s.toCharArray();
		String x="";
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]==' ' && c[i+1]==' ')
			{
		
			}
			
			else {
				x=x+c[i];
			}
			
		} 
		x=x+c[c.length-1];
		System.out.println(x);

	}


}
