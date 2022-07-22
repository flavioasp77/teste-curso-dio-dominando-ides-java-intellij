package br.com.curso;

import br.com.curso.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato(null, null, null);
        System.out.println(gato);

        Livro livro = new Livro("O Robbit", 300);
        System.out.println(livro);

    }
}

class Livro {
    private String titulo;
    private Integer numeroPaginas;

    public Livro(String titulo, Integer numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(numeroPaginas, livro.numeroPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, numeroPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
