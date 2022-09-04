## Sistema di gestione prenotazioni con test

### Descrizione

Realizzazione di un applicativo per la gestione delle prenotazioni delle postazioni aziendali.

Ogni [postazione] è identificata da un codice univoco, una descrizione, un tipo (PRIVATO, OPENSPACE, SALA RIUNIONI), un numero massimo di occupanti e un edificio.

L'[edificio] ha un nome, un [indirizzo].

Una postazione può essere prenotata da un [utente], che è identificato da uno username, un nome completo ed una email. La [prenotazione] vale per un solo giorno e può essere effettuata solo se quel giorno la postazione risulta libera. Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse.

Un utente può avere più prenotazioni in corso, ma non può prenotare più di una postazione per una particolare data.

### Analisi

1) Modelli
   - Postazione
     - Codice univoco
     - Descrizione
     - Tipo (Privata, openspace, sala riunioni)
     - Numero massimo occupanti
     - Edificio
   - Edificio
     - Nome
     - Indirizzo
   - Indirizzo
     - Città 
     - Via
     - Provincia
   - Utente
     - Username
     - Nome completo
     - Email
   - Prenotazione
     - Utente
     - Postazione
     - Data
 
2) Operazioni
   - Effettuare una prenotazione
      - controllo su disponibilità postazione
      - controllo su prenotazioni multiple dello stesso utente nella stessa data
   - Cercare postazioni indicando Tipo e Città
