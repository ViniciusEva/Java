var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let lineIndex = 0;
while (true) {
    let N = parseInt(lines[lineIndex++]);
    if (N === 0) {
        break;
    }
    
    let matriz = [];
    for (let i = 0; i < N; i++) {
        matriz[i] = [];
    }
    
    let valor = 1;
    let inicio = 0;
    let fim = N - 1;
    
    while (inicio <= fim) {
        for (let i = inicio; i <= fim; i++) {
            for (let j = inicio; j <= fim; j++) {
                matriz[i][j] = valor;
            }
        }
        valor++;
        inicio++;
        fim--;
    }
    
    // Formata e imprime a matriz
    for (let i = 0; i < N; i++) {
        let linhaFormatada = "";
        for (let j = 0; j < N; j++) {
            let numStr = matriz[i][j].toString();
            while (numStr.length < 3) {
                numStr = " " + numStr;
            }
            linhaFormatada += numStr;
            if (j < N - 1) {
                linhaFormatada += " ";
            }
        }
        console.log(linhaFormatada);
    }
    console.log();
}