public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa();
    p1.nome = "Israel";
    p1.cpf = "123.456.789-00";
    p1.idade = 21;
    p1.sexo = 'M';

    Pessoa p2 = new Pessoa();
    p2.nome = "Alesssandra";
    p2.cpf = "234.567.890-00";
    p2.idade = 21;
    p2.sexo = 'F';

    Conta c1 = new conta();
    c1.numero = "1234-5";
    c1.titular = p1; // Conta pertencente ao Israel
    c1.saldo = 100.00;
    c1.limite = 200.0;
    
    Conta c2 = new conta();
    c1.numero = "1234-5";
    c1.titular = p2; // Conta pertencente a Alessandra
    c1.saldo = 150.00;
    c1.limite = 200.0;

    System.out.println("A conta " + C1.numero + "pertence a " + c1.titular.nome);

}

