package br.ibmec.progoo.aplicacoes;

public class ConcatString {
    private String nome;
    private String email;
    private int prazoDias;

    public ConcatString(String nome, String email, int prazoDias) {
        this.nome = nome;
        this.email = email;
        this.prazoDias = prazoDias;
    }

    public String aplicacaoErrada() {
        String mensagem = "Sr./Sra. " + this.nome
            + ", recebemos sua reclamação. Um email de confirmação foi"
            + " enviado para " + this.email + ". Em até " + this.prazoDias
            + " dias estaremos entrando em contato para resolver seu"
            + " problema. Agradecemos o contato.";

        return mensagem;
    }

    public String aplicacaoConcatString() {
        StringBuilder mensagemBuilder = new StringBuilder();

        mensagemBuilder.append("Sr./Sra. ");
        mensagemBuilder.append(this.nome);
        mensagemBuilder.append(", recebemos sua reclamação. Um email de");
        mensagemBuilder.append(" confirmação foi enviado para ");
        mensagemBuilder.append(this.email);
        mensagemBuilder.append(". Em até ");
        mensagemBuilder.append(this.prazoDias);
        mensagemBuilder.append(" dias estaremos entrando em contato para ");
        mensagemBuilder.append("resolver seu problema.");
        mensagemBuilder.append(" Agradecemos o contato.");

        return mensagemBuilder.toString();
    }
}
