#include<stdio.h>

// 비밀번호를 입력 받아서
// 맞는 경우? 비밀 문서를 읽어와서 보여주고 극비 문서에 내용을 추가하거나 수정할 수 있도록 해준다.
// 틀린 경우? 경고 메세지를 표시하고 종료한다.

void password();
void passcheck();

int main(){
	char line[MAX]; // 파일에서 불러온 내용을 저장할 변수
	char writes[MAX]; // 극비 문서에 입력할 내용을 저장할 변수
	char password[20]; // 비밀번호 입력
	char c; // 비밀번호 입력할 때 키값 확인용

	printf(" ==== 극비 문서가 절대 없는 프로그램입니다. ====\n"); // 극비 문서가 절대 없을법한 내용을 보여줌
	printf("원하시는 활동을 입력해주세요.\n"); // 특정 번호를 입력하면 비밀 문서에 접근할 기회를 주게 할 예정
	printf("1    2    3    4\n"); // 선택지
	printf(" ==== 입력 : "); // 사용자에게 입력을 하게끔 안내해주는 메시지

	return 0;
}

password(){
	int i = 0;

	while(1){
		c = getch();
		if(c == 13){ // Enter 입력 시
			password[i] = '\0';
			break;
		} else{ // Password 입력 중
			printf("*");
			password[i] = c;
		}
		i++;
	}
}

passcheck(){
	printf("\n\n\n ==== 비밀번호 확인중 ==== \n\n\n");

	if(strcmp(password, "A+wntpdy") == 0){
		printf(" ==== 비밀번호 확인 ==== \n\n");
		char * fileName = "파일경로 쓰기";
		FILE * file = fopen(fileName, "a+b"); // 파일이 없으면 생성, 있으면 append한다.

		if(FILE = NULL){
			printf(" ==== 등록된 경로에 해당 문서가 없습니다. ==== \n\n");
			return 1;
		}

		while(fgets(line, MAX, file) != NULL){
			printf("%s", line);
		}
		printf("\n\n ==== 수정하거나 추가할 내용이 더 없으면 EXIT를 입력하십시오. ==== \n\n");

		while(1){
			scanf("%[^\n]", contents); // 새 줄(\n)이 나오기 전까지 모두 읽음(한 문장)
			getchar(); // Enter 입력 시 flush 처리
		}

	}



