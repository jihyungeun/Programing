#define _CRT_SECURE_NO_WARNINGS // scanf, strcpy, fopen 등을 사용할 때 Warning C4996 Error 로 부터 방지하기 위해
#include<stdio.h> // C 표준 라이브러리 중 하나인 stdio.h 라는 헤더 파일에 선언된 내용을 포함(stdio == standard input output)
#include<string.h> // 문자열을 다루기 위해 string.h 헤더 파일을 포함

// 비밀번호를 입력 받아서
// 맞는 경우? 비밀 문서를 읽어와서 보여주고 극비 문서에 내용을 추가할 수 있도록 해준다.
// 틀린 경우? 경고 메세지를 표시하고 종료한다.

#define MAX 10000 // 소스코드 어디에서나 MAX는 10000이라는 상수 정의

int main() { // main 함수 선언
	char password[20]; // 입력한 비밀번호를 저장하기 위해 배열 선언
	char line[MAX]; // 파일에서 불러온 내용을 저장해줄 배열 선언
	char contents[MAX]; // 사용자가 추가한 내용을 저장해줄 배열 선언
	int i = 0;
	char c; // 비밀번호 입력할 때 키값 확인용
	int choice = 0; // 선택지 확인용

	printf(" ==== 극비 문서가 절대 없는 프로그램입니다. ====\n"); // 극비 문서가 절대 없을법한 내용을 보여줌
	printf("원하시는 활동을 입력해주세요.\n"); // 특정 번호를 입력하면 비밀 문서에 접근할 기회를 주게 할 예정 
	printf("1    2    3    4\n"); // 선택지
	printf(" ==== 입력 : "); // 사용자에게 입력을 하게끔 안내해주는 메시지
	scanf("%d", &choice); // 사용자의 입력값을 choice 변수에 저장

	if (choice == 1) { // 사용자가 1을 입력했다면
		printf("오늘 아침은 뭐먹지\n"); // 의미없는 문장을 출력하고 프로그램 종료
	}
	else if (choice == 2) { // 사용자가 2를 입력했다면
		printf("오늘 점심은 뭐먹지\n"); // 의미없는 문장을 출력하고 프로그램 종료
	}
	else if (choice == 3) { // 사용자가 3을 입력했다면
		printf("오늘 저녁은 뭐먹지\n"); // 의미없는 문장을 출력하고 프로그램 종료
	}
	else if (choice == 4) { // 사용자가 4를 입력했다면
		printf("이제 더 쓸만한 것도 없네\n"); // 의미없는 문장을 출력하고 프로그램 종료
	}
	else if (choice == 777) { // 사용자가 777을 입력했다면
		while (1) {
			c = getch(); // 한 글자 씩 받아서 c에 저장
			if (c == 13) { // Enter 입력 시
				password[i] = '\0';
				break;
			}
			else { // Password 입력 중
				printf("*");
				password[i] = c;
			}
			i++;
		}

		printf("\n\n\n ==== 비밀번호 확인중 ==== \n\n"); // 비밀번호가 올바른지 확인 중이라는 안내 문장을 출력

		if (strcmp(password, "A+wntpdy") == 0) { // 입력한 비밀번호가 올바르다면
			printf(" ==== 비밀번호 확인 ==== \n\n"); // 비밀번호가 확인됐음을 알려주는 문장을 출력

			char* fileName = "D:\\건양대학교\\극비문서.txt"; // 극비문서의 파일 경로
			FILE* file = fopen(fileName, "a+b"); // 파일이 없으면 생성, 있으면 append한다.

			if (file == NULL) { // 파일 경로에 파일이 없다면
				printf(" ==== 등록된 경로에 해당 문서가 없습니다. ==== \n\n"); // 파일이 없다는 것을 안내해주는 문장을 출력
				return 1;
			}

			while (fgets(line, MAX, file) != NULL) {
				printf("%s", line);
			}

			printf("\n\n ==== 추가할 내용이 더 없으면 EXIT를 입력하십시오. ==== \n\n"); // 문서를 저장하고 나오는 방법을 안내해주는 문장을 출력

			while (1) {
				scanf("%[^\n]", contents); // 새 줄(\n)이 나오기 전까지 모두 읽음(한 문장)
				getchar(); // Enter 입력 시 flush 처리

				if (strcmp(contents, "EXIT") == 0) { // "EXIT"를 입력했다면
					printf("극비문서에 내용 추가를 종료합니다."); // 종료
					break;
				}
				fputs(contents, file);
				fputs("\n", file); // Enter를 위에서 무시 처리 하였으므로 임의로 추가
			}
			fclose(file); // 파일닫기
		}
		else { // 비밀번호가 틀렸다면
			printf(" ==== 비밀번호가 틀렸습니다. ===="); // 비밀번호가 틀렸다는걸 알려주고 프로그램 종료
		}
	}
	else { // 사용자가 1, 2, 3, 4, 777 이외의 숫자를 입력했다면
		printf(" ==== 선택지에 없는 숫자 입니다. ====\n"); // 의미없는 문장을 출력하고 프로그램 종료
	}
	system("pause");
	return 0;
}
