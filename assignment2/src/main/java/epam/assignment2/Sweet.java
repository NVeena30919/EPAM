package epam.assignment2;

public class Sweet extends Gift
{
	public int total_weight(int[] sweets,int n)
	{
		int tot=0;
		for(int i=0;i<n;i++)
		{
			tot+=sweets[i];
		}
		return tot;
	}
	public int num_of_candy(int low,int high,int[] sweets,int c)
	{
		int cou=0;
		for(int i=0;i<c;i++)
		{
			if(sweets[i]>=low && sweets[i]<=high)
				cou++;
		}
		return cou;
	}

}