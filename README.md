# ✨ ScratchIt - API
This repository only serves the point of providing access to the method signatures of ScratchIt's Java API.<br>
**This repository does NOT contain the source code of ScratchIt, to test and use this, you will still require a copy of [ScratchIt](https://www.spigotmc.org/resources/92055/)!**<br>

<hr>
<h3 align="center">
<a href="https://ScratchIt.devs.beer/developers/java-api">☕ Java documentation</a>
</h3>
<hr> 

## 📦 Packages
You can find an overview of all packages here:<br>
https://github.com/LoneDev6/API-ScratchIt/packages/

Alternatively you can directly reference this library using [Maven](#developer-reference-maven) or [Gradle](#developer-reference-gradle) by following the instructions outlined below.

### Table of contents
* [Developer reference (Maven)](#developer-reference-maven)
    1. [via `jitpack.io`](#1-via-jitpackio)
    2. [via `maven.pkg.github.com`](#2-via-mavenpkggithubcom-requires-authentication)
* [Developer reference (Gradle)](#developer-reference-gradle)
    1. [via `maven.pkg.github.com`](#1-via-mavenpkggithubcom-requires-authentication-1)
    2. [via `jitpack.io`](#2-via-jitpackio-1)

## Developer reference (Maven)
To build your project against this library, simply include one of the following references in your `pom.xml`:

### 1. via `jitpack.io`
Add this to your **&lt;repositories&gt;** section:
```xml
<repository>
    <id>jitpack-repo</id>
    <url>https://jitpack.io</url>
</repository>
```

In your **&lt;dependencies&gt;** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ScratchIt/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>com.github.LoneDev6</groupId>
    <artifactId>api-ScratchIt</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

### 2. via `maven.pkg.github.com` (requires authentication)

Add this to your **&lt;repositories&gt;** section:
```xml
<repository>
    <id>ScratchIt-repo</id>
    <url>https://maven.pkg.github.com/LoneDev6/API-ScratchIt</url>
</repository>
```

In your **&lt;dependencies&gt;** section (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ScratchIt/packages?ecosystem=maven) of this package):
```xml
<dependency>
    <groupId>dev.lone</groupId>
    <artifactId>api-ScratchIt</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

Note here that the GitHub package repository requires authentication! ([Read more](https://docs.github.com/en/free-pro-team@latest/packages/guides/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages))<br>
Alternatively, you can also include the dependency using [jitpack.io](https://jitpack.io/#LoneDev6/API-ScratchIt).

## Developer reference (Gradle)

### 1. via `maven.pkg.github.com` (requires authentication)
Repository:
```
repositories {
    maven {
        url 'https://maven.pkg.github.com/LoneDev6/API-ScratchIt'
    }
}
```

Artifact (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ScratchIt/packages?ecosystem=maven) of this package):
```
dependencies {
    implementation 'dev.lone:api-ScratchIt:VERSION'
}
```

Note here that the GitHub package repository requires authentication! ([Read more](https://docs.github.com/en/free-pro-team@latest/packages/guides/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages))<br>
Alternatively, you can also include the dependency using [jitpack.io](https://jitpack.io/#LoneDev6/API-ScratchIt).

### 2. via `jitpack.io`
Repository:
```
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

Artifact (Replace `VERSION` with the [latest release](https://github.com/LoneDev6/API-ScratchIt/packages?ecosystem=maven) of this package):
```
dependencies {
    implementation 'com.github.LoneDev6:API-ScratchIt:VERSION'
}
```