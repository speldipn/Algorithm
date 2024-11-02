#include <stdio.h>

typedef int NodeType;

struct Node {
    NodeType data;
    struct Node* parent;
    struct Node* child;

};

int main(void) 
{
    printf("exit..\n");
}