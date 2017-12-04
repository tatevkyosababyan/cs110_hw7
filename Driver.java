import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;

public class Driver {

	public static void main (String[] args) {
	Puppy one = new Puppy("Joey");
	Puppy two = new Puppy("Chandler");
	Puppy three = new Puppy("Ross");

	System.out.println(one.getAnun());
	System.out.println(two.getAnun());
	System.out.println(three.getAnun());

	int[] slaq = {9, 20, 3, 44, 88, 300};
	ArrayUtils.reverse(slaq);
	System.out.println(ArrayUtils.stringifyArray(slaq));

	double brtuj = 15.4;
	System.out.println(Math.factorial((int)brtuj));
}
}