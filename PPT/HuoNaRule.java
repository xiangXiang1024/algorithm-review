package 蛮力;
/*
 * 实现霍纳规则的多项式计算时间复杂度为O(N)
 */
public class HuoNaRule {
        public static void main(String args[])
        {
            double data[]=new double[]{1.0,2,2,3,4};
            double x=3;
            System.out.println(huonaFunction(data,x,data.length));
            System.out.println(huonaFunc(data,x,data.length));

        }
        public static double huonaFunc(double [] date,double x,int n)//实现霍纳规则的多项式计算时间复杂度为O(n2)
        {
            double y=0;
            for(int i=0;i<n;i++)
            {
                double z=1;
                for(int j=1;j<=i;j++) {
                    z = z * x;
                }
                y=y+date[i]*z;
            }
            return y;
        }

        /*
         * data为多项式的系数数组，x为值基数，n为系数数组的长度
         * Y=a0+a1*X+a2*X^2+.....+an*X^n;
         * Y=a0+X(a1+X(a2+X(a3+X(...))))
         */
        public static double huonaFunction(double[] data,double x,int n)
        {
            double y=0;
            int i=n-1;
            while(i >= 0)
            {
                y=x*y+data[i];
                i--;
            }
            return y;
        }
}

