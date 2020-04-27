# CovidSrv

Intro
---

This is a *simple* server implementation compatible with the [Stopp Corona App](https://participate.roteskreuz.at/stopp-corona/) by the Austrian Red Cross. So far it is only a prototype (messages are stored in memory and not persisted on disk, logic has not been tested and is most likely not fully correct, the code is still incomplete), but it might be useful for testing the mobile application.

How to start the CovidSrv application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/covidsrv-0.1-SNAPSHOT.jar server`
1. To check that your application is running enter url `http://localhost:8080`

If you test the app with a local HTTP URL (instead of HTTPS) you need to set `android:usesCleartextTraffic` to `true` in the manifest of the Android app.

License
---

You can use this code under the terms of the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).

Author
---

Guenther Starnberger <gst@gst.name>
