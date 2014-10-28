### summary

```
ScalaClass
    + protected foo
  Trait
    + use foo  // OK
  
JavaClass (jar)
    + protected foo
  Trait
    + use foo  // java.lang.IllegalAccessError
  
```

### run

```
sbt run
[info] Set current project to inherit protected field in scala and java (in build file:/home/maiha/git/maiha/scala-inherit/)
[info] Running Main
List()
[error] (run-main-0) java.lang.IllegalAccessError: tried to access field org.apache.commons.mail.Email.toList from class JavaTrait$class
java.lang.IllegalAccessError: tried to access field org.apache.commons.mail.Email.toList from class JavaTrait$class
        at JavaTrait$class.getList(Main.scala:18)
        at JavaChild.getList(Main.scala:22)
        at Main$.main(Main.scala:29)
        at Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:606)
```
