package tugas2;

/**
 * Interface DaftarFilmm mendefinisikan metode yang digunakan untuk
 * mengelola daftar film.
 */
public interface DaftarFilmm {
    /**
     * Menambahkan sebuah film ke dalam daftar film.
     *
     * @param film objek Film yang akan ditambahkan
     */
    void tambahFilm(Film film);

    /**
     * Menampilkan semua film yang ada dalam daftar.
     */
    void tampilkanDaftarFilm();

    /**
     * Mencari film berdasarkan genre yang diberikan.
     *
     * @param genre genre film yang ingin dicari
     */
    void cariFilmByGenre(String genre);

    /**
     * Mencari film berdasarkan tahun rilis yang diberikan.
     *
     * @param tahun tahun rilis film yang ingin dicari
     */
    void cariFilmByTahun(int tahun);
}
