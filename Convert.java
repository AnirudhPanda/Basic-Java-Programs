public class Convert
{
	public static void main(String[] args) {
		int s=150;
		int h = s/3600;
		int m = s/60;
		int sec= s%60;
		System.out.println(h + " Hours " + m +" Mins " + sec + " Secs ");
	}
}