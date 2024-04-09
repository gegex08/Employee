
package employee;
/****************************************************
 * Programmer: Geneiva Ocampo
 * 
 * Course CSCI 1471
 * 
 * Date 04/10/2024
 * 
 * Assignment: Homework #8: Problem 1
 * 
 * Environment Java with Netbeans
 * 
 * Files Included: Employee & Employee Test
 * 
 * Purpose: Add my name to program
 * 
 * Input: Employee e3 = new Employee( "Geneiva", "Ocampo" );
 * 
 * Preconditions/ Assumptions: Must use same methods
 * 
 * Equations: N/A
 * 
 * Output: Employee constructor: Geneiva Ocampo; count = 3
 * 
 * Postconditions/Assumptions: Methods stay the same
 * 
 * Contraints:
 * 
 * Algorithm: 
 * Prompt User to enter a number 
 * Calculate number to match letter grade
 * Output letter grade
 ****************************************************/
public class Employee
{
private String firstName;
private String lastName;
private static int count = 0; // number of Employees created
// initialize Employee, add 1 to static count and
// output String indicating that constructor was called
public Employee( String first, String last )
{
firstName = first;
lastName = last;
++count; // increment static count of employees
System.out.printf( "Employee constructor: %s %s; count = %d\n",
firstName, lastName, count );
} // end Employee constructor
// get first name
public String getFirstName()
{
return firstName;
} // end method getFirstName
// get last name
public String getLastName()
{
return lastName;
} // end method getLastName
// static method to get static count value
public static int getCount()
{
return count;
} // end method getCount
} // end class Employee
