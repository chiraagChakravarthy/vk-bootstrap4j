# Exporting the vk-bootstrap4j Library

This document provides instructions on how to build the `vk-bootstrap4j` library and locate the resulting JAR file.

## Building the Library

To build the library, you need to have Apache Maven installed. Navigate to the `vk-bootstrap` directory and run the following command:

```bash
mvn clean install
```

This command will compile the source code, run any tests, and package the library into a JAR file. It will also install the library into your local Maven repository.

## Locating the JAR File

After the build process is complete, the generated JAR files will be located in the `vk-bootstrap/target/` directory.

You will find three main files:

*   `vk-bootstrap4j-1.0-SNAPSHOT.jar`: This is the main library JAR file containing the compiled classes. This is the file you should add to the classpath of your projects.
*   `vk-bootstrap4j-1.0-SNAPSHOT-sources.jar`: This JAR contains the Java source code of the library. It is useful for debugging and for IDEs to provide documentation and allow navigating to the source code.
*   `vk-bootstrap4j-1.0-SNAPSHOT-javadoc.jar`: This JAR contains the generated Javadoc for the library.

To use the library in another project, copy `vk-bootstrap4j-1.0-SNAPSHOT.jar` and add it as a dependency.
