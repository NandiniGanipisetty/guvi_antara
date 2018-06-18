#include<stdio.h>
void main()
{
	int i=25;
	float *p;
	void *q;
	p=&i;
	q=&i;
	printf("%d %d",p,q);
}
