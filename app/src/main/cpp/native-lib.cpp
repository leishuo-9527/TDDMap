#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_map_jyuntech_cn_tddmap_Model_TextModel_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++111";
    return env->NewStringUTF(hello.c_str());

}

