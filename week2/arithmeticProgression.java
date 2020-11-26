//https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARITHPRO
import java.util.*;
import java.io.*;
public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int a1[] = new int[100001];
    int a2[] = new int[100001];
    int b1[] = new int[100001];
    int n = sc.nextInt();
    int a,o=0;
    for(int i=1;i<=n;++i) {
        a = sc.nextInt();
    if(b1[a]>0)
        continue;
    if(a1[a]>0) {
        if(a2[a] < 1)
            a2[a]=i-a1[a];
        else if(a2[a]!=i-a1[a])
        {
            b1[a]=1;--o;
        }
    }
        else ++o;
        a1[a]=i;
    }
    System.out.println(o);
    for(int i=1;i<100001;++i)
        if(a1[i]>0 && b1[i]<1)
          System.out.println(i + " " + a2[i]);
  }
}

/*Try to think in terms of storing the all the indices where an element is present and then finding the difference between them
create a frequency array f1[] this will store the difference of indexes
create another boolean freq array f2[], this will store whether the difference for that number is common for all differences or not
3. create an array f3[] to store the previous index
for example
1 2 3 2 3 1 1
f1[1] = 0
f2[1] =true
f3[1] =0
f1[2]= 0 , f2[2] = t , f3[2] =1
f1[3]=0, f2[3]=t, f3[3]=2
f1[2] =3-1=2, f2[2]=t, f3[2] =3
f1[3] = 4-2=2 , f2[3]=t, f3[3]=4
f1[1] = 6-0 = 6, f2[1]=t , f3[1] =6
f1[1] = 7-6 =1, but the previous difference was 6, so f2[1]=f
for all f2[] true, print their f1[]*/
/*for example
1 2 3 2 3 1 1
f1[1] = 0  // element 1 is present at index 0, since it is first occurence the difference is 0
f2[1] =true // it says whether the difference that we calculate each time is common or not, if it is not common difference then make it false, else keep it true
f3[1] =0 // it says what was the previous index element 1 has occurred, so now when 1 occurrs again, we can subtract the current index with previous index
f1[2]= 0 , f2[2] = t , f3[2] =1
f1[3]=0, f2[3]=t, f3[3]=2
f1[2] =3-1=2, f2[2]=t, f3[2] =3
f1[3] = 4-2=2 , f2[3]=t, f3[3]=4
f1[1] = 6-0 = 6, f2[1]=t , f3[1] =6
f1[1] = 7-6 =1, but the previous difference was 6, so f2[1]=f
for all f2[] true, print their f1[]*/
/*why did we take array sizes 100001
are storing element frequency of each index and constraint is given 10 raised to the power of 5 as 1 ≤ n ≤ 10to the power 5 so we've taken taken size of an array as 100001*/
