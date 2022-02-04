# Trailze Android SDK Demo App
A barebones demo app to get started with the Trailze SDK on Android

## Installation instructions
- Make sure you have your Mapbox and Trailze access keys. You can get your free Trailze key here: https://account.trailze.com.
- Clone this repo.
- Create a `gradle.properties` file with the following settings and fill in your Trailze and Mapbox keys.
```gradle
org.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8
android.useAndroidX=true
kotlin.code.style=official
android.enableJetifier=true
trailze_access_key=ENTER_YOUR_TRAILZE_KEY_HERE
mapbox_access_token=ENTER_YOUR_MAPBOX_KEY_HERE
```
- Build and run the project.

## And... we're done.

Please check out the [Android Integration](https://docs.trailze.com/#integration-android) section in the documentation to see the host of different features you can configure.
