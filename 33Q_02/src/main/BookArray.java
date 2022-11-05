package main;

import java.util.Scanner;
import book.Book;

public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book[] book = new Book[3];

		for (int i = 0; i < book.length; i++) {
			System.out.print("���� >> ");
			String title = scanner.nextLine();
			System.out.print("���� >> ");
			String author = scanner.nextLine();
			book[i] = new Book(title, author);
		}

		for (int i = 0; i < book.length; i++)
			System.out.println("(" + book[i].getTitle() + ", " + book[i].getAuthor() + ")");

		scanner.close();
	}
}