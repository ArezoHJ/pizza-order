# Pizzabeställning

Ett litet Java-program som modellerar pizzor och beställningar. Programmet visar hur klasser, privata fält, enum, `static`-fält och metoder kan användas för att hantera en enkel beställning och betalning.

## Funktioner

- `Pizza` innehåller pizzans namn och pris.
- `Order` kopplar en pizza till en kund och får ett unikt löpnummer.
- Varje beställning börjar med statusen `NEW` och kan betalas med `pay()`.
- En redan betald beställning kan inte betalas igen.
- Beställningens totalpris består av pizzans pris plus en leveransavgift på 39 kr.
- `Main` skapar en pizza och två beställningar och skriver ut exempel på räknaren, betalningarna och beställningarna.

## Köra programmet

Du behöver Java installerat. Öppna projektet i IntelliJ IDEA och kör `Main`, eller kör från projektets rotmapp i terminalen:

```bash
javac src/*.java
java -cp src Main
```

Exempelprogrammet använder en pizza som kostar 120 kr. Med leveransavgiften blir totalpriset 159 kr. Det andra betalningsförsöket för den redan betalda beställningen avvisas.
