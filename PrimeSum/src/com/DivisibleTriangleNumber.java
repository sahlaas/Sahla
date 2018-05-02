package com;

public class DivisibleTriangleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long value=value();
		System.out.println(value);

	}
	public static int divisor(int n){
		int count=0;
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				if(n/i==i){
					//System.out.println(i);
					count++;
				}
				else{
					//System.out.println(i);
					//System.out.println(n/i);

					count+=2;
				}		
			}
		}
		return count;
	}
	public static long value(){
		boolean p=false;
		int i=1,j=2;
		while(!p){
			if(divisor(i)>500){
				p=true;
				return i;
			}
		    else{
			    i+=j;
			    j++;
			}
			
		}
		return 0;
	}
	

}
