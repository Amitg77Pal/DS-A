#include <stdio.h>

int H[50];
int size = -1;

int parent(int i) { return (i - 1) / 2; }
int leftChild(int i) { return (2 * i) + 1; }
int rightChild(int i) { return (2 * i) + 2; }

void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
}

void shiftUp(int i) {
    while (i > 0 && H[parent(i)] < H[i]) {
        swap(&H[parent(i)], &H[i]);
        i = parent(i);
    }
}

void shiftDown(int i) {
    int maxIndex = i;
    int l = leftChild(i);
    if (l <= size && H[l] > H[maxIndex]) maxIndex = l;
    int r = rightChild(i);
    if (r <= size && H[r] > H[maxIndex]) maxIndex = r;
    if (i != maxIndex) {
        swap(&H[i], &H[maxIndex]);
        shiftDown(maxIndex);
    }
}

void insert(int p) {
    size++;
    H[size] = p;
    shiftUp(size);
}

int extractMax() {
    int res = H[0];
    H[0] = H[size];
    size--;
    shiftDown(0);
    return res;
}

void display() {
    for (int i = 0; i <= size; i++) printf("%d ", H[i]);
    printf("\n");
}

int main() {
    int ch, val;
    while (1) {
        printf("\n1. Insert  2. Extract Max  3. Display  4. Exit\n");
        scanf("%d", &ch);
        switch (ch) {
            case 1: 
                printf("Enter value: ");
                scanf("%d", &val);
                insert(val);
                break;
            case 2: 
                if (size >= 0)
                    printf("Max = %d\n", extractMax());
                else
                    printf("Heap is empty\n");
                break;
            case 3: 
                printf("Heap: ");
                display();
                break;
            case 4: return 0;
            default: printf("Invalid choice\n");
        }
    }
}

