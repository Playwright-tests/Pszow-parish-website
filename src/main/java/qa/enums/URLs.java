package qa.enums;

public enum URLs {

    BASE_URL("https://bazylika-pszow.pl/"),
    ANNOUNCEMENTS_PAGE("ogloszenia-duszpasterskie/"),
    INTENTION_PAGE("intencje-mszalne/"),
    FUNERALS_PAGE("pogrzeby/"),
    STEWARDS_PAGE("szafarze/"),
    PRIESTS_PAGE("kaplani/"),
    CONFESSION_PAGE("spowiedz-w-bazylice/"),
    OFFICE_PAGE("kancelaria/"),
    PHOTO_GALLERY("galeria-zdjec/"),
    CONTACT_PAGE("kontakt/"),
    HISTORY_PAGE("historia-parafii/"),
    CALVARY_PAGE("kalwaria-pszowska/"),
    PILGRIMAGES_PAGE("pielgrzymki/"),
    PHOTO_GALLERY_PAGE("galeria-zdjec/"),
    FILM_GALLERY_PAGE("galeria-filmow/"),
    SUPPORT_PAGE("wsparcie-parafii/"),
    CHRISTENING_PAGE("sakramenty/"),
    FIRST_COMMUNION_PAGE("pierwsza-komunia/"),
    CONFIRMATION_PAGE("sakrament-bierzmowania/"),
    MARRIAGE_PAGE("sakrament-malzenstwa/"),
    CARITAS("caritas-i-dzialalnosc-charytatywna/"),
    COUNCIL_PAGE("parafialna-rada-duszpasterska/"),
    ALTAR_BOYS_PAGE("ministranci/"),
    MARYS_CHILDREN_PAGE("dzieci-maryi-2/"),
    OASIS_PAGE("oaza-mlodziezowa/"),
    HOME_CHURCH_PAGE("ruch-domowy-kosciol/"),
    CATECHESIS_PAGE("katecheza-doroslych/"),
    POCO_PAGE("grupa-poco/"),
    LEGION_OF_MARY("legion-maryi/"),
    LIVING_ROSARY_PAGE("bractwo-zywego-rozanca/"),
    MOTHERS_COMMUNITY("wspolnota-matki-milosiernego/"),
    LITANY_PAGE("litania-do-pani-usmiechnietej/"),
    CEMENTERY_REGULATION("regulamin-cmentarza/"),
    DELEGATE_PAGE("delegat-ds-ochrony-dzieci-i-mlodziezy/"),
    ARCHDIOCESE("https://www.archidiecezjakatowicka.pl/"),
    READING("czytania");

    private final String name;

    URLs(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
