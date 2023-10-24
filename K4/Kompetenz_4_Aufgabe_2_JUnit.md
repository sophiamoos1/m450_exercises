# JUnit-Features und Anwendungsbeispiele

JUnit ist ein Java-Framework für das Testen von Java-Anwendungen. Es bietet verschiedene Funktionen zum Schreiben und Ausführen von Tests.

## 1. Testannotationen

JUnit verwendet Annotationen, um Testmethoden zu kennzeichnen. 

- `@Test`: Diese Annotation kennzeichnet eine Methode als Test. Beispiel:

  ```java
  @Test
  public void testAddition() {
      // Testcode für die Additionsfunktion
  }

- `@Before`: Diese Annotation kennzeichnet eine Methode, die vor jedem Test ausgeführt wird. Beispiel:
   ```java 
    @Before
    public void setUp() {
        // Initialisierung vor jedem Test
    }

## 2. Assertions

JUnit bietet Assertions, um festzustellen, ob bestimmte Bedingungen erfüllt sind. Beispiel:

- `assertEquals`: Überprüft, ob zwei Werte gleich sind.

  ```java
    @Test
    public void testAddition() {
    int result = calculator.add(5, 3);
    assertEquals(8, result);
    }

## 3. Wiederholung

JUnit bietet Annotationen, um Tests mit unterschiedlichen Eingaben wiederholen. Beispiel:

- `@ParameterizedTest` : Kennzeichnet eine Testmethode, die mehrere Testfälle mit verschiedenen Eingabeparametern ausführen kann
- `@ValueSource` : Definiert eine Liste von Werten, die an die parametrisierte Testmethode übergeben werden

    ```java
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testMultiplication(int value) {
        int result = calculator.multiply(value, 5);
        assertEquals(value * 5, result);
    }

## 4. Ausnahmen

JUnit bietet die Möglichkeit Exceptions zu erwarten:

- `@Test(expected = EXCEPTION.class)` : Erwartet die angegebene Exception

  ```java
  @Test(expected = ArithmeticException.class)
  public void testDivisionByZero() {
  calculator.divide(10, 0);
  }

## 5. Referenz

- PDF Dokumente in den Unterlagen auf Git
- Die offizielle Webseite von JUnit