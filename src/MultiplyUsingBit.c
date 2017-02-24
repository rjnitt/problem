#include <iostream>
#include<cmath>
using namespace std;
 
int main() {
 
	int a,b;
	int total_minus=0;
	scanf("%d%d",&a,&b);
	if(a<0)
	{
    	a-=(a+a);  // converting the number into positive same number
    	total_minus++; //counting total negative numbers in multiplication
	}
	if(b<0)
	{
        b-=(b+b);  // converting the number into positive same number
    	total_minus++;//counting total negative numbers in multiplication
	}
	double value=pow(2,(log2(a)+log2(b))); // using log property
	if(total_minus==1) // checking if only one number was negative. i.e output should be negative
	{
		value-=(value+value); // converting the output into it's negative
	}
	cout<<value;
 
	return 0;
}
