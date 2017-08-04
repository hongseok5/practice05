package Prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<Shape>();
		list.add(new Rectangle(5,6));          // Shape리스트에 사각형 하나 추가
		list.add(new RectTriangle(6,2));       // 삼각형 하나 추가  
		
		for(Shape shape : list) {
			System.out.println("area:"+shape.getArea());
			System.out.println("area:"+shape.getPerimeter());
			
			
			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape ;
				resizable.resize(0.5);
				
				
				System.out.println("area:"+shape.getArea());
				System.out.println("area:"+shape.getPerimeter());
			} //if 문
		}    //for 문
		
	}       //메인함수 

}
