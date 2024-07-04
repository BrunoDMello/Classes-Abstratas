


public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Bruno");
        pf.setSobrenome("Mello");
        pf.setIdade(28);
        pf.setCpf("095.152.079-24");
        System.out.println(pf.getNome() + " " + pf.getSobrenome() + " tem " + pf.getIdade() + " anos e possui o cpf " + pf.getCpf());

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Brenda");
        pj.setSobrenome("Gomes");
        pj.setIdade(28);
        pj.setCnpj("52.032.497/001-50");
        System.out.println(pj.getNome() + " " + pj.getSobrenome() + " tem " + pj.getIdade() + " anos e possui o cpf " + pj.getCnpj());
    }
}