#include<stdio.h>
#include<stdlib.h>
#include<time.h>

	// 10마리의 서로 다른 동물 (각 카드 2장씩)
	// 사용자로부터 2개의 입력값을 받아서 -> 같은 동물 찾으면 카드 뒤집기
	// 모든 동물 쌍을 찾으면 게임 종료
	// 총 실패 횟수 알려주기

int arrayAnimal[4][5]; // 카드 지도(20장)
int checkAnimal[4][5]; // 뒤집혔는지 여부 확인
char * strAnimal[10]; //10개의 배열 공간을 만드는데 거기에 들어가는 데이터들이 char 포인터 형

void initAnimalArray();
void initAnimalName();
void shuffleAnimal();

int getEmptyPosition();
int conv_pos_x(int x);
int conv_pos_y(int y);

void printAnimals();


int main(){
	srand(time(NULL));

	initAnimalArray();
	initAnimalName();

	shuffleAnimal();

	int failCount = 0; // 실패 횟수

	while(1){
		int select1 = 0; // 사용자가 선택한 처음 수
		int select2 = 0; // 사용자가 선택한 두번째 수

		printAnimals(); // 동물 위치 출력
		printQuestion(); // 문제 출력 (카드 지도)
		printf("뒤집을 카드를 2개 고르세요: ");
		fgets(select1, sizeof(select1), stdin);
		fgets(select2, sizeof(select2), stdin);

		if(select1 == select2){ // 같은 카드 선택 시 무효
			continue;
		}
		//좌표에 해당하는 카드를 뒵어보고 같은지 확인

		// 정수 좌표를 (x,y)로 변환

		int firstSelect_x = conv_pos_x(select1);
		int firstSelect_y = conv_pos_y(select1);
	
		int secondSelect_x = conv_pos_x(select2);
		int secondSelect_y = conv_pos_y(select2);

		// 같은 동물인 경우
		if(checkAnimal[firstSelect_x][firstSelect_y] == 0 && checkAnimal[secondSelect_x][secondSelect_y] == 0) && (arrayAnimal[firstSelect_x][firstSelect_y] == arrayAnimal[secondSelect_x][secondSelect_y]){
			printf("\n\n 빙고! : %s 발견\n\n", strAnimal[arrayAnimal[firstSelect_x][firstSelect_y]]);
			checkAnimal[firstSelect_x][firstSelect_y] = 1;
			checkAnimal[secondSelect_x][secondSelect_y] = 1;
		} else{
			printf("\n\n 땡!! (틀렸거나, 이미 뒤집힌 카드입니다.)\n");
			printf("%d : %s\n", select1, strAnimal[arrayAnimal[firstSelect_x][firstSelect_y]]);
			printf("%d : %s\n", select2, strAnimal[arrayAnimal[secondSelect_x][secondSelect_y]]);
			printf("\n\n");

			failCount++;
		}

		// 모든 동물을 찾았느지 여부, 1 : 참, 0 : 거짓
		if(foundAllAnimals() == 1){
			printf("\n\n 축하합니다 ! 모든 동물을 다 찾았네요 \n");
			printf("지금까지 총 %d 번 실수하였습니다");
		}
	}

	return 0;
}

void initAnimalArray(){
	for(int i=0; i<4; i++){
		for(int j=0; j<5; j++){
			arrayAnimal[i][j] = -1;
		}
	}
}

void initAnimalName(){
	strAnimal[0] = "해태";
	strAnimal[1] = "봉황";
	strAnimal[2] = "호랑이";
	strAnimal[3] = "사자";
	strAnimal[4] = "갈매기";
	strAnimal[5] = "펭귄";
	strAnimal[6] = "코알라";
	strAnimal[7] = "쥐";
	strAnimal[8] = "닭";
	strAnimal[9] = "두더지";
}

void shuffleAnimal(){
	// ㅁㅁㅁㅁㅁ
	// ㅁㅁㅁㅁㅁ
	// ㅁㅁㅁㅁㅁ
	// ㅁㅁㅁㅁㅁ
	for(int i=0; i<10; i++){
		for(int j=0; j<2; j++){
			int pos = getEmptyPosition();
			int x = conv_pos_x(pos);
			int y = conv_pos_y(pos);

			arrayAnimal[x][y] = i;
		}
	}
}

// 좌표에서 빈 공간 찾기
int getEmptyPosition(){
	while(1){
		int randPos = rand() % 20; // 0 ~ 19 사이의 숫자 반환
		int x = conv_pos_x(randPos);
		int y = conv_pos_y(randPos);

		if(arrayAnimal[x][y] == -1){
			return randPos;
		}
	}
	return 0;
}

int conv_pos_x(int x){
	// 19 -> (3, 4)
	return x / 5;
}

int conv_pos_y(int y){
	// 19 -> 19 / 5 ? 몫은 3, 나머지 4
	return y % 5; // y를 5로 나눈 나머지 
}

void printAnimals(){ // 동물 위치 출력
	// 동작 확인용 코드
	printf("\n동작확인 하십쇼!\n");
	for(int i=0; i<4; i++){
		for(int j=0; j<5; j++){
			printf("%8s", strAnimal[arrayAnimal[i][j]]);
		}
		printf("\n");
	}
	printf("\n ===================== \n\n");
}

void printQuestion(){
	printf("\n\n(문제)\n");
	int seq = 0;

	for(int i=0; i<4; i++){
		for(int j=0; j<5; j++){
			// 카드를 뒤집어서 정답을 맞혔으면 '동물 이름'
			if(checkAnimal[i][j] != 0){
				printf("%8s", strAnimal[arrayAnimal[i][j]]);
			}
			// 아직 뒤집지 못했으면 (정답을 못맞혔으면) 뒷면 -> 위치를 나타내는 숫자
			else{
				printf("%8d", seq);
			}
		}
	}
}

int foundAllAnimals(){
	for(int i=0; i<4; i++){
		for(int j=0; j<5; j++){
			if(checkAnimal[i][j] ==0){
				return 0;
			}
		}
	}
	return 1; // 모두 다 찾
}
