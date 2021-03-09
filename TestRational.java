
public class TestRational {

	public static void main(String[] args) {
		
		
		Rational r1 = new Rational(3,2);
		Rational r2 = new Rational(1,2);
		Rational r3 = new Rational(0,1);
		Rational r4 = new Rational(0,1);
		Vector vect = new Vector(r1,r2);
		System.out.println(vect);
		Vector vect1 = new Vector(r3,r4);
		Rational a = new Rational(2,3);
		System.out.println(vect1);
		vect1.set(1,a);
		System.out.println(vect1);
		Rational b = new Rational(3,2);
		a.mult(b);
		System.out.println(vect1);
		Rational r5 = new Rational(1,2);
		Rational r6 = new Rational(1,2);
		Vector vect2 = new Vector(r5,r6);
		System.out.println(vect2);
		a=vect2.get(1);
		Rational r7 = new Rational(1,3);
		a.mult(r7);
		System.out.println(vect2);
		Rational fraction = new Rational(24,12); 
		System.out.println("le numerateur est " + fraction.getNum()+ " le denominateur est " + fraction.getDenom());
		System.out.println(fraction);
		
		Rational fraction1 = new Rational(1,3);
		fraction1.mult(fraction);
		System.out.println(fraction1);

		fraction1.add(fraction);
		System.out.println(fraction1);
		
		}

}
