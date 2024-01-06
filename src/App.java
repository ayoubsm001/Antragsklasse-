
// Github link :https://github.com/ayoubsm001/benutzerclass 


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    private BigDecimal preise;
    private String statue;
    private Date antragssatum;
    private List<Dokument> dokument = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Constructors, getters, and setters for attributes

    public App(BigDecimal preise, String statue, Date antragssatum) {
        this.preise = preise;
        this.statue = statue;
        this.antragssatum = antragssatum;
    }

    public void bearbeitung(Sachbearbeiter sachbearbeiter) {
        // code logik..
    }

    public void zusatzlicheDokumenteFragen(Sachbearbeiter sachbearbeiter) {
        // code logik..
    }

    public void antragGenehmigt() {
        // code logik..
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        // Benachrichtigen Sie Observer über Änderungen im Antrag
    }

    // Inner class für 'Dokument'
    public class Dokument {
        // Attributes, constructors, getters, and setters for Dokument
    }

    //  'Observer' pattern
    public interface Observer {
        void update();
    }

    // Inner class für 'Sachbearbeiter'
    public class Sachbearbeiter {
        // Attributes, constructors, getters, and setters for Sachbearbeiter
    }
}
