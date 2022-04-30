package view;

import model.*;

public class main {

    public static void main(String[] args) {
        Calcado c = CalcadoBuilder.builder()
                .addCalcado(35, CalcadoTipo.TENIS)
                .addProduto("ROSA", 33.5f)
                .get();
        System.out.println(c);

        Camiseta a = CamisetaBuilder.builder()
                .addCamiseta(CamisetaTamanho.PP, "Vans")
                .addProduto("Preto", 33.5f)
                .get();
        System.out.println(a);

        Equipamento e = EquipamentoBuilder.builder()
                .addEquipamento(EquipamentoTipo.SSD, 30.5f, "Sony")
                .addProduto( 33.5f)
                .get();
        System.out.println(e);

        Jogo j = JogoBuilder.builder()
                .addJogo("Crash", JogoTipo.PlayStation)
                .addProduto(1000f)
                .get();
        System.out.println(j);
    }
}
