# q2-and-q3
in source folder there is q2 and q3
Quiz #2 - Repeated String Collector
Overview
This project implements a solution for Quiz #2 in the OOP course. The program identifies and collects all occurrences of strings that appear multiple times in a list.
Program Description
The ListComparer class in the oop.q2 package analyzes a list of strings and identifies repeated elements. The program:

Identifies which strings appear more than once in the input list
Collects ALL occurrences of these repeated strings into a result list
Maintains the original order of elements as they appear in the input list

Implementation Details
Classes and Methods

ListComparer: Main class implementing the required functionality

processLists(List<Integer> list1, List<String> list2): Processes the lists and returns all occurrences of repeated strings
main(String[] args): Demonstrates the functionality with sample data



Algorithm
The solution works in two distinct phases:

Identification Phase:

Calculate the frequency of each string in the input list
Create a set containing only the strings that appear multiple times


Collection Phase:

Iterate through the original list
For each element, check if it's in the set of repeated strings
If it is, add it to the result list



This approach ensures that the result list contains all occurrences of the repeated strings while maintaining their original order.
Sample Output
Using the predefined input list:
["apple", "banana", "cherry", "date", "fig", "grape", 
 "apple", "banana", "cherry", "date", "fig", "grape", 
 "kiwi", "lemon", "mango", "nectarine", "orange"]
The program produces the following output:
Result list: [apple, banana, cherry, date, fig, grape, apple, banana, cherry, date, fig, grape]
Running the Program
To run the program:

Ensure you have Java installed on your system
Navigate to the project directory in your terminal
Compile the Java file:
javac oop/q2/ListComparer.java

Run the compiled program:
java oop.q2.ListComparer


Code Documentation
The code includes comprehensive JavaDoc documentation that explains:

The purpose of each class and method
The algorithm used to identify and collect repeated strings
Parameter descriptions and return values
Special cases and edge conditions handled by the implementation
