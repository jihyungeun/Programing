#include<stdio.h>
int main(){
	int aa[3] = {10, 20, 30};

	printf("aa[0]의 값은 %d, 주소는 %p \n", aa[0], &aa[0]);
	printf("aa[1]의 값은 %d, 주소는 %p \n", aa[1], &aa[1]);
	printf("aa[2]의 값은 %d, 주소는 %p \n", aa[2], &aa[2]);
	printf("배열 이름 aa의 값(= 주소)는 %p \n", &aa);
	return 0;
}
