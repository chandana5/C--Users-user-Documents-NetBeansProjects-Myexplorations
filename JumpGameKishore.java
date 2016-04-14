
public class JumpGameKishore {
	
	  public static void main(String[] args){
	  
	  int array[] = {3,3,1,8,0};
	  final int LENGTH  = array.length;
	  boolean result = false;
	  
	  for (int i = 0; i < LENGTH; i++){
	    System.out.println("element :"+(i+1));
	    System.out.print("j :");
	    for (int j = i; j < LENGTH; j = j+array[j]){
	      System.out.print((j+1)+" ");
	      if (j >= LENGTH-1) result = true;
	      if (array[j] == 0) break;
	      
	    }
	    System.out.println("");
	    if (result != true) break; 
	   
	  }
	  System.out.println("Result : "+result);
	  
	  }
	}


