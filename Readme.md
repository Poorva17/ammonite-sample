This sample is intended to demonstrate an issue while running a sample ammonite project binary generated using coursier bootstrap process.

Steps to reproduce issue - 
## Publishing artifacts on local-box
```
sbt publishLocal
``` 

## Bootstrapping using coursier
```
./coursier bootstrap -r jitpack --cfa com.github.Poorva17.ammonite-sample:sample_2.12:0.1.0-SNAPSHOT -M example.Main -f -o sample-bootstrap
```

## Running the generated binary executable
Run the executable from the root of the project
```
./ammonite-sample
```

Ammonite app process runs fine if used with git SHA as version for coursier to bootstrap.
e.g. - 
```
./coursier bootstrap -r jitpack --cfa com.github.Poorva17.ammonite-sample:sample_2.12:1d3854c -M example.Main -f -o sample-bootstrap
```
It also works fine when running `sbt run` from the root directory of the project.