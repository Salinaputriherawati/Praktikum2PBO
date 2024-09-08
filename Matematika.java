// Interface MatematikaDasar
interface MatematikaDasar {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

// Kelas Matematika yang mengimplementasikan interface MatematikaDasar
class Matematika implements MatematikaDasar {
    // Implementasi metode pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Implementasi metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Implementasi metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Implementasi metode pembagian
    public int pembagian(int a, int b) {
        return a / b;
    }
}