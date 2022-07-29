// Como podemos melhorar o esse código usando TS? 

//Podemos tipar os dados que estão sendo mostrados no código!
enum profissao {
    Atriz,
    Padeiro
}

type pessoa = {
    nome: string,
    idade: number,
    profissao: profissao
}

let pessoa1: pessoa = {
    nome: "maria",
    idade: 29,
    profissao: profissao.Atriz
};

let pessoa2: pessoa = {
    nome: "roberto",
    idade: 19,
    profissao: profissao.Padeiro
};

let pessoa5: pessoa = {
    nome: "laura",
    idade: 32,
    profissao: profissao.Atriz
};

let pessoa6: pessoa = {
    nome: "carlos",
    idade: 19,
    profissao: profissao.Padeiro
};