#include<stdio.h>
int main()
{
	int n;
	printf("enter the character\n");
	scanf("%c",&n);
	if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U')
	{
		printf("VOWEL");
	}
	else
	{
		printf("CONSONANT");
	}
	return 0;
}
