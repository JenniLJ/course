package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Classroom;

public class ClassroomFileHelper implements FileHelper {

	String nameOfFile = "classrooms.txt";
	File courseList = new File(nameOfFile);

	@Override
	public boolean doesAFileExist() {
		if (courseList.exists()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<?> readFile() {
		ArrayList<Classroom> allClassrooms = new ArrayList<Classroom>();

		Scanner fileIn;
		try {
			fileIn = new Scanner(courseList);

			while (fileIn.hasNextLine()) {
				String value = fileIn.nextLine();
				String[] parts = value.split("\\|");

				Classroom currentClassroom = new Classroom(parts[0], parts[1], parts[2], parts[3],
						Integer.parseInt(parts[4]));
				allClassrooms.add(currentClassroom);
			}
			fileIn.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		}

		return allClassrooms;
	}

	@Override
	public boolean writeFile(ArrayList<?> list) {
		ArrayList<Classroom> classesToWrite = (ArrayList<Classroom>) (list);

		try {
			PrintWriter courseFile = new PrintWriter(nameOfFile);
			for (Classroom c : classesToWrite) {
				StringBuilder sb = new StringBuilder();
				sb.append(c.getBuilding() + "|" + c.getRoomNumber() + "|" + c.getCampus() + "|" + c.getType() + "|"
						+ c.getCapacity());
				courseFile.println(sb.toString());
			}

			courseFile.close();
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}
}
