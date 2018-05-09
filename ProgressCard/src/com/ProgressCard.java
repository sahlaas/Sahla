package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgressCard {

	public static void main(String[] args) throws Exception {
		MarkListOperationNew operation = new MarkListOperationNew();
		Scanner s = new Scanner(System.in);
		List<ExamMarks> markList1 = new ArrayList<ExamMarks>();
		List<ExamMarks> markList2 = new ArrayList<ExamMarks>();
		List<ExamMarks> markList3 = new ArrayList<ExamMarks>();
		List<ExamMarks> markList4 = new ArrayList<ExamMarks>();
		int choice;
		do {

			System.out.println(
					"1.Marklist of students\n 2.Display Marklist\n 3.Best and worst performer\n 4.Improvement\n 5.Consistent performer\n");
			System.out.println("Enter the choice:");
			choice = s.nextInt();
			// s.close();
			switch (choice) {
			case 1:
				operation.enterMarks();
				break;

			case 2:
				System.out.println("..........Exam1 Details..........");
				markList1 = operation.readMarkList("D:\\\\testt1.txt");
				for (int i = 0; i < markList1.size(); i++) {
					System.out.println(markList1.get(i).getRollNo() + "\t" + markList1.get(i).getName() + "\t"
							+ markList1.get(i).getSubject1() + "\t" + markList1.get(i).getSubject2() + "\t"
							+ markList1.get(i).getSubject3() + "\t" + markList1.get(i).getSubject4() + "\t"
							+ markList1.get(i).getTotalMark() + "\t" + markList1.get(i).getAvgMark() + "\n");
				}
				System.out.println("..........Exam2 Details..........");
				markList2 = operation.readMarkList("D:\\testt2.txt");
				for (int i = 0; i < markList2.size(); i++) {
					System.out.println(markList2.get(i).getRollNo() + "\t" + markList2.get(i).getName() + "\t"
							+ markList2.get(i).getSubject1() + "\t" + markList2.get(i).getSubject2() + "\t"
							+ markList2.get(i).getSubject3() + "\t" + markList2.get(i).getSubject4() + "\t"
							+ markList2.get(i).getTotalMark() + "\t" + markList2.get(i).getAvgMark() + "\n");
				}
				System.out.println("..........Exam3 Details..........");
				markList3 = operation.readMarkList("D:\\testt3.txt");
				for (int i = 0; i < markList3.size(); i++) {
					System.out.println(markList3.get(i).getRollNo() + "\t" + markList3.get(i).getName() + "\t"
							+ markList3.get(i).getSubject1() + "\t" + markList3.get(i).getSubject2() + "\t"
							+ markList3.get(i).getSubject3() + "\t" + markList3.get(i).getSubject4() + "\t"
							+ markList3.get(i).getTotalMark() + "\t" + markList2.get(i).getAvgMark() + "\n");
				}
				System.out.println("..........Exam4 Details..........");
				markList4 = operation.readMarkList("D:\\testt4.txt");
				for (int i = 0; i < markList4.size(); i++) {
					System.out.println(markList4.get(i).getRollNo() + "\t" + markList4.get(i).getName() + "\t"
							+ markList4.get(i).getSubject1() + "\t" + markList4.get(i).getSubject2() + "\t"
							+ markList4.get(i).getSubject3() + "\t" + markList4.get(i).getSubject4() + "\t"
							+ markList4.get(i).getTotalMark() + "\t" + markList2.get(i).getAvgMark() + "\n");
				}

				break;

			case 3:
				operation.bestWorstPerformer();

				break;
			case 4:

				break;

			case 5:
				operation.consistentStudent();
				break;

			default:
				System.out.println("Default ");
			}
		} while (choice <= 5);
	}
}
