var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let lineIndex = 0;
while (true) {
    let N = parseInt(lines[lineIndex++]);
    
    if (isNaN(N) || N === 0) {
        break;
    }
    
    let matriz = [];
    for (let i = 0; i < N; i++) {
        matriz[i] = [];
        for (let j = 0; j < N; j++) {
            matriz[i][j] = Math.abs(i - j) + 1;
        }
    }
    
    // Otimização na impressão
    let resultado = [];
    for (let i = 0; i < N; i++) {
        let linha = [];
        for (let j = 0; j < N; j++) {
            let num = matriz[i][j];
            // Formatação de alinhamento
            if (num < 10) {
                linha.push("  " + num);
            } else if (num < 100) {
                linha.push(" " + num);
            } else {
                linha.push(num);
            }
        }
        resultado.push(linha.join(" "));
    }
    
    console.log(resultado.join("\n") + "\n");
}