/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

/**
 *
 * @author alunoces
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
    ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
    ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");
 
    try {
        meuVideo.adicionar(meuOutroVideo);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
 
    try {
        minhaPasta.adicionar(meuVideo);
        minhaPasta.adicionar(meuOutroVideo);
        minhaPasta.printNomeDoArquivo();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
 
    try {
        System.out.println("\nPesquisando arquivos:");
        minhaPasta.getArquivo(meuVideo.getNomeDoArquivo()).printNomeDoArquivo();
        System.out.println("\nRemover arquivos");
        minhaPasta.remover(meuVideo.getNomeDoArquivo());
        minhaPasta.printNomeDoArquivo();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
}
