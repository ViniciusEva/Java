var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let T = parseInt(lines.shift());

let valorAtual = 0;

for (let i = 0; i < 1000; i++) {
    console.log(`N[${i}] = ${valorAtual}`);
    
    valorAtual++;
    
    if (valorAtual === T) {
        valorAtual = 0;
    }
}