** TestRapport ** 2023-06-07 


| Test ID | Test Beskrivning                                        | Förväntat Resultat          | Verkligt Resultat           | Status     | Kommentarer                |
|---------|---------------------------------------------------------|-----------------------------|-----------------------------|------------|----------------------------|
| 1       | Hämta latitud och longitud från väderrapport            | Returnera double            | Returnerade giltig variabel | Godkänd    | Inget problem identifierat |
| 2       | Hämta väderinformation om temperatur                    | Returnera en double         | Returnerade giltig variabel | Godkänd    | Inget problem identifierat |
| 3       | Hämta väderinformation om vindhastighet                 | Returnera en double         | Returnerade giltig variabel | Godkänd    | Inget problem identifierat |
| 4       | Kontrollera att array med väderinformation inte är Null | att Array finns             | Test lyckats                | Godkänd    | Inget problem identifierat |
| 5       | Kontrollera att testobjektet har rätt stad              | godkänt test                | Test lyckats                | Godkänd    | Inget problem identifierat |
| 6       | Hämta väderinformation vid nätverksavbrott              | Returnera ett felmeddelande | -                           | Ej testat  |                            |
| 7       | Hämta väderinformation om molnighet                     | godkänt test                | -                           | Ej testat  |                            |

Skapa en detaljerad testrapport som innehåller en översikt över testerna du har skapat, resultaten av varje test, din bedömning av WeatherService-klassens pålitlighet, 
och eventuella problem eller fel du upptäckte under testningen.