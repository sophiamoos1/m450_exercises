# Aufgabe 2: Black Box Testing

## Beschreibung

Unsere Aufgabe war es die 10 wichtigsten Testfälle einer Autovermietungswebseite zu dokumentieren.

Also haben wir uns für die Webseite von Hertz entschieden:
https://www.hertz.ch/rentacar/reservation/

## Vorgehensweise

Wir haben uns auf den Vermietungsprozess fokussiert und haben diesen soweit getestet, wie es uns möglich war (bevor man Kreditkartennummern angeben musste).

Dabei haben wir vorallem die Eingabe getestet; was passiert wenn valide Daten angegeben werden und was passiert, wenn fälschliche Daten angegeben werden.

## Zu beachten

- Die Testfälle sind voneinander abhängig, um einen einzelnen Testfall zu prüfen, müssen die Schritte, der vorgängigen positiven Testfälle durchgeführt werden.

| ID       | Beschreibung                                                                                                                                                                                               | Schritte                                                                                                                                                                     | Erwartetes Resultat                                                                                              | Eigentliches Resultat     | Status          |
| -------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ------------------------- | --------------- |
| Hertz_1  | Vermietungsangaben werden korrekt eingegeben                                                                                                                                                               | 1. Auf den Vermietungsprozess navigieren: https://www.hertz.ch/rentacar/reservation/ 2. Gültige Daten, Uhrzeiten und einen gültigen Standort angeben 3. Auf 'weiter' klicken | Die Anfrage wird bearbeitet und er/sie wird weitergeleitet                                                       | Übereinstimmend           | **Erfolgreich** |
| Hertz_2  | Vermietungsangaben werden fälschlich angegeben                                                                                                                                                             | 1. Auf den Vermietungsprozess navigieren: https://www.hertz.ch/rentacar/reservation/ 2. Ungültigen Standort eingeben 3. Auf 'weiter' klicken                                 | Es wird nach der Eingabe darauf hingewiesen, die Eingabe zu prüfen                                               | Übereinstimmend           | **Erfolgreich** |
| Hertz_3  | Auf dem zweiten Schritt des Vermietungsprozesses werden gültige und genaue Standortangaben eingegeben                                                                                                      | 1. Gültige Adresse eingeben 2. Auf 'weiter' klicken                                                                                                                          | Die Anfrage wird bearbeitet und er/sie wird weitergeleitet                                                       | Übereinstimmend           | **Erfolgreich** |
| Hertz_4  | Auf dem zweiten Schritt des Vermietungsprozesses werden ungültige Standortangaben eingegeben                                                                                                               | 1. Ungültige Adresse eingeben                                                                                                                                                | EEs wird nach der Eingabe darauf hingewiesen, die Eingabe zu prüfen                                              | Übereinstimmend           | **Erfolgreich** |
| Hertz_5  | Auf dem dritten Schritt des Mietprozesses wird eine Übersicht der Mietwagen angezeigt, welche beim anwählen, eine Detailansicht bekommen                                                                   | 1. Mietwagen auswählen                                                                                                                                                       | Details werden angezeigt und es besteht die Möglichkeit den Mietwagen auszuwählen                                | Übereinstimmend           | **Erfolgreich** |
| Hertz_6  | Auf dem vierten Schritt des Mietprozesses wird eine Übersicht von Versicherungen geziegt, welche auswählbar sind. Dabei soll es aber möglich sein, ohne eine Auswahl auf den nächsten Schritt zu gelangen. | 1. Einen Mietwagen aus dem dritten Schritt auswählen und auf ' weiter' klicken 2. Auf dem vierten Schritt keine Auswahl tätigen und auf 'weiter' klicken                     | Er/Sie wird weitergeleitet                                                                                       | Übereinstimmend           | **Erfolgreich** |
| Hertz_7  | Auf dem vierten Schritt des Mietprozesses wird eine Übersicht von Versicherungen geziegt, welche auswählbar sind.                                                                                          | 1. Einen Mietwagen aus dem dritten Schritt auswählen und auf ' weiter' klicken 2. Eine oder mehrere Versicherungen auswählen 3. Auf 'weiter' klicken                         | Der Preis wird neu berechnet und er/sie wird weitergeleitet                                                      | Übereinstimmend           | **Erfolgreich** |
| Hertz_8  | Auf dem fünften Schritt des Mietprozesses werden genauere Kundenangaben verlangt und eine Unterschrift, um den Mietvertrag definitiv zu bestätigen                                                         | 1. Angaben korrekt eingeben (Name, Vorname, Adresse, Kreditkartennummer) 2. Unterschrift abgeben 3. Auf 'bestätigen' klicken                                                 | Es wird auf die Mietbedingungen hingewiesen, die Bestellung wird aufgegeben und eine Erfolgsnachricht taucht auf | Nur Eingaben sind testbar | **Unbestimmt**  |
| Hertz_9  | Auf dem fünften Schritt des Mietprozesses werden genauere Kundenangaben verlangt und eine Unterschrift, um den Mietvertrag definitiv zu bestätigen. Bei ungültigen Angaben wird darauf hingewiesen         | 1. Personalien ausfüllen 2. Kredikartennummer mit aufeinanderfolgenden 0's angeben                                                                                           | Es wird auf die falsche Kreditkartennummer hingewisen                                                            | Übereinstimmend           | **Erfolgreich** |
| Hertz_10 | Es wird in mitten des Prozesses unterbrochen                                                                                                                                                               | 1. Auf irgendeinen Schritt im Mietprozess navigieren (bestenfalls nicht den ersten Schritt) 2. Den Prozess unterbrechen                                                      | Die Homeseite wird angezeigt                                                                                     | Übereinstimmend           | **Erfolgreich** |