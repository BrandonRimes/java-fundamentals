# java-fundamentals

Composed By: Brandon Rimes  
Version: 1.0.0

## Table of Contents

- Labs:
  - [one](basics/README.md) Basics
  - [two](basiclibrary/lib/src/main/java/basiclibrary/README.md) Libraries
  - [six](inheritance/README.md) Inheritance

## Overview

An exploration of Java basics.  
Primitives, control flow, arrays, loops, testing

## Features

### Lab one

**pluralize**  
A function that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

**flipNHeads**  
A function that accepts an integer n and flips coins until n heads are flipped in a row. Simulates coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Prints out heads or tails on one line for each flip. Prints It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

**clock**  
A method that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. Runs until manually killed with CTRL-C or “stop” button in IDE. Each time is printed once. Detects when the seconds increase and only prints when the timestamp changes.

Single digit numbers are zero-padded as strings, so the timestamp is always the same number of characters.

### Lab two

**roll**  
A method that accepts an integer n and rolls a six-sided dice n times. Returns an array containing the values of the rolls.

**containsDuplicates**  
A method that returns true or false depending on whether the array contains duplicate values.

**calculateAverage**  
A method that accepts an array of integers and calculates and returns the average of all the values in the array.

**lowestAverage**  
Given an array of arrays, calculates the average value for each array and returns the array with the lowest average.

### Lab three

**weatherMap**  
Iterates through the given weather data to find the min and max values. Uses a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterates from the min temp to the max temp and creates a String containing any temperature not seen during the month. Returns that String.

**voteMap**  
A function that accepts a List of Strings representing votes and returns one string to show what got the most votes.
