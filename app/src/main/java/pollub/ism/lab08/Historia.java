package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "Historia")
public class Historia {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String pozycja;
    public int nowa;
    public int stara;
    public String czas;

    @Override
    public String toString(){
        return pozycja + " " + stara + " -> " + nowa + " " + czas + "\n";
    }

    public Historia(String czas, String pozycja, int stara, int nowa) {
        this.pozycja = pozycja;
        this.nowa = nowa;
        this.stara = stara;
        this.czas = czas;
    }

}
