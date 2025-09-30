var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let line of lines) {
    if (line.trim() === '') {
        continue;
    }
    
    let N = parseInt(line);
    
    let matriz = [];
    for (let i = 0; i < N; i++) {
        matriz[i] = [];
        for (let j = 0; j < N; j++) {
            if (i + j === N - 1) { // Diagonal secundária
                matriz[i][j] = 2;
            } else if (i === j) { // Diagonal principal
                matriz[i][j] = 1;
            } else { // Demais elementos
                matriz[i][j] = 3;
            }
        }
    }
    
    // Imprime a matriz
    for (let i = 0; i < N; i++) {
        console.log(matriz[i].join(''));
    }
}