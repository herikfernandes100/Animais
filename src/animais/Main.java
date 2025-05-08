package animais;
public class Main {
    public static void main(String[] args) {
        
        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();
        
        mamifero1.setPeso(85.3f);
        mamifero1.setIdade(2);
        mamifero1.setMembros(4);
        mamifero1.locomover(); // Correndo
        mamifero1.alimentar(); // Mamando
        mamifero1.emitirSom(); // Som de mamífero
        
        peixe1.setPeso(0.35f);
        peixe1.setIdade(1);
        peixe1.setMembros(0);
        peixe1.locomover(); // Nadando
        peixe1.alimentar(); // Comendo substâncias
        peixe1.emitirSom(); // Peixe não emite som
        peixe1.soltarBolha();
        
        ave1.setPeso(0.89f);
        ave1.setIdade(2);
        ave1.setMembros(2);
        ave1.locomover(); // Voando
        ave1.alimentar(); // Comendo frutas
        ave1.emitirSom(); // Som de ave
        ave1.fazerNinho();
        
        Canguru canguro1 = new Canguru();
        Cachorro cachorro1 = new Cachorro();
        
        canguro1.setPeso(55.3f);
        canguro1.setIdade(3);
        canguro1.setMembros(4);
        canguro1.locomover();
        canguro1.alimentar();
        canguro1.emitirSom();
        canguro1.usarBolsa();
        
                
    }
    
}
