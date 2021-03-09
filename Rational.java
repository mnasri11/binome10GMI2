

public class Rational {
	
	public int num;
	public int denom;
	
	public int pgcd(int a, int b) {
		if (b==0)
		{
			return a;
		}
		else {
			return pgcd(b, a%b );
		}
		
	}

	public Rational(int numerateur, int denominateur) {
		 if (denominateur==0) {
			 throw new ArithmeticException("Le dénominateur ne peut être nul, changez de valeur" ); 
		 }
		else 
		{
			if (pgcd(numerateur, denominateur)==1)
				{
				this.num=numerateur;
				this.denom=denominateur;
				}
			else
			{
				this.num=numerateur/pgcd(numerateur,denominateur);
				this.denom=denominateur/pgcd(numerateur,denominateur);
			}
		}
	}
	public int getNum() {
		return(this.num);
	
	}
	public int getDenom() {
		return(this.denom);
	}
	
		
	public String toString() { //methode toString 
		return(this.getNum()+"/"+ this.getDenom() );
	}
	
	public void mult(Rational frac) {
		this.num=frac.num*this.num;
		this.denom=frac.denom*this.denom;
		
	}
	
	public void add(Rational frac) {
		this.num= (this.num)*(frac.denom) + (this.denom)*frac.num;
		this.denom=this.denom*frac.denom;
	}
}
