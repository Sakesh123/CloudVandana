function reverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    const result = reversedWords.join(' ');

    return result;
}

// Before executing this code user needs to install prompt-sync package.
//command to install npm package : npm install prompt-sync
const prompt=require("prompt-sync")();
const sentence = prompt("Enter a sentence : ");
console.log(reverseWords(sentence));
