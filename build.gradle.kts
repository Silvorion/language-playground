buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }
}

@Suppress("UNUSED_VARIABLE")
tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
