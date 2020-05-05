#include<iostream>
using namespace std;

int main() {
	// Write your code here
	int n,r=0,d;
    cin>>n;
    if((n>=0) && (n<=100000000))
    {
    while(n!=0)
    {
        d=n%10;
        r=r*10+d;
        n=n/10;
    }
    }
    cout<<r;
}
