import java.util.Scanner;
public class students {
Scanner input = new Scanner(System.in);
student theStudents[] = new student[50];
public static int count = 0;
// Method to add a student
public void addStudent(student s) {
for (int i = 0; i < count; i++) {
if (s.regNum.equalsIgnoreCase(theStudents[i].regNum)) {
System.out.println("Student with Reg Num " + s.regNum + " is
Already Registered.");
return;
}
}
if (count < 50) {
theStudents[count] = s;
count++;
}
}
// Method to display all students
public void showAllStudents() {
System.out.println("Student Name\t\tReg Number");
for (int i = 0; i < count; i++) {
System.out.println(theStudents[i].studentName + "\t\t" +
theStudents[i].regNum);
}
}
// Method to check if a student is registered
public int isStudent() {
System.out.println("Enter Reg Number:");
String regNum = input.nextLine();
for (int i = 0; i < count; i++) {
if (theStudents[i].regNum.equalsIgnoreCase(regNum)) {
return i;
}
}
System.out.println("Student is not Registered. Get Registered First.");
return -1;
}
// Method to check out a book
public void checkOutBook(books book) {
int studentIndex = this.isStudent();
if (studentIndex != -1) {
System.out.println("Checking out");
book.showAllBooks();
if (theStudents[studentIndex].booksCount < 3) { // Check if student
can borrow more books
book b = book.checkOutBook();
System.out.println("Checking out");
if (b != null) {
System.out.println("Adding book");
theStudents[studentIndex].borrowedBooks[theStudents[studentIn
dex].booksCount] = b;
theStudents[studentIndex].booksCount++;
return;
}
System.out.println("Book is not Available.");
} else {
System.out.println("Student cannot borrow more than 3 books.");
}
}
}
// Method to check in a book
public void checkInBook(books book) {
int studentIndex = this.isStudent();
if (studentIndex != -1) {
System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
student s = theStudents[studentIndex];
for (int i = 0; i < s.booksCount; i++) {
if (s.borrowedBooks[i] != null) { // Check if borrowedBooks[i] is
not null
System.out.println(s.borrowedBooks[i].sNo + "\t\t\t" +
s.borrowedBooks[i].bookName + "\t\t\t" + s.borrowedBooks[i].authorName);
}
}
System.out.println("Enter Serial Number of Book to be Checked In:");
int sNo = input.nextInt();
for (int i = 0; i < s.booksCount; i++) {
if (s.borrowedBooks[i] != null && sNo == s.borrowedBooks[i].sNo)
{ // Check if borrowedBooks[i] is not null
book.checkInBook(s.borrowedBooks[i]);
s.borrowedBooks[i] = null;
return;
}
}
System.out.println("Book of Serial No " + sNo + " not Found.");
}
}
}
