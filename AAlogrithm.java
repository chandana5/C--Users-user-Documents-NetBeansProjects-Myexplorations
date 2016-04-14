import java.util.ArrayList;

public class AAlogrithm {

	public static void NodePaths(States s,ArrayList<String>parentpathList,ArrayList<Double>parentpathListval,ArrayList<Double>functionList,ArrayList<String>functionListpath,ArrayList<Integer>VistingFlag,String MinPath,int count) {
		ArrayList<States>child=new ArrayList<States>();
		ArrayList<Double>	pathListval=new ArrayList<Double>();
		ArrayList<String> pathList=new ArrayList<String>();
		States S=new States();
		States B=new States();
		States C=new States();
		States D=new States();
		States E=new States();
		States G=new States();
		s.getHeadTrack().add(s.getName());

		if (s.getName().equals("S")) 
		{
			child=new ArrayList<States>();
			s.setHueristicfunction(8);
			child.add(B);
			B.setName("B");
			child.add(C);
			C.setName("C");
			child.add(D);
			D.setName("D");
		}

		if (s.getName().equals("B")) {
			child=new ArrayList<States>();
			s.setHueristicfunction(5);//To change value change here
			child.add(C);
			C.setName("C");
			child.add(D);
			D.setName("D");
			child.add(S);
			S.setName("S");
		}
		if (s.getName().equals("C")) {

			s.setHueristicfunction(2);
			child = new ArrayList<States>();		
			child.add(B);
			B.setName("B");
			child.add(D);
			D.setName("D");
			child.add(E);
			E.setName("E");
			child.add(G);
			G.setName("G");
			child.add(S);
			S.setName("S");

		}

		if (s.getName().equals("D")) {
			s.setHueristicfunction(3);
			child = new ArrayList<States>();
			child.add(B);
			B.setName("B");
			child.add(C);
			C.setName("C");
			child.add(E);
			E.setName("E");
			child.add(S);
			S.setName("S");

		}

		if (s.getName().equals("E")) {
			s.setHueristicfunction(1.5);
			child = new ArrayList<States>();
			child.add(C);
			C.setName("C");
			child.add(D);
			D.setName("D");
			child.add(G);
			G.setName("G");
		}
		if (s.getName() == "G") 
		{
			s.setHueristicfunction(0);
		}



		for (int i=0;i<s.HeadTrack.size();i++)
		{
			for(int j=0;j<child.size();j++)
			{

				if(s.HeadTrack.get(i).equals(child.get(j).getName())){

					child.remove(child.get(j));
				}
			}

		}



		s.setChildren(child);


		parentpathList.add(s.getHeadTrack().get(s.getHeadTrack().size()-1));
		StringBuilder parentstr=new StringBuilder() ;

		if(s.HeadTrack.size()==1)
		{
			parentstr.append(s.HeadTrack.get(0));


		}
		else
		{
			parentstr.append(MinPath);

		}
		s.setName(parentstr.substring(parentstr.length()-1));

		System.out.println("Steps "+count+" " );
		if(parentstr.length()==1)
		{
			System.out.println("Path: " +parentstr);

		}
		else{
			ArrayList<String> m=new ArrayList<String>();


			for(int i=0;i<parentstr.length()-1;i++)
			{
				if(parentstr.charAt(i)!=parentstr.charAt(i+1))
					m.add(parentstr.substring(i,i+1));	



			}

			m.add(parentstr.substring(parentstr.length()-1));
			System.out.print("Path");
			for(int i=0;i<m.size();i++){


				System.out.print(" "+m.get(i));

			}
		}
		System.out.println();
		count=count+1;
		System.out.print("ChildNodes:");
		for(int i=0;i<child.size();i++)
		{
			System.out.print(" "+ child.get(i).getName() +" ");
		}
		System.out.println();

		for(int i=0;i<child.size();i++){
			if(!s.getName().equals("S"))
				pathList.add(parentstr+s.getName()+child.get(i).getName());
			else
				pathList.add(parentstr+child.get(i).getName());	
		}

		addingRealFunction(s,pathList,pathListval,child,parentpathList,parentpathListval,functionList,functionListpath,VistingFlag, MinPath,count);

	}


	public static void addingRealFunction(States s, ArrayList<String>pathList,ArrayList<Double>pathListval,ArrayList<States>child,ArrayList<String>parentpathList, ArrayList<Double>parentpathListval,ArrayList<Double> functionList,ArrayList<String>functionListpath,ArrayList<Integer>VistingFlag,String MinPath,int count ){
		ArrayList<String>realfunction=new ArrayList<String>();
		ArrayList<Double>realfunctionvalues=new ArrayList<Double>();
		ArrayList<String>temppathList=new ArrayList<String>();
		ArrayList<Double>temppathListval=new ArrayList<Double>();

		Double Min=0.0;
		Double AnotherMin=0.0;
		for(int i=0;i<pathList.size();i++)
		{
			temppathList.add(pathList.get(i));
		}
		parentpathListval.add(s.getHueristicfunction());
		realfunction.add("SB");
		realfunction.add("SC");
		realfunction.add("SD");
		realfunction.add("BC");
		realfunction.add("BD");
		realfunction.add("BS");
		realfunction.add("CB");
		realfunction.add("CD");
		realfunction.add("CE");
		realfunction.add("CG");
		realfunction.add("DB");
		realfunction.add("DC");
		realfunction.add("DE");
		realfunction.add("DS");
		realfunction.add("EC");
		realfunction.add("ED");
		realfunctionvalues.add(2.0);
		realfunctionvalues.add(8.0);
		realfunctionvalues.add(5.0);
		realfunctionvalues.add(4.0);
		realfunctionvalues.add(2.0);
		realfunctionvalues.add(2.0);
		realfunctionvalues.add(4.0);
		realfunctionvalues.add(1.0);
		realfunctionvalues.add(2.0);
		realfunctionvalues.add(5.0);
		realfunctionvalues.add(2.0);
		realfunctionvalues.add(1.0);
		realfunctionvalues.add(4.0);
		realfunctionvalues.add(5.0);
		realfunctionvalues.add(2.0);



		for(int j=0;j<temppathList.size();j++)
		{
			for(int m=0;m<realfunction.size();m++ )
			{
				if(temppathList.get(j).equals(realfunction.get(m)) && !(temppathList.get(j).length()>2))
				{

					AnotherMin=realfunctionvalues.get(m);

					temppathListval.add(j,AnotherMin);
				}
			}
		}

		for(int j=0;j<temppathList.size();j++)
		{	
			if(temppathList.get(j).length()>2 )
			{
				for(int m=0;m<realfunction.size() ;m++ )
				{
					for(int k=0;k<temppathList.get(j).length() && k!=temppathList.get(j).length();k=k+2)
					{
						if(temppathList.get(j).substring(k,k+2).equals(realfunction.get(m)))
						{try{
							Min=Min+realfunctionvalues.get(m);

						}
						catch(Exception e){
							System.out.println();

						}
						}
					}
				}

				temppathListval.add(j,Min);
				Min=0.0;


			}

		}
		AnotherMin=0.0;

		calculateFuction(s,pathList,temppathListval,parentpathList,parentpathListval,functionList,functionListpath,VistingFlag, MinPath,count);
	}


	public static void calculateFuction(States s,ArrayList<String> pathList,ArrayList<Double> pathListval,ArrayList<String> parentpathList,ArrayList<Double>parentpathListval,ArrayList<Double> functionList,ArrayList<String> functionListpath,ArrayList<Integer>VistingFlag,String MinPath,int count ) {
		ArrayList<Double>TempChild=new ArrayList<Double>();


		for (int i = 0; i < pathListval.size(); i++) {

			if(s.children.get(i).getName().equals("B"))
			{
				s.children.get(i).setHueristicfunction(5);//To change value change here
			}
			else if(s.children.get(i).getName().equals("C"))
			{
				s.children.get(i).setHueristicfunction(2);
			}
			else if(s.children.get(i).getName().equals("D"))
			{
				s.children.get(i).setHueristicfunction(3);
			}
			else if(s.children.get(i).getName().equals("E"))
			{
				s.children.get(i).setHueristicfunction(1.5);
			}
			else if(s.children.get(i).getName().equals("G"))
			{
				s.children.get(i).setHueristicfunction(0);
			}
			TempChild.add(pathListval.get(i)+s.children.get(i).getHueristicfunction());

		}
		for(int i=0;i<TempChild.size();i++)
		{
			pathListval.set(i,TempChild.get(i));
		}
		for(int i=0;i<pathListval.size();i++)
		{
			functionList.add(pathListval.get(i));
		}
		for(int i=0;i<pathList.size();i++)
		{
			functionListpath.add(pathList.get(i));
		}

		findingMinimum(s,functionList,functionListpath, pathList,pathListval, parentpathList,parentpathListval,VistingFlag, MinPath,count);
	}



	public static void findingMinimum(States s,ArrayList<Double> functionList,ArrayList<String>functionListpath,
			ArrayList<String> pathList,ArrayList<Double>pathListval, ArrayList<String>parentpathList,ArrayList<Double>parentpathListval,ArrayList<Integer>VistingFlag,String MinPath,int count) {
		Double temp;
		String temporary;
		ArrayList<String>pathList2=new ArrayList<String>();
		ArrayList<Double>pathListval2=new ArrayList<Double>();

		for(int i=0;i<functionListpath.size();i++)
		{
			if(VistingFlag.size()!=functionListpath.size())
			{
				VistingFlag.add(0);

			}
			if(VistingFlag.size()!=0 && VistingFlag.get(i)!=1 )
			{
				pathList2.add(functionListpath.get(i));

			}
		}
		for(int i=0;i<functionList.size();i++)
		{ 

			if(VistingFlag.get(i)!=1)
			{
				pathListval2.add(functionList.get(i));
			}

		}
		for (int i = 0; i < pathListval2.size(); i++) {
			for (int j = i + 1; j < pathListval2.size(); j++) {
				if (pathListval2.get(i) > pathListval2.get(j)) {
					temp = pathListval2.get(i);
					temporary = pathList2.get(i);
					pathListval2.set(i, pathListval2.get(j)); 
					pathList2.set(i, pathList2.get(j));
					pathListval2.set(j, temp);
					pathList2.set(j, temporary);

				}
			}

		}
		System.out.println("function value for the above child Nodes:");
		for(int i=0;i<pathList.size();i++)
		{
			
			System.out.print(pathList2.get(i)+": "+ pathListval2.get(i)+ " ");
			
		}
		
		
		MinPath=pathList2.get(0);

		System.out.println();
		System.out.println("Choosing min value out of it " +pathListval2.get(0));
		System.out.println("Choosing min Node " +pathList2.get(0).substring(pathList2.get(0).length()-1));
		
		String NextMinPath=pathList2.get(1);



		if(MinPath.length()<NextMinPath.length() )
		{
			s.setHeadTrack(new ArrayList<String>());


			for(int i=0;i<MinPath.length()-1 && !pathList2.get(0).equals("G");i++)
			{
				s.getHeadTrack().add(MinPath.substring(i,i+1));		



			}
		}
		else
		{
			for(int i=0;i<MinPath.length()-1 && !pathList2.get(0).equals("G");i++)
			{
				s.getHeadTrack().add(MinPath.substring(i,i+1));		



			}



		}


		for(int i=0;i<functionListpath.size();i++)
		{
			if(MinPath.equals(functionListpath.get(i)))
			{
				VistingFlag.set(i,1);
			}
		}

		s.setName(MinPath.substring(MinPath.length()-1));

		if(!pathList2.get(0).substring(pathList2.get(0).length()-1).equals("G"))
		{


			NodePaths(s,parentpathList,parentpathListval,functionList,functionListpath,VistingFlag,MinPath,count);
		}
		else if(pathList2.get(0).substring(pathList2.get(0).length()-1).equals("G"))
		{
			ArrayList<String> m=new ArrayList<String>();


			for(int i=0;i<MinPath.length()-1;i++)
			{
				if(MinPath.charAt(i)!=MinPath.charAt(i+1))
					m.add(MinPath.substring(i,i+1));	

			}
			m.add(MinPath.substring(MinPath.length()-1));
			System.out.print(" Final Path"+ " ");
			for(int i=0;i<m.size();i++){
				System.out.print(" "+m.get(i));

			}
		}
	}

	public static void main(String args[]) {
		States s = new States();
		ArrayList<Double> functionList = new ArrayList<Double>();
		ArrayList<String> functionListpath = new ArrayList<String>();
		ArrayList<String>parentpathList=new ArrayList<String>();
		ArrayList<Double>parentpathListval=new ArrayList<Double>();
		ArrayList<Integer>VistingFlag=new ArrayList<Integer>();
		String MinPath=new String("");
		s.setName("S");
		int count=0;
		NodePaths(s,parentpathList,parentpathListval,functionList,functionListpath,VistingFlag,MinPath,count);

	}
}