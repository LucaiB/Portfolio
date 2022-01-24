/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  9/8/18 

PURPOSE: To create a polynomial interface that specifies methods to be used 
when implemeting Polynomial.
WHAT I LEARNED: I reviewed how to build an interface.            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
public interface Pd5LucasBanerjiPolynomial
{
public int getDegree();
public double getCoeff(int exp);
public double evaluate(int xValue);
public Pd5LucasBanerjiPolynomial sum(Pd5LucasBanerjiPolynomial other);
public Pd5LucasBanerjiPolynomial difference(Pd5LucasBanerjiPolynomial other);
public Pd5LucasBanerjiPolynomial derivative();
}