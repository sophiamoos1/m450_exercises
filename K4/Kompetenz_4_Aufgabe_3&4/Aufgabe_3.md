# Banksoftware Analyse des Klassendiagrams

Die Klasse Bank instanziert ein Objekt der Klasse Account und verwendet Methoden der Klasse Account. Dies bedeutet, dass ein Account ohne mindestens eine Instanz der Klasse Bank nicht existieren kann, was auf eine Kompositionsbeziehung hinweist. In anderen Worten ist die Klasse Account von der Klasse Bank abhängig.

Es besteht eine Generalisierung zwischen den Klassen Account und den abgeleiteten Klassen SavingsAccount sowie SalaryAccount. Beide erben Attribute und Methoden von Account, wobei sie die Methoden withdraw() und print() spezifisch für ihre eigenen Bedürfnisse implementieren.

Zusätzlich besteht eine Generalisierung zwischen SavingsAccount und PromoYouthSavingsAccount, wobei PromoYouthSavingsAccount von SavingsAccount erbt und die Methode deposit() für spezifische Anforderungen erweitert.

Die Klasse Booking hat eine Kompositionsbeziehung zu Account, was bedeutet, dass keine Instanz von Booking ohne mindestens eine Instanz von Account existieren kann. Die Klasse Account instanziiert Objekte von Booking und verwendet diese in der Anwendung. Darüber hinaus ruft die abgeleitete Klasse SalaryAccount Methoden von Booking auf, ohne dass sie die Instanziierung selbst durchführen muss. Dies deutet auf eine abhängige Beziehung zwischen den Klassen hin.

Schließlich verwenden sowohl Booking als auch SalaryAccount die Klasse BankUtils.
