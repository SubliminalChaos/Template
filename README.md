# Template1
This is a basic codebase for a Spigot plugin written in Kotlin and built using Gradle.

## Requirements
- JDK 8+ (Kotlin builds to this target)
- Gradle 6+
- Foundation-5.8.1.jar

## Initial Usage
Clone this repo, and then make the following changes:
- `settings: gradle` Use Java 11 (20210615)
- `plugin.yml` edit the plugin name (optional)

### Additional Notes
- The Spigot version is specified in `build.gradle.kts`
- Follow the conventions of the Gradle `java` plugin
  - Keep all your source code under `src/main/java/`
  - Keep all other assets (e.g. `plugin.yml`) under `src/main/resources`

## Usage
To build a JAR file for use with Spigot, run `gradle shadowJar`. The completed file will be in `build/libs`.

File-Project Structure-Artifacts-Add Empty Jar
    give a name
    set to /data/testserver/plugins
    add plugin.yml and other needed files
