package one;

public class People {
	 private static String name;
	 private String address;
	 private String year;
	 

	 public People(String name, String address, String year) {
		 People.name = name;
		 this.address = address;
		 this.address = year;
		 }
	 
	 public  static String getName() {
		 return name;
		 }
	 public String getAddress() {
		 return address;
		 }
	 public String getyear() {
		 return year;
		 }
	 
	 public String toString() {
		 return name + "(" + address + ")" + this.year;
		 }
}
