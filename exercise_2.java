
public class exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first=Double.parseDouble(args[0]),second=0.0;
        int i;
        // for loop to traverse the whole array
        for(i=1;i<args.length;i++)
        {
        	// checking if first value is less than the value in the array
            if(first<Double.parseDouble(args[i]))
            {
                second=first; // second value = first value
                first=Double.parseDouble(args[i]); // keeping array[i] value in first
            }
            // checking if second value is less than the value in the array
            else if(second<Double.parseDouble(args[i]))
            {
                second=Double.parseDouble(args[i]); // keeping array[i] value in second
            }
        }
        if(i==1) // if i = 1 it means we cannot define second largest value so print the below statement
            System.out.println("There is only one value entered");
        else   
        System.out.println("second largest value : "+second);

	}

}
