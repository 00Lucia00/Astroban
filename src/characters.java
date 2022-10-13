
//här listar jag alla karaktärerna/väggarna/osv + gamla kart-ideer
public class characters {

    String cat = color.ANSI_PURPLE + "ᗢ" + color.ANSI_RESET;
    String rat = color.ANSI_RED + "ᕐᐷ" + color.ANSI_RESET;
    String blcube = color.ANSI_BLACK + "ᕐᐷ" + color.ANSI_RESET;
    String bcube = color.ANSI_BLUE + "▄" + color.ANSI_RESET;
    String ccube = color.ANSI_CYAN + "●" + color.ANSI_RESET;
    String pcube = color.ANSI_PURPLE + "▄" + color.ANSI_RESET;
    String wcube = color.ANSI_WHITE + "▄" + color.ANSI_RESET;
    String rcube = color.ANSI_RED + "●" + color.ANSI_RESET;
    String star  = color.ANSI_YELLOW + "★" + color.ANSI_RESET;
    String ccir = color.ANSI_CYAN + "●" + color.ANSI_RESET;;
    String gcir = color.ANSI_GREEN + "●" + color.ANSI_RESET;;
    String wcir = color.ANSI_WHITE + "●" + color.ANSI_RESET;
    String heart = color.ANSI_RED + "♥"  + color.ANSI_RESET;

    public String getCat() {
        return cat;
    }

    public String getRat() {
        return rat;
    }

    public String getBlcube() {
        return blcube;
    }

    public String getBcube() {
        return bcube;
    }

    public String getCcube() {
        return ccube;
    }

    public String getPcube() {
        return pcube;
    }

    public String getWcube() {
        return wcube;
    }

    public String getRcube() {
        return rcube;
    }

    public String getStar() {
        return star;
    }

    public String getCcir() {
        return ccir;
    }

    public String getGcir() {
        return gcir;
    }

    public String getWcir() {
        return wcir;
    }

    public String getHeart() {
        return heart;
    }

    public void symbols(){

    rat = color.ANSI_RED + "ᕐᐷ" + color.ANSI_RESET;
    cat = color.ANSI_PURPLE + "ᗢ" + color.ANSI_RESET;
    blcube = color.ANSI_BLACK + "▄" + color.ANSI_RESET;
    bcube = color.ANSI_BLUE + "▄" + color.ANSI_RESET;
    ccir = color.ANSI_CYAN + "●" + color.ANSI_RESET;
    gcir = color.ANSI_GREEN + "●" + color.ANSI_RESET;
    wcir = color.ANSI_WHITE + "●" + color.ANSI_RESET;
    ccube = color.ANSI_CYAN + "●" + color.ANSI_RESET;
    pcube = color.ANSI_PURPLE + "▄" + color.ANSI_RESET;
    wcube = color.ANSI_WHITE + "▄" + color.ANSI_RESET;
    rcube = color.ANSI_RED + "●" + color.ANSI_RESET;
    star = color.ANSI_YELLOW + "★" + color.ANSI_RESET;
    heart = color.ANSI_RED + "♥"  + color.ANSI_RESET;
}
    private int x;
    private int y;

    private String mapMarker;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getMapMarker() {
        return mapMarker;
    }

    public void setMapMarker(String mapMarker) {
        this.mapMarker = mapMarker;
    }

    public characters(int x, int y, String mapMarker)
    {
        this.x = x;
        this.y = y;
        this.mapMarker = mapMarker;
    }
    public characters(){

    }
}
