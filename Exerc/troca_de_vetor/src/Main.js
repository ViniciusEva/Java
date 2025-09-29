var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let N = [];

// Lê os 20 valores e armazena no vetor
for (let i = 0; i < 20; i++) {
    N.push(parseInt(lines.shift()));
}

// Imprime o vetor em ordem inversa
for (let i = 19; i >= 0; i--) {
    console.log(`N[${19 - i}] = ${N[i]}`);
}