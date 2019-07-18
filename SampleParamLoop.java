class SampleParamLoop

{
	
public static void main (String[] args)
{
	
	int i = Integer.parseInt(args[0]);

	System.out.println("The length of parameter is " + args.length);

	
}

	for( i; i < args.length; i++)
	{
		System.out.println("The value is :" + i);

	}

	


}