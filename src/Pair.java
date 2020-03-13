public class Pair
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,1,2,3,1,1,2}; //{1,2,3,0,0,0,1,0,2}
        int no_of_pair=0;
        int temp;

        for (int i=0; i<a.length; i++)
        {
            temp=a[i];
            if (temp!= 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == temp)
                    {
                        no_of_pair++;
                        a[j]=0;
                        break;
                    }
                }
            }
        }
        System.out.println("no pf pair:" + no_of_pair);
    }
}
