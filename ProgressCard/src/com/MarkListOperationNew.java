package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkListOperationNew {
	List<ExamMarks> markList1 = new ArrayList<ExamMarks>();
	List<ExamMarks> markList2 = new ArrayList<ExamMarks>();
	List<ExamMarks> markList3 = new ArrayList<ExamMarks>();
	List<ExamMarks> markList4 = new ArrayList<ExamMarks>();
	List<ExamMarks>[] arrayOfList = new List[4];
	int studentCount = 4;

	public void enterMarks() throws Exception {
		Scanner s = new Scanner(System.in);
		int examId;
		for (int i = 0; i < 4; i++) {
			System.out.println("1.Exam1\n");
			System.out.println("2.Exam2\n");
			System.out.println("3.Exam3\n");
			System.out.println("4.Exam4\n");

			System.out.println("Enter the choice for exam:");
			int choice = s.nextInt();
			// s.close();
			switch (choice) {
			case 1:
				System.out.println(".........Exam1.........");
				examId = 1;
				markList1 = input();
				try {
					FileOutputStream fop = new FileOutputStream("D:\\testt1.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fop);

					oos.writeObject(markList1);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 2:
				System.out.println(".........Exam2.........");
				examId = 2;
				markList2 = input();
				try {
					FileOutputStream fop = new FileOutputStream("D:\\testt2.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fop);

					oos.writeObject(markList2);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 3:
				examId = 3;
				System.out.println(".........Exam3.........");
				markList3 = input();
				try {
					FileOutputStream fop = new FileOutputStream("D:\\testt3.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fop);

					oos.writeObject(markList3);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				examId = 4;
				System.out.println(".........Exam4.........");
				markList4 = input();
				try {
					FileOutputStream fop = new FileOutputStream("D:\\testt4.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fop);
					oos.writeObject(markList4);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			default:
				System.out.println("Default ");
			}
		}
	}

	public ArrayList<ExamMarks> input() throws Exception, StudentAlreadyExistException {
		Scanner s = new Scanner(System.in);
		int totalMark = 0;
		float avgMark = 0;
		ArrayList<ExamMarks> markList = new ArrayList<ExamMarks>();

		for (int i = 0; i < studentCount; i++) {
			System.out.println("Enter the rollNo of the student");
			int rollNo = s.nextInt();
			for (ExamMarks m : markList) {
				if (m.getRollNo() == rollNo) {
					throw new StudentAlreadyExistException();
				} else
					continue;
			}
			System.out.println("Enter the name of the student");
			String name = s.next();
			System.out.println("Enter Physics mark");
			int m1 = s.nextInt();
			System.out.println("Enter Chemistry mark");
			int m2 = s.nextInt();
			System.out.println("Enter Biology mark");
			int m3 = s.nextInt();
			System.out.println("Enter Maths mark");
			int m4 = s.nextInt();

			totalMark = m1 + m2 + m3 + m4;
			avgMark = totalMark / 4;

			if (rollNo != '\0' && name != null && m1 != '\0' && m2 != '\0' && m3 != '\0' && m4 != '\0') {
				ExamMarks exam1 = new ExamMarks(rollNo, name, m1, m2, m3, m4, totalMark, avgMark);
				markList.add(exam1);

			}

		}
		return markList;

	}

	public List<ExamMarks> readMarkList(String path) {
		ArrayList<ExamMarks> woi = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ExamMarks wo = null;
			ExamMarks[] woj = new ExamMarks[5];

			woi = (ArrayList<ExamMarks>) ois.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return woi;

	}

	public void bestWorstPerformer() {
		markList1 = readMarkList("D:\\\\testt1.txt");
		markList2 = readMarkList("D:\\testt2.txt");
		markList3 = readMarkList("D:\\testt3.txt");
		markList4 = readMarkList("D:\\testt4.txt");
		arrayOfList[0] = markList1;
		arrayOfList[1] = markList2;
		arrayOfList[2] = markList3;
		arrayOfList[3] = markList4;

		int total[] = new int[5];
		int best = 0;
		int sum = 0;
		int roll[] = new int[4];
		String performer[] = null;
		String bestPerformer = null;
		int bst = 0;
		for (int j = 0; j < arrayOfList.length; j++) {
			for (int i = 0; i < studentCount; i++) {
				for (ExamMarks e1 : arrayOfList[j]) {
					if (arrayOfList[j].indexOf(e1) == i) {
						total[i] += e1.getTotalMark();
						roll[i] = e1.getRollNo();
						// performer[i]=e1.getName();
					}
				}
			}
		}
		for (int i = 0; i < studentCount; i++) {
			sum = total[0];
			if (sum <= total[i]) {
				sum = total[i];
				best = roll[i];
				// bestPerformer=performer[i];
			}
		}
		System.out.println("Best performer\t-\tRollNo:\t" + best);

		System.out.println("Best performer grand total -\t" + sum);

		for (int i = 0; i < studentCount; i++) {
			sum = total[0];
			if (sum >= total[i]) {
				sum = total[i];
				// bestPerformer=e1.getName();
				best = roll[i];
			}
		}
		System.out.println("Worst performer\t-\tRollNo:\t" + best);

		System.out.println("Worst performer grand total -\t" + sum);

	}

	public void consistentStudent() {
		markList1 = readMarkList("D:\\\\testt1.txt");
		markList2 = readMarkList("D:\\testt2.txt");
		markList3 = readMarkList("D:\\testt3.txt");
		markList4 = readMarkList("D:\\testt4.txt");

		arrayOfList[0] = markList1;
		arrayOfList[1] = markList2;
		arrayOfList[2] = markList3;
		arrayOfList[3] = markList4;
		int roll[][] = new int[5][5];
		// List<Integer> best = new ArrayList<Integer>();
		int best = 0;
		int k = 0;
		float[][] avg = new float[10][10];
		for (int j = 0; j < arrayOfList.length; j++) {
			for (int i = 0; i < studentCount; i++) {
				for (ExamMarks e1 : arrayOfList[j]) {
					if (arrayOfList[j].indexOf(e1) == i) {
						avg[j][i] = e1.getAvgMark();
						roll[i][k] = e1.getRollNo();

					}
				}
			}

		}
		for (int j = 0; j < arrayOfList.length; j++) {
			for (int i = 0; i < studentCount; i++) {
				if (avg[j][i] == avg[j + 1][i]) {
					best = roll[i][k];
					System.out.println("Consistent student -RollNo\t" + best);
				}

			}
		}
		// System.out.println(best);
	}

}