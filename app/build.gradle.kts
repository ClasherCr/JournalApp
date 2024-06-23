plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.journalapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.journalapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //noinspection UseTomlInstead
    implementation(platform("com.google.firebase:firebase-bom:33.1.1"))
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-firestore")
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-analytics")
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-auth")
    //noinspection UseTomlInstead
    implementation("com.google.firebase:firebase-storage")
    //noinspection UseTomlInstead
    implementation("com.github.bumptech.glide:glide:4.16.0")
    //noinspection GradleDependency,UseTomlInstead
    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

}


