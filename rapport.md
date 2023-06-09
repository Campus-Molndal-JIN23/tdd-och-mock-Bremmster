# Projektrapport: Test-Driven Development (TDD)

## Gruppen
Enskilt arbete
### Ert namn
Kristian Karlson

### Beskrivning av projektet

Mocka API för att skriva enhetstest på kod. 

### Vad ni har gjort
Skapat klasser för att kunna läsa json filer. Mockat ett api för att skapa data. Skapat tester för att kontrollera funktionalitet. 

## Arbetet och dess genomförande

### Vad som varit svårt
Det är lurigaste att läsa data ifrån Json. Det är något som inte riktigt stämmer i mappningen av filen. Vilket är bra då finns det möjlighet att skapa test som misslyckas 

### Beskriv lite olika lösningar du gjort
Mockade api testklassens @Before. Skapar ett riktigt Json Object till testerna. Var lätt att skapa alla tester därefter.
Använder Jackson object-mapper i WeatherService för att plocka ut data ifrån Json.

### Beskriv något som var besvärligt att få till
Mappningen av Json filen har tagit mer tid än skapandet av testerna.
Det var lurigt att skriva tester som inte använder assertEquals, min lösningen är forcerad och mer svårläst. 

### Beskriv om du fått byta lösning och varför i sådana fall
Beslutade mig för att låta test misslyckas som en del av lösningen. 

## Slutsatser
Praktiskt med att mocka Api då kan man utveckla programmet med test driven development och minska antalet förfrågningar till api, det har möjlighet att spara pengar och tid.
Smart kunna testa klasser isolerat från annan kod, det kan effektivisera felsökandet. 
Api som ska anslutas kan vara under utveckling, om det har ett dokumenterat beteende kan man börja koda innan det finns skarpt.
Fördel att all annan kod kan skapas före skarpa API klassen. Även bra att mocka databaser för att undvika att skriva/läsa i produktionsmiljö. 


### Vad gick bra
Uppgiften löst, uppfyller ställda krav och inlämnad i tid. 
### Vad gick dåligt
Läser inte all data i json filen korrekt. 
### Vad har du lärt dig
Skapa och läsa Json. Mocka en hel klass. Mycket reflektioner om test driven utveckling och skillnaden i att skapa testen före koden.

### Vad hade ni gjort annorlunda om ni gjort om projektet
Letat upp ett befintligt Api med beskrivit beteende och Mockat och skapat test på det. Då hade uppgiften mer liknat arbetslivet.
### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Skriva kod och tester som bevisar att koden fungerar i de testade fallen. Möjlighet att mocka kod som har lång körtid för att snabba på utvecklandet. Ger även möjlighet att testa kod mot förutsättningar utanför förväntat beteende. 
Fördelen med att skriva tester innan koden är att det är direkt återkoppling på om lösningen fungerar. 