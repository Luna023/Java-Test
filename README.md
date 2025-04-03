# ATM Management System & Palindromic Substring Finder

This project consists of two main components:

1. **ATM Management System**: A simple ATM simulation that allows users to check their account balance, deposit money, and withdraw funds.
2. **Longest Palindromic Substring Finder**: A program that finds the longest palindromic substring in a given input string.

---

## Components

### 1. ATM Management System

The ATM system allows users to perform the following operations:

- **Check Balance**: View the current balance of the account.
- **Deposit Money**: Add funds to the account.
- **Withdraw Money**: Withdraw funds from the account (if sufficient balance is available).

#### Classes:
- **ATM**: Manages accounts and facilitates ATM operations.
- **Account**: Represents a user’s account, storing account details like account number, account holder's name, and balance.

#### How to Run:
1. The program starts by creating a new ATM object and adding an account to it.
2. The user can interact with the ATM by choosing from a set of options (check balance, deposit, withdraw).
3. The ATM will prompt the user for the account number and perform the requested operation if the account exists.

---

### 2. Longest Palindromic Substring Finder

This component finds the longest palindromic substring in a given string.

#### How it Works:
1. The user is prompted to input a string.
2. The program checks all possible substrings and identifies the longest palindrome.
3. It returns the longest palindromic substring found.

---

## How to Run

1. **ATM Management System**:
   - Run the `Main` class to simulate the ATM system. You will be prompted with an interface to perform ATM operations.

2. **Longest Palindromic Substring Finder**:
   - Run the `JavaTest2` class. It will ask you to enter a string and output the longest palindromic substring.

---

## Requirements

- Java 8 or higher.
- No additional libraries required.

---


