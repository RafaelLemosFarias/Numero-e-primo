function Primo(numero) {
  if (numero <= 1) {
    return false;
  }

    for (let i = 2; i <= numero / 2; i++) {
    if (numero % i === 0) {
      return false;
    }
}
  return true;

  const numero = parseInt(prompt("Digite um número inteiro positivo:"));

  if (isNaN(numero)) {
  console.log("Por favor, insira um número válido.");
  } else {
  if (Primo(numero)) {
    console.log(numero + " é primo.");
  } else {
    console.log(numero + " não é primo.");
  }
}
}
