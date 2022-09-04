Realizzazione di un applicativo per la gestione delle prenotazioni delle postazioni aziendali.

Ogni [postazione] è identificata da un codice univoco, una descrizione, un tipo (PRIVATO, OPENSPACE, SALA RIUNIONI), un numero massimo di occupanti e un edificio.

L'[edificio] ha un nome, un indirizzo e una città.

Una postazione può essere prenotata da un [utente], che è identificato da uno username, un nome completo ed una email. La [prenotazione] vale per un solo giorno e può essere effettuata solo se quel giorno la postazione risulta libera. Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse.

Un utente può avere più prenotazioni in corso, ma non può prenotare più di una postazione per una particolare data.

1) Modelli
   - Postazione
     - Codice univoco
     - descrizione
     - tipo
     - numero massimo occupanti
     - edificio
   - Edificio
     - nome
     - indirizzo
   - Indirizzo
     - Città 
     - Via
     - CAP
   - Utente
     - username
     - nome completo
     - email
   - Prenotazione
     - utente
     - postazione
     - data
2) Operazioni
   - Effettuare una prenotazione (controlli su disponibilità e prenotazioni multiple)
   - Cercare postazioni indicando Tipo e Città
