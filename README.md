## Kotlin
Kotlin basic examples to help you get started.

## Developer Setup

Use sdkman to manage java versions. Install sdkman by following the instructions [here](https://sdkman.io/install).
You could also enable automatically switching to the correct version of java when you cd into this directory.
This can be configured by updating the config in `~/.sdkman/etc/config` to `sdkman_auto_env=true`
Run the command below to install the configured version of java:

    sdk env install


## Table of Contents

* [Cast](src/main/kotlin/Cast.kt)
* [Class](src/main/kotlin/Class.kt)
  * Access Modifiers on Constructors
    * private -> Same file access
    * protected -> Can't be used
    * public -> Visible to everyone
    * internal - Visible within the same module
  * Secondary Constructor
  * Data Class
  * Constant
* [Collection](src/main/kotlin/Collection.kt)
  * arrayOf
  * intArrayOf
  * Array
  * listOf
  * arrayListOf