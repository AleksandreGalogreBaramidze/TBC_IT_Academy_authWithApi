#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_authwithapi_App_key(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "AIzaSyBTNrq4JbwV9h75REDJ0qNssTVQ_DiVjeQ";
    return env->NewStringUTF(hello.c_str());
}