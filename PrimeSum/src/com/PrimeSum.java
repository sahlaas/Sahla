package com;

public class PrimeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sumPrime = sumPrime(2000000);
		System.out.println(sumPrime);
		

	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
		
	}
	public static long sumPrime(int n){
		long sum=0;
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				//System.out.println(i);
				sum+=i;
			}
		}
		return sum;
	}
	

}
