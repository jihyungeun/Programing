#include<stdio.h>
void jolly(){
	printf("jolly good");
}

void deny(){
	printf("Which nobody can deny!\n");
}

int main(){
	int i;
	for(i = 0; i <= 3; i++){
		printf("For he's a ");
		jolly();
		printf("fellow!\n");
	}
	deny();
	return 0;
}
