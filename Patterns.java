public class Patterns{
	public static void main(String[] args){
		int n = 9;
		System.out.println("Alphabet Patterns in Java:");
		System.out.println();
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++ ) {	//A
			
				if((j==0 && i>0) ||
					(i == (n-1) / 2  && j <= (3*n) / 4) ||
					(i == 0 && j < (3*n) / 4 && j != 0) ||
					(j == (3*n) / 4 && i > 0)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//B
			
				if((i == 0 && j < (3*n) / 4 && j != 0) ||
					(i == (n-1) / 2 && j < (3*n) / 4) ||
					(i == n-1 && j < (3*n) / 4 && j != 0) ||
					(j == 0 && i != 0 && i != n-1) ||
					(j == (3*n) / 4 && i != 0 && i != (n-1) / 2 && i != n-1)) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//C
			
				if((i == 0 && j != 0 && j < (3*n) / 4) ||
					(i == n-1 && j != 0 && j < (3*n) / 4) ||
					(j == 0 && i != 0 && i != n-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//D
			
				if((i == 0 && j < (3*n) / 4) ||
					(j == 0) ||
					(i == n-1 && j < (3*n) / 4) ||
					(j == (3*n) / 4 && i != 0 && i != n-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//E
			
				if((i == 0 && j < (3*n) / 4) ||
					(j == 0) ||
					(i == n-1 && j < (3*n) / 4) ||
					(i == (n-1) / 2 && j < (2*n) / 4 )){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//F
			
				if((i == 0 && j < (3*n) / 4) ||
					(j == 0) ||
					(i == (n-1) / 2 && j < (2*n) / 4 )){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//G
			
				if((i == 0 && j < (3*n) / 4 && j != 0) ||
					(j == 0 && i != 0 && i != n-1) ||
					(i == n-1 && j < (3*n) / 4 && j > 0) ||
					(i == (n-1) / 2 && j < (3*n) / 4 && j > n / 4) ||
					(j == (3*n) / 4 && i > (n-1) / 2 && i != n-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//H
			
				if((j == 0) ||
					(j == (3*n) / 4) ||
					(i == (n-1) / 2 && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//I
			
				if((i == 0 && j < n-2) ||
					(i == n-1 && j < n-2) ||
					(j == n / 3)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//J
			
				if((i == 0 && j < n-2) ||
					(j == n / 3 && i != n-1) ||
					(i == n-1 && j < n / 3 && j != 0) ||
					(j == 0 && i != n-1 && i > (n-1) / 2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//K
			
				if((j == 0) ||
					(i-j == (n-1) / 2) ||
					(i+j == (n-1) / 2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//L
			
				if((j == 0) ||
					(i == n-1 && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//M
			
				if((i == j && i < (n-1) / 2) ||
					(i+j == (3*n) / 4 && i < (n-1) / 2) ||
					(j == 0) ||
					(j == (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++ ) {	//N
			
				if((j == 0) ||
					(j == (3*n) / 4) ||
					(i == j && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//O
			
				if((j == 0 && i != 0 && i != n-1) ||
					(j == (3*n) / 4 && i != 0 && i != n-1) ||
					(i == 0 && j != 0 && j < (3*n) / 4) ||
					(i == n-1 && j != 0 && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//P
			
				if((j == 0) ||
					(j == (3*n) / 4 && i < (n-1) /2 && i != 0) ||
					(i == 0 && j != 0 && j < (3*n) / 4) ||
					(i == (n-1) / 2 && j != 0 && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//Q
			
				if((j == 0 && i != 0 && i < (3*n) / 4) ||
					(j == (3*n) / 4 && i != 0 && i < (3*n) / 4) ||
					(i == 0 && j != 0 && j < (3*n) / 4) ||
					(i == (3*n) / 4 && j != 0 && j < (3*n) / 4) ||
					(j == (i/2) + 2 && j <= (3*n) / 4 && i > n / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//R
			
				if((j == 0) ||
					(j == (3*n) / 4 && i != 0 && i < (n-1) / 2) ||
					(i == 0 && j != 0 && j < (3*n) / 4) ||
					(i == (n-1) / 2 && j != 0 && j < (3*n) / 4) ||
					(i-j == (n-1) / 2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//S
			
				if((i == 0 && j != 0 && j < (n*3) / 4) ||
					(i == (n-1) / 2 && j != 0 && j < (3*n) / 4) ||
					(i == n-1 && j != 0 && j < (3*n) / 4) ||
					(j == 0 && i != 0 && (i < (n-1) / 2 || i > (3*n) / 4) && i != n-1) ||
					(j == (3*n) / 4 && i != 0 && (i > (n-1) / 2 || i < n / 4) && i != n-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}for (int j = 0; j < n; j++ ) {	//T
			
				if((j == n / 3) ||
					(i == 0 && j < n-2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//U
			
				if((j == 0 && i != n-1) ||
					(j == (3*n) / 4 && i != n-1) ||
					(i == n-1 && j != 0 && j < (3*n) / 4)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//V
			
				if((j == (i/3) +1 && i <= (3*n) / 4) ||
					(j == 5 - (i/3) + 1 && i != n-1) ||
					(i == n-1 && j == (n-1)/2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//T
			
				if((j == n / 3) ||
					(i == 0 && j < n-2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//T
			
				if((j == n / 3) ||
					(i == 0 && j < n-2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//T
			
				if((j == n / 3) ||
					(i == 0 && j < n-2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++ ) {	//T
			
				if((j == n / 3) ||
					(i == 0 && j < n-2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
