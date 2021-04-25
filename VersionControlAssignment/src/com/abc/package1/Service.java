package com.abc.package1;

import java.util.*;

public class Service {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Number Of Records To Enter : ");

		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			Student student = new Student();

			System.out.println("Please Enter The " + (i + 1) + " st Student Details ");

			System.out.println("------------------------------------------------------");

			System.out.println("Enter The Student ID");

			student.setStudent_id(scan.nextInt());
			scan.nextLine();

			System.out.println();

			System.out.println("Enter The Student Name");

			student.setStudent_name(scan.nextLine());
			System.out.println();

			System.out.println("Enter The Student Number");

			student.setStudent_number(scan.nextLine());
			System.out.println();

			System.out.println("Enter The Student Email");

			student.setStudent_email(scan.nextLine());
			System.out.println();

			System.out.println("Enter The Student Department");

			student.setStudent_dept(scan.nextLine());
			System.out.println();

			arrayList.add(student);

		}

		System.out.println("Find Details By ID Of Student");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter The ID Of Student : ");
		int find = scan.nextInt();

		for (Student temp : arrayList) {

			if (temp.getStudent_id() == find) {

				System.out.print(temp.getStudent_id() + "\t");
				System.out.print(temp.getStudent_name() + "\t");
				System.out.print(temp.getStudent_number() + "\t");
				System.out.print(temp.getStudent_email() + "\t");
				System.out.print(temp.getStudent_dept() + "\t");

				System.out.println();

			}

		}

	}

}
