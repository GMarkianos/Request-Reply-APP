Στο πρόγραμμα υλοποιούνται έξι κλάσεις:
1.Account)
Αντιπροσωπεύει έναν χρήστη και αποτελείται από το ψευδώνυμο, 
τον μοναδικό αριθμό του και τα εισερχόμενα μηνύματα του.Επίσης, το αρχείο
περιέχει setters & getters.
2.Message)
Η κλάση αυτή αντιπροσωπεύει ένα μήνυμα.Περιέχει τον μοναδικό κωδικό του μυνήματος,
τον αποστολέα, τον παραλήπτη, το αν έχει διαβαστεί και τους Setters
& getters.
3.Interface)
Αυτή η κλάση είναι ο συνδετικός κρίκος μεταξύ του client και του server.
Περιέχει τις λειτουργίες που μοιράζονται οι δυο κλάσεις του Server και του Client.
4.Client)
Η κλάση client είναι υπεύθυνη να δέχεται την είσοδο του χρήστη και να
τη μετατρέπει στην κατάλληλη μορφή ώστε ο MessagingServer μέσω του Interface
να μπορέσει να εκτελέσει την εντολή του χρήστη.
5.Server)
Η μόνη δουλειά αυτής της κλάσης είναι να δημιουργεί τον Server στην πύλη
όπου θα δεχθεί ως παράμετρο και έπειτα να ενημερώνει τον χρήστη πως ο Server
είναι έτοιμος.
6.MessagingServer)
Η κλάση αυτή περιέχει όλες τις υλοποιήσεις των συναρτήσεων και τρεις σημαντικές μεταβλητές
Τη message_id που αναθέτει στο κάθε μήνυμα ξεχωριστά, τον μοναδικό κωδικό που λαμβάνουν
οι χρήστες κατά την εγγραφή τους authToken όπως και μια συνάρτηση ταυτοποίησης του
και τέλος τη λίστα με όλους του εγγραμμένους χρήστες της εφαρμογής.

Έχω τρέξει όλα τα τέστ και με τα source files και με τα jars, όλα δουλεύουν όπως πρέπει.