/************************
Janis Sausserdis 2ITB 2.grupa
17 tests passed
************************/
 
package javasem02;
//import java.util.Arrays;
import java.util.Random;
//import javax.script.ScriptEngineManager;
//import javax.script.ScriptEngine;
//import javax.script.ScriptException;

/**
 *
 * @author s4_sausse_j
 */
public class JavaSem02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 0.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        //System.out.println("Pos in "+fallingTime+" sec: "+finalPosition);
        //System.out.println(positionCalc(gravity, initialVelocity, initialPosition, fallingTime));
        //Random rnd = new Random();
        //System.out.println(rnd.nextDouble());
    }
    double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime)
    {       double x = 0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + initialPosition;
        return x;
    }
    int factorialForLoop(int a)
    {   int fact = 1;
        
        if (a == 0)
            return 1;
        if ( a < 1 )
            return 0;
        else
            for (int i = 1; i <= a; i++){
            fact *= i;
        }
    
        return fact;
    }
    int factorialRecursive(int a)
    {   int fact;
    
        if (a == 0)
            return 1;
        if (a < 1)
            return 0;
        else
           fact = a * factorialRecursive(a - 1);
    
        return fact;
    }
    double[] generateArray(int N, double lower, double upper)
    {   
        double[] array = new double[N];
        Random rand = new Random();
        
        if (upper < lower)
            return new double [0];
        else{
            for ( int i = 0; i < N; i++){
                array[i] = rand.nextDouble()*(upper-lower) ;
            }
        }
        return array;
        
    }
    double getMean(double[] array)
    {
        double total = 0;
    for (double d: array) {
        total += d;
    }
        return total / (array.length);
    }
    double getMin(double[] array)
    {
        double minValue = array[0]; 
        for(int i = 1; i < array.length; i++){ 
          if(array[i] < minValue){ 
         minValue = array[i]; 
        } 
      } 
     
    return minValue; 
    }
    double getMax(double[] array)
    {
        double maxValue = array[0]; 
    for(int i=1; i < array.length; i++){ 
      if(array[i] > maxValue){ 
         maxValue = array[i]; 
      } 
    } 
    return maxValue; 
    
    }
    double[] arraySort(double[] array)
    {
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    if (array[i] < array[j]){
                    double tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    }
                }
            }
            
        return array;
    }
    double[][] generateMatrix(int N)
    {
        double[][] generateMatrix = new double [N][N];
        Random rand = new Random(); 

        for (int i = 0; i < N; i++) {   
            for (int j = 0; j < N; j++) {
                Integer r = rand.nextInt() % 100; 
                generateMatrix[i][j] = Math.abs(r);
            }
        }

        return generateMatrix;
    
    }
    double getProduct(double[][] array, int i, int j)
    {
        double sum = 0;
        int N = array.length;
        for (int c = 0; c < N; c++){
            for (int d = 0; d < N; d++){
                sum += array[i][c] * array[j][d];
            }
        }
        return sum;
    }
    double[] coinFlip(int N)
    {
        double[] coinFlip = new double [3];
        Random rand = new Random();
        int result;
               
        for (int i = 0; i < N; i++){
            result = rand.nextInt(2);
            if (result == 0)
                coinFlip[0]++;
            else
                coinFlip[1]++;
            
        }
        coinFlip[2] = coinFlip[0] / coinFlip[1];
        
        return coinFlip;
    }
    int[] rollDice(int N)
    {
        int[] rollDice = new int [N];
        int[] histogram = new int [6];
        Random rand = new Random();
        
        for ( int i = 0; i < rollDice.length; i++ ){
            Integer dice = rand.nextInt(5) + 1;
            histogram[dice]++;
        }
            
        return histogram;
    }
	 int roll2Dices()
    {
        Random r1 = new Random();
        Random r2 = new Random();
        
        int result = 0;
        do {
            Integer dice1 = r1.nextInt(6) + 1;
            Integer dice2 = r2.nextInt(6) + 1;
            result = dice1 + dice2;
        }
        while (result == 12);
              
        return result;
    }
    String getTextFromBytes(byte[] array)
    {
        return new String(array);
    }
    String pascalsTriangle(int level)
    {
        String row = "[";
        int num = 1;
    
        for (int col = 0; col <= level; col++){
            if (col > 0)
                num = num * ((level + 1) - col) / col;    
            if (col == level)
                row += (num + "]");
            else
                row += (num + ", ");    
        }
        
            return row;
    }
    /*double executeStringEquation(String inputEquation) throws ScriptException
    {   
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        
        return (int) engine.eval(inputEquation);
    }*/
}