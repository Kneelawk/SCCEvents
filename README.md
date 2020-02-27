# SCCEvents
Simple dynamic web page for listing upcoming events at SCC.

## Compiling
This project uses the gradle build system so compiling it is simple.

In order to compile the project on Windows, open a command prompt window in the project's base directory and run:
```
gradlew.bat build
```
or on Mac and Linux, run:
```shell script
./gradlew build
```
This will create a runnable .jar file in the `build/libs` directory.

## Running
In order to run the server, navigate to the `build/libs` directory and run the jar file there in a command prompt.
This looks like:
```
java -jar SCCEvents-x.x.x.jar
```

Once started, open a web browser and go to [http://localhost:8080/](http://localhost:8080/) to see the server running.

The reason we are running the server in a command prompt is so that we can stop it when we want to. In order to stop
the server, press `Ctrl+C` in the command prompt window.
