plugins {
    java
}

group = "com.proximyst"
version = "0.1.0"

repositories {
    maven {
        name = "sonatype"
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")

        content {
            includeGroup("net.md-5")
        }
    }

    jcenter()
    mavenCentral()
}

dependencies {
    compileOnly("net.md-5:bungeecord-api:1.15-SNAPSHOT")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = sourceCompatibility
}