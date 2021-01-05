
public class curly_brocol {

	public static void main(String[] args) {
		
		/*  /* The java code calculates and give the result of d, which is equal to
        the squareroot of wx*wx((x1-x2)*(x1-x2)) + wy*wy((y1-y2)*(y1-y2)) + 
        wz*wz((z1-z2)*(z1-z2)) divided by squareroot of (wx*wx)+(wy*wy)+(wz*wz)
        */  
        
        // Creating variables, and assigning values/symbol to them.
        double a, b, c, d, e, f, g, h, i, j, k;
        double wx = 0.5, wy = 0.3, wz = 0.2;
        double x1 = 2.0, x2 = 0.0, y1 = 1.0, y2 = 0.0, z1 = 3.0, z2 = 6.0;
        double xDiff, yDiff, zDiff;
        
        xDiff = x1 - x2; yDiff = y1 - y2; zDiff = z1 - z2;
        a = wx * wx; b = wy * wy; c = wz * wz;
        e = (xDiff * xDiff) * a; f = (yDiff * yDiff) * b;
        g = (zDiff * zDiff) * c;
        
        h = e + f + g;
        i = Math.sqrt(h);
        
        j = a + b + c;
        k = Math.sqrt(j);
        
        d = i/k;
        
        System.out.println(d);
        
        
    }
    
}

	


