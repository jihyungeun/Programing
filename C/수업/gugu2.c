#include<stdio.h>
int main(){
	int i, k;
	int gugu[9][9];


	for(i=1;i<9;i++){
		for(k=1;k<9;k++){
			gugu[i][k] = i*k;
			printf("%dX%d=%2d ", k, i, gugu[i][k]);
		}
		printf("\n");
	}
	return 0;
}

