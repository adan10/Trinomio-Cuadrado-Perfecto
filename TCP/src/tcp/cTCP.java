
package tcp;

/**
 *
 * @author Alumno
 */
public class cTCP {
    
    public String operaciones(String a, String b){
    double op;
    double op1;
    double varA;
    double varB;
    double varC;
    String result;
    
    op =Double.parseDouble(a);
    op1 =Integer.parseInt(b);
    
    varA= Math.pow(op, 2);
    varB=2*varA*op1;
    varC=Math.pow(op1, 2);
    result= varA+"x"+ "\u00B2+"+varB+"x+"+varC;
        
        return result;
                }
}
    
