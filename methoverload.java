import java.util.*;
class ml{
int area(int a){
return a*a;
}
float area(float b){
return b*b;
}
int area(int a,int b){
return a/b;
}
float area(float c, float d){
return c*d;
}
}
class methoverload{
public static void main(String args[]){
ml m=new ml();
m.area(10);
m.area(20);
m.area(10,20);
m.area(5,7);
}
}