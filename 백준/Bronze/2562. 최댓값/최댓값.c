#include <stdio.h>

int main(void){
    int ary[9];
    int max = ary[0];
    int n = 0;
    for(int i = 0; i < 9; i++){
        scanf("%d\n", &ary[i]);
        if(max<ary[i]){
            max = ary[i];
            // 최대값 저장
            n = i + 1;
        }
    }
    printf("%d\n%d", max, n);
    return 0;
}
