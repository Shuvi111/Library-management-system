import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class books {
book theBooks[] = new book[100];
public static int count;
Scanner input = new Scanner(System.in);
double ammount=0.0;
public int compareBookObjects(book b1, book b2)
{
if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
System.out.println(
"Book of this Name Already Exists.");
return 0;
}
if (b1.sNo == b2.sNo) {
System.out.println(
"Book of this Serial No Already Exists.");
return 0;
}
return 1;
}
public void searchBySno()
{
System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
int sNo;
System.out.println("Enter Serial No of Book:");
sNo = input.nextInt();
int flag = 0;
System.out.println(
"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
for (int i = 0; i < count; i++) {
if (sNo == theBooks[i].sNo) {
System.out.println(
theBooks[i].sNo + "\t\t"
+ theBooks[i].bookName + "\t\t"
+ theBooks[i].authorName + "\t\t"
+ theBooks[i].bookQtyCopy + "\t\t"
+ theBooks[i].bookQty);
flag++;
return;
}
}
if (flag == 0)
System.out.println("No Book for Serial No "
+ sNo + " Found.");
}
public void searchByAuthorName()
{
System.out.println(
"\t\t\t\tSEARCH BY AUTHOR'S NAME");
input.nextLine();
System.out.println("Enter Author Name:");
String authorName = input.nextLine();
int flag = 0;
System.out.println(
"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
for (int i = 0; i < count; i++) {
if (authorName.equalsIgnoreCase(
theBooks[i].authorName)) {
System.out.println(
theBooks[i].sNo + "\t\t"
+ theBooks[i].bookName + "\t\t"
+ theBooks[i].authorName + "\t\t"
+ theBooks[i].bookQtyCopy + "\t\t"
+ theBooks[i].bookQty);
flag++;
}
}
if (flag == 0)
System.out.println("No Books of " + authorName
+ " Found.");
}
public void showAllBooks()
{
System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
System.out.println(
"S.No\t\t\t\t\tName\t\t\t\t\tAuthor\t\t\tAvailable Qty\t\t\tTotal
Qty");
for (int i = 0; i < count; i++) {
System.out.println(
theBooks[i].sNo + "\t\t\t\t"
+ theBooks[i].bookName + "\t\t\t\t"
+ theBooks[i].authorName + "\t\t\t\t"
+ theBooks[i].bookQtyCopy + "\t\t\t\t"
+ theBooks[i].bookQty);
}
}
public void addBook(book b) {
for (int i = 0; i < count; i++) {
if (this.compareBookObjects(b, this.theBooks[i]) == 0)
return;
}
if (count < 100) {
theBooks[count] = b;
count++;
} else {
System.out.println("No Space to Add More Books.");
}
}
public void dispMenu()
{
System.out.println(
"--------------------------------------------------------------------
--------------------------------------");
System.out.println("Press 1 Search book by serial no or author name.");
System.out.println( "Press 4 to Show All Books.");
System.out.println("Press 5 to Register Student.");
System.out.println( "Press 6 to Show All Registered Students.");
System.out.println("Press 7 to issue Book. ");
System.out.println("Press 8 to Check In Book");
System.out.println("Press 9 to total bill");
System.out.println("Press 0 to Exit Application.");
System.out.println(
"--------------------------------------------------------------------
-----------------------------------");
}
public int isAvailable(int sNo)
{
for (int i = 0; i < count; i++) {
if (sNo == theBooks[i].sNo) {
if (theBooks[i].bookQtyCopy > 0) {
System.out.println(
"Book is Available.");
return i;
}
System.out.println("Book is Unavailable");
return -1;
}
}
System.out.println("No Book of Serial Number "
+ " Available in Library.");
return -1;
}
public book checkOutBook() {
System.out.println("Enter Serial No of Book to be Checked Out:");
int sNo = input.nextInt();
int bookIndex = isAvailable(sNo);
if (bookIndex != -1) {
System.out.println("Enter the check-out date (YYYY-MM-DD):");
String checkoutDateStr = input.next();
theBooks[bookIndex].checkOutDate = parseDate(checkoutDateStr);
return theBooks[bookIndex];
}
return null;
}
public void checkInBook(book b) {
for (int i = 0; i < count; i++) {
if (b.equals(theBooks[i])) {
theBooks[i].checkInDate = new Date();
long diffInMillies = Math.abs(theBooks[i].checkInDate.getTime() -
theBooks[i].checkOutDate.getTime());
long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
if (diffInDays > 15) {
double fine = (diffInDays - 15) * 10;
ammount =ammount+fine; // Assuming a fine of Rs2 per day
System.out.println("Fine charged: Rs" + fine);
} else {
System.out.println("No fine charged.");
}
theBooks[i].bookQtyCopy++;
return;
}
}
}
private Date parseDate(String dateStr) {
try {
return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
} catch (Exception e) {
System.out.println("Error parsing date: " + e.getMessage());
return null;
}
}
public void displayTotalFine() {
System.out.println("Total Fine Amount: Rs" + ammount);
}
}
