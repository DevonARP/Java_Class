import java.io.*;
import java.util.ArrayList;

import shapes.*;

/* your tasks:
 * create a class called ShapeException
 * createShape should throw a ShapeException
 * in main(), you should catch the ShapeException
 * 
 */
public class ReadShapeFile {

	public static GeometricObject createShape(String shape) throws ShapeException{
		
		if(shape.equals("Circle")) {
			Circle c1 = new Circle();
			return c1;
		} else if (shape.equals("Rectangle")) {
			Rectangle r1 = new Rectangle();
			return r1;
		} else if (shape.equals("Square")) {
			Square s1 = new Square();
			return s1;
		} else {
			throw new ShapeException("Not a Circle, Rectangle, or Square"); 

		}
	}
	
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
		File f = new File("shapes.txt");
		//System.out.println(f.exists());
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("File not found");
			System.exit(0);
		}
		
		assert f != null : "FileReader cannot be null."; 
		BufferedReader br = new BufferedReader(fr);
		
		try {
			String inString = br.readLine(); //first line
			
			while (inString!=null) {
				try {
					
					GeometricObject shape = createShape(inString);
					shapeList.add(shape);
					inString = br.readLine();
				} catch (ShapeException ex) {
					System.err.println("Cannot create Shape: " + inString);
					inString = br.readLine();
				}
			}
		} catch (IOException ioe) {
			System.err.println("Error reading file:" + ioe.getMessage());
		} finally {
			try {
				fr.close();
			} catch (IOException ioe) {
				System.err.println("Error reading file:" + ioe.getMessage());
			}
		}
		

		System.out.println(shapeList);
		System.out.println(shapeList.size());
		
	}
}
