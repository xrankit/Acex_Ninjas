package basicLearning.logicalThinking.Pattern;

public class trianglePattern {
       public static void nTriangle(int n) {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println("");
        }
    } 
}
