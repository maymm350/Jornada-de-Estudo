public class Guerreiro {
    public String nome;
    public int vidaAtual;
    public int forca;
    public boolean estaDefendendo;

    public Guerreiro(String nomeDoHeroi, int vidaInicial, int forcaInicial) {
        this.nome = nomeDoHeroi;
        this.vidaAtual = vidaInicial;
        this.forca = Math.min(forcaInicial, 100); // Garante que a força não passe de 100
        this.estaDefendendo = false; // Começa o jogo sem escudo erguido
    }

    public void atacar(Guerreiro alvo) {
        if (alvo.estaDefendendo) {
            int danoReduzido = this.forca / 2;
            alvo.vidaAtual -= danoReduzido;
            System.out.println(alvo.nome + " defendeu! O dano de " + this.nome + " foi reduzido para " + danoReduzido + "!");
            alvo.estaDefendendo = false; // O escudo quebra após o impacto do ataque
        } else {
            alvo.vidaAtual -= this.forca;
            System.out.println(this.nome + " atacou " + alvo.nome + " e causou " + this.forca + " de dano!");
        }
    }

    public void defender() {
        this.estaDefendendo = true;
        System.out.println(this.nome + " ergueu o escudo para se defender!");
    }

    public void curar() {
        if (this.vidaAtual >= 100) {
            System.out.println("A vida de " + this.nome + " já está no máximo!");
        } else {
            this.vidaAtual += 30;
            if (this.vidaAtual > 100) {
                this.vidaAtual = 100; // Trava o limite da vida em 100
            }
            System.out.println(this.nome + " curou 30 de vida! Vida atual: " + this.vidaAtual);
        }
    }

    public static void main(String[] args) {
        // Teste rápido do sistema de combate
        Guerreiro heroi = new Guerreiro("Aragon", 100, 40);
        Guerreiro orc = new Guerreiro("Orc Brutamontes", 80, 20);

        System.out.println("--- Início do Combate ---");
        heroi.atacar(orc);
        orc.defender();
        heroi.atacar(orc);
        orc.curar();
        System.out.println("--- Fim do Combate ---");
    }
}
