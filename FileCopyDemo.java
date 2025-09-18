import java.io.*;
class FileCopyDemo {
public static void main(String[] args) throws IOException
{
// Open file1.txt for reading
FileInputStream fin = new FileInputStream(“D:/file1.txt");
// Open file2.txt for writing
FileOutputStream fout = new FileOutputStream(“D:/file2.txt");
int data;
// Read and write one byte at a time
while ((data = fin.read()) != -1) {
fout.write(data);
}
System.out.println("File copied successfully.");
// Close both streams
fin.close();
fout.close();
}
}