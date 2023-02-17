import java.util.HashMap;
import java.util.Map;

public class Palace {
    private int Castle;
    private int Principality;
    private String name;
    private String owner;

    public Palace(int Castle, int Principality, String name, String owner) {
        this.Castle = Castle;
        this.Principality = Principality;
        this.name = name;
        this.owner = owner;
    }

    public Palace(int castle2, int principality2) {
    }

    public Palace(int castle2, int principality2, String name2) {
    }

    public int getCastle() {
        return Castle;
    }

    public int getPrincipality() {
        return Principality;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        if (name == null) {
            return "Atoms";
        } else {
            return "Palace " + name;
        }

    }

    public String toString() {
        return "Palace of Atom has The sum of the castle and principality amount" + " " + (Castle + Principality);

    }

    public boolean LargePalace() {
        if (Castle > 5 && Principality > 8) {
            return true;
        } else {
            return false;
        }

    }

    private static final Map<String, String> CASTLE_OWNERS = new HashMap<>();
    static {
        CASTLE_OWNERS.put("java", "Vachirapon Tosawat");
        CASTLE_OWNERS.put("python", "Natchanon Pongrattananukul");
        CASTLE_OWNERS.put("kotlin", "Nanthaphong Khongyut");
        CASTLE_OWNERS.put("swift", "Thadaphong Kesornprom");
        CASTLE_OWNERS.put("ruby", "Puwanasul Klanhun");
    }

    public boolean isyourCastle() {
        String expectedOwner = CASTLE_OWNERS.get(name);
        return expectedOwner != null && expectedOwner.equalsIgnoreCase(owner);
    }
}
