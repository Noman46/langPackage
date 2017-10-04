// public String toString() method
// It is used to present an object into a String 

class Student
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		
		System.out.println(s.toString());    /* tHis is the enternal repesentation of toString() method, 
		                                           JVM takes care of the method if we dont use it explicitly */
		System.out.println(s);              // this represents the String presentation of the Student object
	}
}
