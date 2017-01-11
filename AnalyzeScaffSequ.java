import java.util.*;

public class AnalyzeScaffSequ 
{
	private static char[] bases = {'A','C','G','T'};
	private int letter_frequencies[];
	private String sequ;
	
	public AnalyzeScaffSequ(String sequ)
	{
		this.sequ=sequ;
		letter_frequencies=new int[4];
		int length = sequ.length();
		for(int i=0;i<length;i++)
		{
			switch(sequ.charAt(i))
			{
				case 'A':
					letter_frequencies[0]+=1;
					break;
				case 'C':
					letter_frequencies[1]+=1;
					break;
				case 'G':
					letter_frequencies[2]+=1;
					break;
				case 'T':
					letter_frequencies[3]+=1;
					break;
			}
		}
	}
	
	public void PrintLetterFrequencies()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("frequency of: ");
			System.out.println(bases[i]);
			System.out.println(letter_frequencies[i]);
		}
	}
	
	public static void main(String[] args)
	{
		String scaff_sequ = new String("ACTCTCCAGCAATCGCCCTAAATCAGTC");
		AnalyzeScaffSequ anscas = new AnalyzeScaffSequ(scaff_sequ);
		anscas.PrintLetterFrequencies();
	}
}
