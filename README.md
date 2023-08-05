************************************ LECTURE->1 *********************************** *
 1. WHAT ARE PROGRAMMING LANGUAGE?
  #Programming languages are a set of commands, instructions, and syntax used to create software         programs.

 2.TYPES OF LANGUAGES?
  #Procedural Language: specifiy the series in well structured steps and procedures to compase a program  and it also conatin a systematic order of statements,function and command to complete a task.

  #Functional Language:writing a program in pure function ex.never modify variable,but only creates new ones as an output.and it is also used in situation where we hava to perform lots of diffrent operations on the same set of data.

  #OBJECT ORIENTED LANGUAGE:revolves around object.and it is called code+data=object and it also developed to make it easier to develop,debug ,reuse and maintain software.
  
3. STATIC VS DYNAMIC LANGUAGE:
 #static:it perform type checking at complie time,and error will show at compile time,declare datatype    before use it,an dit also a more control.

 #dynamic:it perform type checking at runtime,and error might not show till program is run.no neend to declare datatypes of variables,saves time in writing code but might give error at run time.

4.OBJECT AND REFRENCE VARIABLE:
#for ex.int a=10;a is refrenec variable and 10 is object.

5.GARBAGE COLLECTION:
 #Java is well-known for its garbage collection capabilities. The JVM (Java Virtual Machine) automatically  performs garbage collection for Java applications.
#Objects are created on the heap, and when they're no longer reachable from the root of the application (i.e., there are no references to the object), they're considered for garbage collection.
#The JVM uses a generational garbage collector, which means it separates the heap into regions (or generations) and uses different garbage collection strategies for each region.

***********************************LECTURE 2 **********************************************
6.HOW JAVA CODE EXECUTES:
# .java file -->.class file-->machine code
in .javafile compiler to .classfile  and class file code is byte code and then interperter classfile to machine code.
this code will not directely run on a system,we need jvm to run this.

7.WHY JAVA IS A PLATFORM INDEPENDENT:
#it means that byte code can run on all operating system.we neend to convert source code to machine code   so computer can understand.compiler helps doing this by timing it in executable code.this executable code is a set of instructionsfor the computer.after compiling c/c++ codewe get .exefile which is platform dependent.in java we get bytecode,jvm converts this to machine code.java is aplatforn independent but jvm is platform dpendent

8.JDK:
#provide environment to develop and run the javascript code.
it is the package that include:
 DVELOPMENT TOOLS:it provides an environment to develop your program.JRE:to execute your program.A COMPILER :javac,ARCHIVER:jar,DOES GENERTOR:javadoc,INTERPRETR/LOADER

9.JRE:
#it is an installation package that provide environment to only run the program.
it consists of :
  Deployment technologies,user interface kit,integration libraries,base libraries,jvm
    after we get the .class file then next thing haapen at runtime
1.class loader loads all clases need  to execute the program.
2.jvm sends code to byte code verify to check the format of code.

*************************************LECTURE 3 ***********************************************
1.DEFINE JAVA?
  #Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It was developed by Sun Microsystems (which is now owned by Oracle Corporation) and released in 1995. Java is intended to allow application developers to "write once, run anywhere" (WORA), which means that compiled Java code can run on all platforms that support Java without the need for recompilation.
2.DATA TYPES:
Data types are divided into two groups:
  #Primitive data types - includes byte, short, int, long, float, double, boolean and char.int rollno = 4;
      example:
      char letter='a';
      float marks =64.5f;
      double largeDecimalValue=876523456.876543;
      long largeInteger=98765436543L;
      boolean check=false;
  #Non-primitive data types - such as String, Arrays and Classes .
The main difference between primitive and non-primitive data types are:
    #Primitive types are predefined (already defined) in Java. Non-primitive types are created by        theprogrammer and is not defined by Java (except for String).
    #Non-primitive types can be used to call methods to perform certain operations, while primitive types  cannot.
    #A primitive type has always a value, while non-primitive types can be null.
    #A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

 3.LITERALS AND IDENTIFIERS:
   #Literals:a literal is a source code representation of a fixed value. They are essentially constants, which mean the values do not change.
  #Identifiers:an identifier is a name given to a variable, method, class, or any other user-defined item. It allows a programmer to refer to these items by name. 
  example: int a=10; //a is identifier and 10 is int literal.

4. TYPE CASTING:
#Type casting is when you assign a value of one primitive data type to another type.
 In Java, there are two types of casting:
   #Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double
    Widening casting is done automatically when passing a smaller size type to a larger size type:
     example: int myInt = 9;
              double myDouble = myInt;
              System.out.println(myDouble);   // Outputs 9.0
   #Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
    Narrowing casting must be done manually by placing the type in parentheses in front of the value
    example: double myDouble = 9.78d;
             int myInt = (int) myDouble;
              System.out.println(myInt);  // Outputs 9;
5.SYNTAX DEFINE IN JAVA:
#import java.util.Scanner;: This statement is used to import the Scanner class from the java.util package. Scanner is a class in the Java library used to read user input.

#public class input {...}: This defines a new class named MyClass. In Java, every application must contain a main class that wraps up all the program code.

#public static void main(String[] args) {...}: The main method is the entry point for any Java application. The Java Virtual Machine (JVM) calls the main method when the program starts. The main method must always be static so that JVM can call it without instantiating the class. The arguments (String[] args) are the command line arguments that you can pass when running the program.

#Scanner input = new Scanner(System.in);: This line creates a new Scanner object named input. The System.in parameter is used to take input from standard input (keyboard). The new keyword is used to allocate memory during runtime.

#System.out.println("Enter username");: This line is used to print the message "Enter username" on the console.

#String userName = input.nextLine();: This line of code is used to read the input given by user through keyboard. nextLine() is a method of Scanner class which is used to read a complete line as a string.

#System.out.println("Username is: " + userName);: This line is used to print the input received from the user.
#The close() method in Java, when used with a Scanner object, is used to close the Scanner object and free up any resources it is using. It's good practice to close resources like a Scanner when you're done using them to prevent resource leaks.
#int number = scanner.nextInt();: We're using the nextInt() method to get the next input from the user as an int. If the user inputs an integer, it will be stored in the number variable. If the user inputs something that isn't an integer, this will cause an InputMismatchException.*/