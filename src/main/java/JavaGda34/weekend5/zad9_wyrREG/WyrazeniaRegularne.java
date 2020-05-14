package JavaGda34.weekend5.zad9_wyrREG;
 /*   1. Przejdź na stronę https://regex101.com
    2. Napisz wyrażenie regularne dla odkrywania wieku osoby z opisu:
        1. Roman, lat 30 studiuje prawo i ćwiczy cross-fit
        2. Antoni, w wieku 101 lat odpoczywa na emeryturze
    3. Napisz wyrażenie regularne dla pobrania kodu pocztowego XX-XXX
    4. Napisz wyrażenie regularne dla pobrania nazwy ulicy:
        1. Mieszkam na ul. Armii Krajowej 15A/8  ‚ul. Armii Krajowej’
        2. Przenoszę się na ul. Dworcowa 1  ‚ul. Dworcowa’
    5. Napisz wyrażenie regularne pobierające datę
        1. Data ur: 11.11.2000  11.11.2000
        2. Data dzisiejsza: 09.01.2017  09.01.2017
    6. Napisz wyrażenie regularne pobierające słowa napisane małymi literami w zakresie a-k tj:
        1. „Bogdan ma dziś kaca”  „kaca”
        2. „Tomasz je pizze”  „je”*/
public class WyrazeniaRegularne {

    //\s\d*\s
    //s\d{2}\S{1}\d{3}

    //\sul.\s\D+ lub \sul.\s\D+|\sul.\s\S\s\D+ gdy mammy ulice z liczba na poczatku

    //:\s\d{2}.\d{2}.\d{4}

    //s[a-k]+\s
}
