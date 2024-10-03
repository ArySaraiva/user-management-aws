document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("form");

    form.addEventListener("submit", (event) => {
        event.preventDefault(); // Impede o envio padrão do formulário
                
        const nome = form.nome.value.trim();
        const idade = form.idade.value.trim();
        const email = form.email.value.trim();
        const senha = form.senha.value.trim();
        const tel = form.tel.value.trim();

        // Validação simples
        if (!nome || !idade || !email || !senha || !tel) {
            alert("Por favor, preencha todos os campos.");
            return;
        }

        // Exibe os dados do cadastro
        alert(`Cadastro realizado com sucesso!\n\nNome: ${nome}\nIdade: ${idade}\nEmail: ${email}\nTelefone: ${tel}`);

        // Limpa os campos do formulário após o envio
        form.reset();
    });
});