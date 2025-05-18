import java.util.Scanner;
public class Library {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Welcome to the Library!");
System.out.println("Select From The Following Options:");
System.out.println("");
books ob = new books();
students obStudent = new students();
book book1 = new book(1,"The God of Small Things ", "Arundhati
Roy ", 35);
book book2 = new book(2, "A Fine Balance ", "Rohinton
Mistry", 25);
book book3 = new book(3, "Shadow Lines ", "Amitav
Gosh", 20);
book book4 = new book(4,"Midnight's Children", "Salman
Rushdie", 14);
book book5 = new book(5,"A Tale of Two Cities", "Charles
Dickens", 45);
book book6 = new book(6,"The Little Prince", "Antoine de
Saint-Expery",38);
book book7 = new book(7,"Harry Potter and the Philosopher's Stone","J.K.
Rowling", 23);
book book8 = new book(8,"And Then There Were None", "Agatha
Christie", 42);
book book9 = new book(9,"Dream of the Red Chamber", "Cao
Xueqin", 28);
book book10 = new book(10,"The Hobbit", "J.R.R.
Tolkien", 17);
book book11 = new book(11,"Anne of Green Gables", "Lucy Maud
Montgomery", 27);
book book12 = new book(12,"Black Beauty", "Anna
Sewell", 36);
book book13 = new book(13,"Angels and Demon", "Brown,
Dan", 25);
book book14 = new book(14,"Twilight", "Meyer,
Stephenie", 13);
book book15 = new book(15,"New Moon", "Meyer,
Stephenie", 40);
book book16 = new book(16,"Heidi", "Johanna
Spyri", 24);
book book17 = new book(17,"The Bridges of Madison County", "Robert Jmaes
Waller", 20);
book book18 = new book(18,"The Da Vinci Code", "Dan
Brown", 45);
book book19 = new book(19,"The Happiness Advantage", "Shawn
Achor", 30);
book book20 = new book(20,"The Motivation Manifesto", "Brendon
Burchard", 43);
book book21 = new book(21,"Pride and Prejudice", "Jane
Austen", 41);
book book22 = new book(22,"To Kill a Mockingbird", "Harper
Lee", 39);
book book23 = new book(23,"The Great Gatsby", "F. Scott
Fitzgerald", 27);
book book24 = new book(24,"Moby-Dick", "Herman
Melville", 51);
book book25 = new book(25,"The Catcher in the Rye", "J.D.
Salinger", 33);
book book26 = new book(26,"1984", "George
Orwell", 47);
book book27 = new book(27,"The Lord of the Rings", "J.R.R.
Tolkien", 67);
book book28 = new book(28,"Brave New World", "Aldous
Huxley", 28);
book book29 = new book(29,"The Grapes of Wrath", "John
Steinbeck", 56);
book book30 = new book(30,"Crime and Punishment", "Fyodor
Dostoevsky", 48);
book book31 = new book(31,"The Picture of Dorian Gray", "Oscar
Wilde", 22);
book book32 = new book(32,"The Brothers Karamazov", "Fyodor
Dostoevsky", 63);
book book33 = new book(33,"Wuthering Heights", "Emily
Brontë", 38);
book book34 = new book(34,"The Adventures of Sherlock Holmes", "Arthur
Conan Doyle", 32);
book book35 = new book(35,"Frankenstein", "Mary
Shelley", 29);
book book36 = new book(36,"Anna Karenina", "Leo
Tolstoy", 55);
book book37 = new book(37,"War and Peace", "Leo
Tolstoy", 68);
book book38 = new book(38,"The Count of Monte Cristo", "Alexandre
Dumas", 50);
book book39 = new book(39,"The
Odyssey", "Homer", 60);
book book40 = new book(40,"The
Iliad", "Homer", 58);
book book41 = new book(41,"The Old Man and the Sea", "Ernest
Hemingway", 20);
book book42 = new book(42,"The Scarlet Letter", "Nathaniel
Hawthorne", 19);
book book43 = new book(43,"The Call of the Wild", "Jack
London", 17);
book book44 = new book(44,"Les Misérables", "Victor
Hugo", 72);
book book45 = new book(45,"A Christmas Carol", "Charles
Dickens", 15);
book book46 = new book(46,"Little Women", "Louisa May
Alcott", 44);
book book47 = new book(47,"Sense and Sensibility", "Jane
Austen", 35);
book book48 = new book(48,"Dracula", "Bram
Stoker", 34);
book book49 = new book(49,"A Room with a View", "E.M.
Forster", 21);
book book50 = new book(50,"The Metamorphosis", "Franz
Kafka", 9);
book book51 = new book(51, "The Adventures of Huckleberry Finn", "Mark
Twain", 37);
book book52 = new book(52, "Jane Eyre", "Charlotte
Brontë", 40);
book book53 = new book(53, "The Canterbury Tales", "Geoffrey
Chaucer", 43);
book book54 = new book(54, "The Secret Garden", "Frances
Hodgson Burnett",32);
book book55 = new book(55, "Gone with the Wind", "Margaret
Mitchell", 60);
book book56 = new book(56, "The Sun Also Rises", "Ernest
Hemingway", 33);
book book57 = new book(57, "One Hundred Years of Solitude", "Gabriel
García Márquez", 48);
book book58 = new book(58, "Don Quixote", "Miguel de
Cervantes", 55);
book book59 = new book(59, "The Wind in the Willows", "Kenneth
Grahame", 28);
book book60 = new book(60, "The Divine Comedy", "Dante
Alighieri", 70);
book book61 = new book(61, "Slaughterhouse-Five", "Kurt
Vonnegut", 31);
book book62 = new book(62, "The Bell Jar", "Sylvia
Plath", 38);
book book63 = new book(63, "A Confederacy of Dunces", "John
Kennedy Toole", 36);
book book64 = new book(64, "The Road", "Cormac
McCarthy", 32);
book book65 = new book(65, "The Color Purple", "Alice
Walker", 34);
book book66 = new book(66, "The Stand", "Stephen
King", 57);
book book67 = new book(67, "The Name of the Rose", "Umberto
Eco", 49);
book book68 = new book(68, "The Poisonwood Bible", "Barbara
Kingsolver", 46);
book book69 = new book(69, "The Joy Luck Club", "Amy
Tan", 39);
book book70 = new book(70, "A Clockwork Orange", "Anthony
Burgess", 26);
book book71 = new book(71, "The Hitchhiker's Guide to the Galaxy", "Douglas
Adams", 41);
book book72 = new book(72, "The Martian", "Andy
Weir", 38);
book book73 = new book(73, "The Alchemist", "Paulo
Coelho", 29);
book book74 = new book(74, "The Outsiders", "S.E.
Hinton", 35);
book book75 = new book(75, "The Kite Runner", "Khaled
Hosseini", 46);
book book76 = new book(76, "The Girl with the Dragon Tattoo", "Stieg
Larsson", 52);
book book77 = new book(77, "The Help", "Kathryn
Stockett", 45);
book book78 = new book(78, "The Hunger Games", "Suzanne
Collins", 38);
book book79 = new book(79, "The Road Less Traveled", "M. Scott
Peck", 29);
book book80 = new book(80, "The Prince", "Niccolò
Machiavelli", 30);
book book81 = new book(81, "Lord of the Flies", "William
Golding", 36);
book book82 = new book(82, "The Countess", "Rebecca
Johns", 32);
book book83 = new book(83, "Watership Down", "Richard
Adams", 53);
book book84 = new book(84, "The Lovely Bones", "Alice
Sebold", 41);
book book85 = new book(85, "The Fault in Our Stars", "John
Green", 34);
book book86 = new book(86, "The Handmaid's Tale", "Margaret
Atwood", 37);
book book87 = new book(87, "Beloved", "Toni
Morrison", 48);
book book88 = new book(88, "The Help", "Kathryn
Stockett", 45);
book book89 = new book(89, "The Giver", "Lois
Lowry", 33);
book book90 = new book(90, "The Goldfinch", "Donna
Tartt", 47);
book book91 = new book(91, "The Night Circus", "Erin
Morgenstern", 50);
book book92 = new book(92, "The Husband's Secret", "Liane
Moriarty", 39);
book book93 = new book(93, "The Light Between Oceans", "M.L.
Stedman", 42);
book book94 = new book(94, "The Guernsey Literary and Potato Peel Pie Society",
"Mary Ann Shaffer and Annie Barrows", 36);
book book95 = new book(95, "The Book Thief", "Markus
Zusak", 55);
book book96 = new book(96, "The Nightingale", "Kristin
Hannah", 48);
book book97 = new book(97, "Educated", "Tara
Westover", 44);
book book98 = new book(98, "Crazy Rich Asians", "Kevin
Kwan", 38);
book book99 = new book(99, "The Hate U Give", "Angie
Thomas", 46);
book book100 = new book(100, "The Silent Patient", "Alex
Michaelides", 35);
ob.addBook(book1);
ob.addBook(book2);
ob.addBook(book3);
ob.addBook(book4);
ob.addBook(book5);
ob.addBook(book6);
ob.addBook(book7);
ob.addBook(book8);
ob.addBook(book9);
ob.addBook(book10);
ob.addBook(book11);
ob.addBook(book12);
ob.addBook(book13);
ob.addBook(book14);
ob.addBook(book15);
ob.addBook(book16);
ob.addBook(book17);
ob.addBook(book18);
ob.addBook(book19);
ob.addBook(book20);
ob.addBook(book21);
ob.addBook(book22);
ob.addBook(book23);
ob.addBook(book24);
ob.addBook(book25);
ob.addBook(book26);
ob.addBook(book27);
ob.addBook(book28);
ob.addBook(book29);
ob.addBook(book30);
ob.addBook(book31);
ob.addBook(book32);
ob.addBook(book33);
ob.addBook(book34);
ob.addBook(book35);
ob.addBook(book36);
ob.addBook(book37);
ob.addBook(book38);
ob.addBook(book39);
ob.addBook(book40);
ob.addBook(book41);
ob.addBook(book42);
ob.addBook(book43);
ob.addBook(book44);
ob.addBook(book45);
ob.addBook(book46);
ob.addBook(book47);
ob.addBook(book48);
ob.addBook(book49);
ob.addBook(book50);
ob.addBook(book51);
ob.addBook(book52);
ob.addBook(book53);
ob.addBook(book54);
ob.addBook(book55);
ob.addBook(book56);
ob.addBook(book57);
ob.addBook(book58);
ob.addBook(book59);
ob.addBook(book60);
ob.addBook(book61);
ob.addBook(book62);
ob.addBook(book63);
ob.addBook(book64);
ob.addBook(book65);
ob.addBook(book66);
ob.addBook(book67);
ob.addBook(book68);
ob.addBook(book69);
ob.addBook(book70);
ob.addBook(book71);
ob.addBook(book72);
ob.addBook(book73);
ob.addBook(book74);
ob.addBook(book75);
ob.addBook(book76);
ob.addBook(book77);
ob.addBook(book78);
ob.addBook(book79);
ob.addBook(book80);
ob.addBook(book81);
ob.addBook(book82);
ob.addBook(book83);
ob.addBook(book84);
ob.addBook(book85);
ob.addBook(book86);
ob.addBook(book87);
ob.addBook(book88);
ob.addBook(book89);
ob.addBook(book90);
ob.addBook(book91);
ob.addBook(book92);
ob.addBook(book93);
ob.addBook(book94);
ob.addBook(book95);
ob.addBook(book96);
ob.addBook(book97);
ob.addBook(book98);
ob.addBook(book99);
ob.addBook(book100);
int choice;
int searchChoice;
do {
ob.dispMenu();
choice = input.nextInt();
switch (choice) {
case 1:
System.out.println("Press 2 to Search with Book Serial No.");
System.out.println("Press 3 to Search with Book's Author
Name.");
searchChoice = input.nextInt();
switch (searchChoice) {
case 2:
ob.searchBySno();
break;
case 3:
ob.searchByAuthorName();
break;
}
break;
case 4:
ob.showAllBooks();
break;
case 5:
student s = new student();
obStudent.addStudent(s);
break;
case 6:
obStudent.showAllStudents();
break;
case 7:
obStudent.checkOutBook(ob);
break;
case 8:
obStudent.checkInBook(ob);
break;
case 9:
ob.displayTotalFine();
break;
default:
System.out.println("ENTER BETWEEN 0 TO 8.");
}
} while (choice != 0);
}
}
