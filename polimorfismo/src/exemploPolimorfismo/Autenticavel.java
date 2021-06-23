package exemploPolimorfismo;

//contrato Autenticavel, quem assinar esse contato precisa implementar o método setSenha e autentica
public abstract interface Autenticavel {
    //eliminamos o que era concreto, deixamos só o que é abstrato
    public abstract void setSenha(int senha);
    public abstract boolean autentica (int senha);
}
