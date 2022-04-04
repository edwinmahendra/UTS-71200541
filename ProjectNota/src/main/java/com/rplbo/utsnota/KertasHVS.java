package com.rplbo.utsnota;

public class KertasHVS extends Barang {
    private int gram;

    public KertasHVS(String deskripsi, int harga, int berat, String kodeBarang, int gram) {
        super(deskripsi, kodeBarang, harga, berat, String.valueOf(gram));
        this.gram = gram;
    }

    public int getGram() {
        return this.gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}