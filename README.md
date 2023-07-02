## About
**Cricket** is a lightweight Java library designed to enhance and simplify the
usage of the native Java logger. It provides additional features and
functionalities that make logging in Java applications more efficient and
convenient.

Please note that the library will **only be developed** when one of my own
projects requires the introduction of new features to the library. This means
that updates and enhancements to the library will be driven by the specific
needs and requirements of my projects.

## Adding to your build
If you are using [Gradle](https://gradle.org/) to build your application just
copy and paste the code below.

```groovy
repositories {
  maven {
    url = "https://jitpack.io/"
  }
}

dependencies {
  implementation("com.github.kvdpxne:cricket:master-SNAPSHOT")
}
```