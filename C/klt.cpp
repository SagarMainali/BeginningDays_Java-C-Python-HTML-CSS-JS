#include <iostream>
#include <thread>
using namespace std;


long long totalSum;
long long n = 10000000;


int first_iteration(){
long sum;
for(long i=n/4; i<(n)/4; i++ ){
/*if(i%2!=0)
{
oddsum+=i; 
} 

else{
evensum+=i;  
}*/

sum+=i;
}

return sum;}



int second_iteration(){

long sum;
for(long i=(n)/4; i<(2*n/4); i++ ){

sum+=i;

}
return sum;
}

int third_iteration(){
long sum;
for(long i=(2*n)/4; i<(3*n)/4; i++ ){

sum+=i;
}
return sum;
}

int fourth_iteration(){
long sum;
for(long i=(3*n)/4; i<n; i++ ){
sum+=i;
}
return sum;
}




int main(){
long long first_Sum = first_iteration();
long long second_Sum = second_iteration();
long long third_Sum = third_iteration();
long long fourth_Sum = fourth_iteration();
long long totalSum =  fourth_Sum+third_Sum+second_Sum+first_Sum;






#pragma openmp parallel sections


{
#pragma openmp section
first_iteration();

#pragma openmp section
second_iteration();

#pragma openmp section
third_iteration();

#pragma openmp section
fourth_iteration();
}


cout<<totalSum;
return 0;
}