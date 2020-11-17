import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {

static ArrayList<Person> people;
static String filename;
static FileReader myFile;

public static void main(String[] args) {

people = new ArrayList<Person>();
filename = "data.txt";
String name = "", age = "", color = "";
try {
myFile = new FileReader(filename);
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()) {
name = reader.readLine();
age = reader.readLine();
color = reader.readLine();
System.out.println(name + "\t" + age + "\t" + color);


}
reader.close();
} catch (IOException exception) {
System.out.println("An error occurred: " + exception);
}

System.out.printf("%-10s %-10s %-10s %-n", name, age, color);

//initializing FileWriter 
FileWriter toWriteFile; 
try
{ 
toWriteFile = new FileWriter("test.txt"); 
// Initialing BufferedWriter 
BufferedWriter output = new BufferedWriter(toWriteFile); 

output.write("Testing");
output.newLine();
output.write(Integer.toString(10));
output.newLine();

output.flush();

// Closing BufferWriter to end operation 
output.close(); 
} 
catch (IOException excpt) 
{ 
excpt.printStackTrace(); 
} 
}
}

