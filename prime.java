public class prime{
public static void main(String[] arg){
int i;
int j;
for(i=2;i<=100;i++){
for(j=2;j<i;j++){
if(i%j==0)
break;}
if(i==j)
System.out.printf("%d\n",i);
}
}
}