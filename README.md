[![Gitpod ready-to-code](https://img.shields.io/badge/gitpod-ready_to_code-blue?logo=gitpod&style=flat-square)](https://gitpod.io/#https://github.com/mpetuska/khakra)
[![Slack chat](https://img.shields.io/badge/kotlinlang-%23khakra-B37700?logo=slack&style=flat-square)](https://kotlinlang.slack.com/messages/khakra)
[![Version maven-central](https://img.shields.io/maven-central/v/io.github.mpetuska/khakra?logo=apache-maven&style=flat-square)](https://mvnrepository.com/artifact/io.github.mpetuska/khakra)
[![Version kotlin](https://img.shields.io/badge/kotlin-1.4.30-orange?logo=kotlin&style=flat-square)](https://github.com/JetBrains/kotlin/releases/tag/v1.4.30)
[![Version react](https://img.shields.io/badge/react-17.0.1-orange?logo=react&style=flat-square)](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react/17.0.1-pre.144-kotlin-1.4.30)
[![Version chakra](https://img.shields.io/badge/chakra--ui-1.3.2-orange?logo=chakra-ui&style=flat-square)](https://github.com/chakra-ui/chakra-ui/tree/%40chakra-ui/react%401.3.2)

# KHAKRA (WIP)

Kotlin React bindings for [ChakraUI](https://github.com/chakra-ui/chakra-ui/tree/%40chakra-ui/react%401.3.2)

## Using

The API is for the most part identical to the JS version, so have a look at official docs for each component's usage
samples.

### DSL

In addition to that, each component has a dedicated builder DSL taking two optional parameters - props builder lambda
and child layout builder lambda. These DSLs are also marked with `@DslMarker` (named `@KhakraDSL`) so IntelliJ should
colour them nicely for you. Sample usage:

```kotlin
fun main() {
  render(document.getElementById("root")) {
    ChakraProvider {
      Image({
        src = "https://bit.ly/2Z4KKcF"
        alt = "Rear view of modern home with pool"
      })
      Box({
        `as` = "button"
        borderRadius = "md"
        bg = "tomato"
        color = "white"
        px = 4
        h = 8
      }) {
        +"Button"
      }
    }
  }
}
```

### Utilities

If you encounter some missing properties, please report them via github issue. However, to avoid blocking your flows,
the library provides `get` and `set` operator extensions on `Any` type. This allows you to set and get any property on
any object.
> NOTE: This is completely unsafe, so make sure you know what you're doing!

```kotlin
fun RBuilder.Example() {
  Image({
    src = "https://bit.ly/2Z4KKcF" // Known property
    
    this["nonExistingProperty"] = 69 // <--------------------------------
    this["anotherNonExisting"] = this["nonExistingProperty"] // <--------
    val retrieved: Int = this["nonExistingProperty"] // Autocasted to Int
    println(this["nonExistingProperty"]) // 69
    println(this["nonExistingProperty"] == this["anotherNonExisting"]) // true
  })
}
```

## Implementation Progress
The bellow is a tracker list of chakra-ui modules that are being or have been ported.
- [X] accordion
- [X] alert
- [X] breadcrumb
- [X] button
- [X] checkbox
- [X] clickable
- [X] close-button
- [X] color-mode
- [X] control-box
- [X] counter
- [X] css-reset
- [ ] descendant
- [ ] editable
- [ ] focus-lock
- [ ] form-control
- [ ] hooks
- [X] icon
- [x] icons
- [X] image
- [X] images
- [ ] input
- [X] layout
- [ ] live-region
- [ ] media-query
- [ ] menu
- [ ] modal
- [ ] number-input
- [ ] pin-input
- [ ] popover
- [ ] popper
- [ ] portal
- [ ] progress
- [ ] radio
- [X] react
- [ ] select
- [ ] skeleton
- [ ] skip-nav
- [X] slider
- [X] spinner
- [ ] stat
- [ ] styled-system
- [X] switch
- [ ] system
- [ ] table
- [X] tabs
- [ ] tag
- [ ] test-utils
- [ ] textarea
- [ ] theme
- [ ] theme-tools
- [ ] toast
- [ ] tooltip
- [ ] transition
- [ ] utils
- [ ] visually-hidden

## Getting Help
If you get stuck or have some general feedback/suggestions, you have three options to proceed:
1. Post your issue in **[GitHub Discussions](https://github.com/mpetuska/khakra/discussions)**
2. Raise a **[GitHub Issue](https://github.com/mpetuska/khakra/issues)**
3. Post a message in **[#khakra](https://kotlinlang.slack.com/messages/khakra)** Slack channel

## Developing

Run the sandbox to get components rendered:

```bash
./gradlew sandbox:browserDevelopmentRun -t
```

Publish to your local maven repository:

```bash
./gradlew lib:publishToMavenLocal
```
