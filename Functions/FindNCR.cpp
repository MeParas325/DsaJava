#include<iostream>
using namespace std;

int factorial(int n){
    int fact = 1;
    for(int i = 1; i<=n; i++){
        fact = fact * i;
    }
    return fact;
}

int ncr(int n, int r){
    int answer = 0;

    int numerator = factorial(n);
    int denomenator = factorial(r) * factorial(n - r);

    answer = numerator / denomenator;

    return answer;

}

int main(){

    int n = 5, r = 3;

    cout<<"NCR is: "<<ncr(n, r);


}