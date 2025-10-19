plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("Main")
}


repositories {
    mavenCentral()
}

dependencies {
    // 테스트 라이브러리
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}
