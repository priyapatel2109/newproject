import java.util.*;
public class ReverseParagraph
{
	public static void main(String args[])
	{
		//user input 
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Enter a paragraph : ");
		//String name= sc.nextLine();
		String name =  "This is a coding test. I like java so much. This is my day.";
	
		String[] para = name.split("\\.");
		
		for (int i = 0 ; i <= para.length -1; i++)
		{
			String result0 = "";
			result0 = para[i];
			
			String[] words = result0.split(" ");
	
			String result1 = "";
			for (int j = words.length - 3; j >= 0; j--)
			{
				result1 += (words[j] + " ");
			}
			System.out.print(result1.trim());
			String result2 = "";
	
			for (int k = words.length - 2; k <= words.length - 1 ; k++)
			{
				result2 +=	(" " + words[k]);
			}
			System.out.print(result2 + ". ");
			
		}

	}
}
