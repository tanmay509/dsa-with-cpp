
double area(double a){
    return a*3.14*a;
}
int fac(int a){
    if(a==0||a==1){
        return 1;
    }else{
        return a*fac(a-1);
    }
}