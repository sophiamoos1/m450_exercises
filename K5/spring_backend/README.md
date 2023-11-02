# README #

## Installation
Da ich grosse Probleme damit hatte, den vorgegebenen Code zum laufen zu bringen,
habe ich das Projekt mit Hilfe von anderen umgebaut und so zum laufenn gebracht.
Dafür habe ich Docker und Gradle verwendet, weil wir das so in der Noseryoung immer gemacht haben.
Um das Projekt zum laufen zu bringen, müssen Sie JDK 18 benutzen.

Danach können sie diesen Docker-Command ausführen, dieser wird Ihnen den Container erstellen und
ebenfalls starten:

**Docker command:**
```
docker run --name postgres_db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
```
Danach können sie die Applikation starten. Für das Testing können sie die einzelnen Tests laufen lassen.

