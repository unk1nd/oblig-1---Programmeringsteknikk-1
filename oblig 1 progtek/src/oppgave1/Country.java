package oppgave1;

public class Country implements Comparable {
	
	String landnavn;
	int innby;
	
	public int compareTo (Object other) 
	{
		int innbyg = ((Country) other).getinnby();  
	    return this.innby - innbyg; 
	}
	
	public int getinnby()
	{
		return innby;
	}
	
	public Country (String land, int innbygere)
	   {
	      innby = innbygere;
	      landnavn = land;
	      
	   }

	public String toString()
	{
		return (innby + "\t|  " + landnavn);
	}
}
