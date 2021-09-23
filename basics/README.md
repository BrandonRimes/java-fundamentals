# basics

Composer: Brandon Rimes

[Back](../README.md)

## Java Primitives and Control Flow

## Features

**pluralize**  
A function that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

**flipNHeads**  
A function that accepts an integer n and flips coins until n heads are flipped in a row. Simulates coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Prints out heads or tails on one line for each flip. Prints It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

**clock**  
A method that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. Runs until manually killed with CTRL-C or “stop” button in IDE. Each time is printed once. Detects when the seconds increase and only prints when the timestamp changes.

Single digit numbers are zero-padded as strings, so the timestamp is always the same number of characters.
