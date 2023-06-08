# TestRapport  
| Projekt namn | tdd-och-mock-Bremmster     |
|--------------|----------------------------|
| Modul namn   | org.campusmolndal.weather  | 
| Skapad av    | Kristian Karlson           | 
| Skapad       | 2023-06-08                 | 
| Reviderad    | 2023-06-08                 | 

## Tester

| Test ID          | Test Beskrivning                                        | Förväntat Resultat          | Verkligt Resultat           | Status      | Kommentarer                |
|------------------|---------------------------------------------------------|-----------------------------|-----------------------------|-------------|----------------------------|
| testCord         | Hämta latitud och longitud från väderrapport            | Returnera double            | Returnerade giltig variabel | Godkänd     | Inget problem identifierat |
| testTemp         | Hämta väderinformation om temperatur                    | Returnera en double         | Returnerade giltig variabel | Godkänd     | Inget problem identifierat |
| testWindSpeed    | Hämta väderinformation om vindhastighet                 | Returnera en double         | Returnerade giltig variabel | Godkänd     | Inget problem identifierat |
| testWeatherArray | Kontrollera att array med väderinformation inte är Null | att Array finns             | Test lyckats                | Godkänd     | Inget problem identifierat |
| testClouds       | Hämta väderinformation ur array                         | returnera en string         | Index out of bounds         | Misslyckat  | Felaktig mappning av array |
| testCity         | Kontrollera att testobjektet har rätt stad              | godkänt test                | Test lyckats                | Godkänd     | Inget problem identifierat |

## Slutsats
Testerna täcker 100% av koden i WeatherService klassen 
![test coverage](/home/kristiank/Documents/Java/Assignments/tdd-och-mock-Bremmster/assets/images/Test coverage Screenshot_20230608_01.png)

Det är rimligt att anta att all information i Json objektet är tillgängligt för programmet med undantag för array Weather. 
Objecktmappern med de klasser för att läsa Json filen fungerar inte korrekt.

Koden ska inte gå i produktion. Åter till utvecklarna.

