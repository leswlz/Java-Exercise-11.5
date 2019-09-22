import java.util.Scanner;

public class CharacterStrings {
    public static void main(String args[]) 
    {
        String characterString;
        Scanner reader = new Scanner(System.in);
        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer 
{
	public String bigSmall(String characterString) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Do you want upper case or lower case? (upper/lower): ");
		String upper_lower = reader.nextLine();
		
		if (upper_lower.equals("upper")) 
		{
			String upper_case = characterString.toUpperCase();
			return upper_case;
		}
		
		if (upper_lower.equals("lower")) 
		{
			String lower_case = characterString.toLowerCase();
			return lower_case;
		} 
		
		else 
		{
			return characterString;
		}
	}
	
	public void reverseSpace(String characterString) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("How would you like the string to be printed? (reverse/separated): ");
		String reverse_separated = reader.nextLine();
		
		if (reverse_separated.equals("reverse")) 
		{
			String string = characterString; 
	        StringBuilder string_1 = new StringBuilder(); 
	        string_1.append(string);
	        string_1 = string_1.reverse();
	        System.out.print("\nHere is your character string: " + string_1); 
		} 
		
		if (reverse_separated.equals("separated")) 
		{
			String string = characterString; 
			char[] string_1 = string.toCharArray();
			System.out.print("\nHere is your character string: ");
			for(int i = 0; i < string_1.length; i++) 
			{
				System.out.print(string_1[i] + " ");			
			}
		}
	}
}