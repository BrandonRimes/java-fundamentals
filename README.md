# java-fundamentals

Composed By: Brandon Rimes  
Version: 1.0.0

## Table of Contents

- Labs:
  - [one](basics/Main.java) Basics
  - [two](basiclibrary/lib/src/main/java/basiclibrary/Library.java) Libraries

## Overview

An exploration of Java basics.  
Primitives, control flow, arrays, loops, testing

## Features

### Lab one

**pluralize**  
A function that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

**flipNHeads**  
A function that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

**clock**  
A method that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

### Lab two

**roll**  
A method that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

**containsDuplicates**  
A method that returns true or false depending on whether the array contains duplicate values.

**calculateAverage**  
A method that accepts an array of integers and calculates and returns the average of all the values in the array.

**lowestAverage**  
Given an array of arrays, calculate the average value for each array and return the array with the lowest average.
