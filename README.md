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
* [CompleteableFuture](src/main/kotlin/CompletableFuture.kt)
* [Builder](src/main/kotlin/Builder.kt)
* [Map](src/main/kotlin/Map.kt)
* [Equality](src/main/kotlin/Equality.kt)
* [Enum](src/main/kotlin/Enum.kt)
* [Function](src/main/kotlin/Function.kt)
* [When](src/main/kotlin/When.kt)
* [StaticMethod](src/main/kotlin/StaticMethod.kt)
* [Sequence as streams in java](src/main/kotlin/Sequence.kt)
* [Map Filter OrElse](src/main/kotlin/MapFilterOrElse.kt)
* [Type Conversion](src/main/kotlin/TypeConversion.kt)
* [Partition](src/main/kotlin/Partition.kt)
* [Coroutines](src/main/kotlin/Coroutines.kt)
* [Lambda](src/main/kotlin/AnonymousFunctions.kt)
