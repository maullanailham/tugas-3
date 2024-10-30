package tugas2;

/**
 * Kelas Film merepresentasikan informasi dasar mengenai sebuah film.
 */
public class Film {
    private String judul;
    private String genre;
    private int tahunRilis;

    /**
     * Konstruktor untuk membuat objek Film.
     *
     * @param infoFilm objek InfoFilm yang berisi informasi film
     */
    public Film(InfoFilm infoFilm) {
        this.judul = infoFilm.judul();
        this.genre = infoFilm.genre();
        this.tahunRilis = infoFilm.tahunRilis();
    }

    /**
     * Mendapatkan judul film.
     *
     * @return judul film
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Mendapatkan genre film.
     *
     * @return genre film
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Mendapatkan tahun rilis film.
     *
     * @return tahun rilis film
     */
    public int getTahunRilis() {
        return tahunRilis;
    }
}
