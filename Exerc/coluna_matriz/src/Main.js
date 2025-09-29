var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let C = parseInt(lines.shift());
let T = lines.shift();

let soma = 0.0;
let contador = 0;

for (let i = 0; i < 12; i++) {
    for (let j = 0; j < 12; j++) {
        let valor = parseFloat(lines.shift());
        if (j === C) {
            soma += valor;
            contador++;
        }
    }
}

if (T === 'S') {
    console.log(soma.toFixed(1));
} else if (T === 'M') {
    console.log((soma / contador).toFixed(1));
}