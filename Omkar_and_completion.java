
/*ou have been blessed as a child of Omkar. To express your gratitude, please solve this problem for Omkar!

An array a of length n is called complete if all elements are positive and don't exceed 1000, and for all indices x,y,z (1≤x,y,z≤n), ax+ay≠az (not necessarily distinct).

You are given one integer n. Please find any complete array of length n. It is guaranteed that under given constraints such array exists.

Input
Each test contains multiple test cases. The first line contains t (1≤t≤1000)  — the number of test cases. Description of the test cases follows.

The only line of each test case contains one integer n (1≤n≤1000).

It is guaranteed that the sum of n over all test cases does not exceed 1000.

Output
For each test case, print a complete array on a single line. All elements have to be integers between 1 and 1000 and for all indices x,y,z (1≤x,y,z≤n) (not necessarily distinct), ax+ay≠az must hold.

If multiple solutions exist, you may print any.

Example
inputCopy
2
5
4
outputCopy
1 5 3 77 12
384 384 44 44
Note
It can be shown that the outputs above are valid for each test case. For example, 44+44≠384.

Below are some examples of arrays that are NOT complete for the 1st test case:

[1,2,3,4,5]

Notice that a1+a2=a3.

[1,3000,1,300,1]

Notice that a2=3000>1000.

 */
import java.util.*;
public class Omkar_and_completion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
           
            int n=sc.nextInt();
            for(int i=1;i<n;i++)
            {
               System.out.print(1+" ");
            }
            System.out.println(1);
        }
    }
}