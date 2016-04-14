import java.util.ArrayList;

public class States {
	double hueristicfunction;
	String name;
	 ArrayList<States> children=new ArrayList<States>();
	 public ArrayList<String> getHeadTrack() {
		return HeadTrack;
	}
	public void setHeadTrack(ArrayList<String> headTrack) {
		HeadTrack = headTrack;
	}
	ArrayList<String> HeadTrack=new ArrayList<String>();
	 public double getHueristicfunction() {
		return hueristicfunction;
	}
	public void setHueristicfunction(double hueristicfunction) {
		this.hueristicfunction = hueristicfunction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<States> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<States> children) {
		this.children = children;
	}
	public ArrayList<String> getPossiblepaths() {
		return possiblepaths;
	}
	public void setPossiblepaths(ArrayList<String> possiblepaths) {
		this.possiblepaths = possiblepaths;
	}
	public ArrayList<Double> getPossiblepathvals() {
		return possiblepathvals;
	}
	public void setPossiblepathvals(ArrayList<Double> possiblepathvals) {
		this.possiblepathvals = possiblepathvals;
	}
	public int getVisitingFlag() {
		return VisitingFlag;
	}
	public void setVisitingFlag(int visitingFlag) {
		VisitingFlag = visitingFlag;
	}
	ArrayList<String>possiblepaths= new ArrayList<String>();
	 ArrayList<Double>possiblepathvals= new ArrayList<Double>();
	 int VisitingFlag;
	

}
