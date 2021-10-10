package edu.ub.prog2.RuanoEstherTorquetNuria.controlador;


import edu.ub.prog2.RuanoEstherTorquetNuria.model.Audio;
import edu.ub.prog2.RuanoEstherTorquetNuria.model.FitxerReproduible;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
import edu.ub.prog2.utils.ReproductorBasic;
import java.io.File;
import java.io.Serializable;

/**
 * @author Esther Ruano Hortoneda
 * @author Nuria Torquet Luna
 * 
 * Classe per a gestionar la reproducció d'un fitxer. Hereda de ReproductorBasic
 * i utilitza els mètodes ja implementats en la classe mare stop, play, resume,
 * pause... 
 */
 public class Reproductor extends ReproductorBasic implements Serializable {
    
     /**
      * Constructor de la classe, passem per paràmetres un objecte EscoltadorReproduccio
      * per assignar el nostre attribut i passem el path del VLC a la classe mare.
      * @param e 
      */
     public Reproductor(EscoltadorReproduccioBasic e) {
        super(e);
    }

    
    
    /**
     * Crida al metode de ReproductorBasic que reprodueix un fitxer. Aquest llenca
     * una AplicacioException i, per tant, reprodueix() també.
     * 
     * @param fitxer
     * @throws edu.ub.prog2.utils.AplicacioException
     */
    public void reprodueix(FitxerReproduible fitxer) throws AplicacioException {
        super.play(fitxer);
    }
    
    /**
     * Crida al metode de ReproductorBasic que reprodueix dos fitxers. Aquest llenca
     * una AplicacioException i, per tant, reprodueix() també.
     * Com que Audio hereda de File, no cal fer un cast explícit a l'hora de cridar 
     * el mètode.
     * @param audio
     * @param fitxerImatge
      * @throws edu.ub.prog2.utils.AplicacioException
      */
     public void reprodueix(Audio audio, File fitxerImatge) throws AplicacioException {
         super.play(audio, fitxerImatge);
    }
    
    


    
}
