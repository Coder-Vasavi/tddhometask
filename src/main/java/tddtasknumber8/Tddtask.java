package tddtasknumber8;
public class Tddtask
{
	public String update_string(String str)
	{
		String str1="";
		int strlen=str.length();
		if(strlen==0)
		{
			str1="";
		}
		else if(strlen>0)
		{
			if(strlen==1)
			{
				if(str.charAt(0)!='A')
					str1+=str.charAt(0);
			}
			if(strlen>=2)
			{
				if(str.charAt(0)!='A')
					str1+=str.charAt(0);
				if(str.charAt(1)!='A')
					str1+=str.charAt(1);
				if(strlen>2)
				{
					String str2=str.substring(2,strlen);
					str1+=str2;
				}

			}
		}      

		return str1;
	}
}
