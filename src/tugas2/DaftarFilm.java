package tugas2;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas DaftarFilm digunakan untuk menyimpan dan mengelola daftar film.
 */
public class DaftarFilm implements DaftarFilmm {
    private List<Film> filmList = new ArrayList<>();

    /**
     * Menambahkan sebuah film ke dalam daftar film.
     *
     * @param film objek Film yang akan ditambahkan
     */
    @Override
    public void tambahFilm(Film film) {
        filmList.add(film);
    }
    /**
     * lsdk
     */

    /**
     * Menampilkan semua film yang ada dalam daftar.
     */
    @Override
    public void tampilkanDaftarFilm() {
        listFilm();
    }

    /**
     * Menampilkan informasi lengkap dari setiap film dalam daftar.
     */
    private void listFilm() {
        for (Film film : filmList) {
            System.out.println("Judul: " + film.getJudul());
            System.out.println("Genre: " + film.getGenre());
            System.out.println("Tahun Rilis: " + film.getTahunRilis());
            System.out.println("---------------------------");
        }
    }

    /**
     * Mencari dan menampilkan film berdasarkan genre yang diberikan.
     *
     * @param genre genre film yang ingin dicari
     */
    @Override
    public void cariFilmByGenre(String genre) {
        for (Film film : filmList) {
            if (film.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("Judul: " + film.getJudul());
            }
        }
    }

    /**
     * Mencari dan menampilkan film berdasarkan tahun rilis yang diberikan.
     *
     * @param tahun tahun rilis film yang ingin dicari
     */
    @Override
    public void cariFilmByTahun(int tahun) {
        for (Film film : filmList) {
            if (film.getTahunRilis() == tahun) {
                System.out.println("Judul: " + film.getJudul());
            }
        }
    }

    /**
     * Menghitung dan menampilkan jumlah total film dalam daftar.
     */
    public void hitungTotalFilm() {
        System.out.println("Total jumlah film: " + filmList.size());
    }
}
