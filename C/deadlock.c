#include <stdio.h>
#include <pthread.h>
#include <unistd.h>
void *function1();
void *function2();

pthread_mutex_t first_mutex; // mutex lock
pthread_mutex_t second_mutex;

int main()
{
    pthread_t one, two;

    pthread_mutex_init(&first_mutex, NULL); // initialize the lock
    pthread_mutex_init(&second_mutex, NULL);

    pthread_create(&one, NULL, function1, NULL); // create thread
    pthread_create(&two, NULL, function2, NULL);

    pthread_join(one, NULL); // join thread
    pthread_join(two, NULL);

    printf("Done\n");
}

void *function1()
{
    printf("Thread 1 acquiring mutex 1\n");
    pthread_mutex_lock(&first_mutex); // lock 1st
    printf(">>> Thread 1 acquired mutex 1 \n");

    sleep(1); // do some job

    printf("Thread 1 acquiring mutex 2\n"); // lock 2nd
    pthread_mutex_lock(&second_mutex);
    printf(">>> Thread 1 acquired mutex 2 \n");

    sleep(1); // do some job

    pthread_mutex_unlock(&second_mutex); // release 2nd
    printf("Thread 1 released mutex 2\n");

    pthread_mutex_unlock(&first_mutex);
    printf("Thread 1 released mutex 1\n"); // release 1st
}

void *function2()
{

    printf("Thread 2 acquiring mutex 2 \n"); // lock 2nd
    pthread_mutex_lock(&second_mutex);
    printf(">>> Thread 2 acquired mutex 2 \n");

    sleep(1); // do some job

    printf("Thread 2 acquiring mutex 1 \n"); // lock 1st
    pthread_mutex_lock(&first_mutex);
    printf(">>> Thread 2 acquired mutex 1 \n");

    sleep(1); // do some job

    pthread_mutex_unlock(&first_mutex);
    printf("Thread 2 released mutex 1 \n");

    pthread_mutex_unlock(&second_mutex);
    printf("Thread 2 released mutex 2 \n");
}
