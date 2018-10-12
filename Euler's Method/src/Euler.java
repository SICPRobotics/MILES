import javax.swing.JOptionPane;

public class Euler
{
	public static void main (String[] args)
	{
		String numStr;
		int coefficient, degree;
		double icy, icx, step, fxv;

		numStr = JOptionPane.showInputDialog ("Enter degree of dy/dx: ");
		degree = Integer.parseInt(numStr);
		JOptionPane.showMessageDialog (null, "Degree is : " + degree);

		double[] coefficients = new double[degree+1];
      
		for (int i = 0; i <= degree; i++)
		{
			numStr = JOptionPane.showInputDialog ("Enter the " + i + " degree coefficient: ");
			coefficient = Integer.parseInt(numStr);
			coefficients[i] = coefficient;
		}
    
		numStr = JOptionPane.showInputDialog ("Enter initial y-value: ");
		icy = Double.parseDouble(numStr);
     
		numStr = JOptionPane.showInputDialog ("Enter initial x-value: ");
		icx = Double.parseDouble(numStr);
      
		numStr = JOptionPane.showInputDialog ("Enter final x-value: ");
		fxv = Double.parseDouble(numStr);
		
		numStr = JOptionPane.showInputDialog ("Enter step size: ");
		step = Double.parseDouble(numStr);
    
		double[] xValues = new double[(int) ((fxv - icx)/step) + 1];	
		double prevX = icx;
		
		for (int i = 0; i < xValues.length; i++)
		{
			xValues[i] = prevX;
			prevX = prevX + step;
		}
		
		double[] yValues = new double[xValues.length];
		yValues[0] = icy;
		
		for (int i = 1; i < yValues.length; i++)
		{
			double yDiff = 0;
			for(int j = 0; j < coefficients.length; j++)
			{
				yDiff = yDiff + coefficients[j]*Math.pow(xValues[i], j);
			}
			
			yValues[i] = yValues[i-1] + yDiff;
		}		
		
		System.out.println(" x     y ");
		for (int i = 0; i < xValues.length; i++)
		{
			System.out.println(xValues[i] + "   " + yValues[i]);
		}

		//print points with connecting lines
		//print actual curve
	}
}

