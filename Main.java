package geometrie;

public class Main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Point point = new Point(4, 7);
			
			System.out.println(point.getX()+""+point.getY());
			
			System.out.println(point.toString());

			Point p1 = new Point(1,2);
			Point p2 = p1;
			Point p3 = new Point(1,2);
			System.out.println(p1 == p2); 
			System.out.println(p1 == p3);
			System.out.println(p1.equals(p3));
			System.out.println(Point.getCompteur());
			
			// Ligne Brisée 
			
			LigneBrisee l = new LigneBrisee();
	        l.addPoint(p1);
	        l.addPoint(p3);
	        l.addPoint(p2);
	        	
	        System.out.println(l.toString());
	       //  l.deletePoint(p3); **//
	        System.out.println(l.toString());
		}

	}
