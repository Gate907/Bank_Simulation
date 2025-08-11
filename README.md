# Task 5: Bank Account Simulation

## **Objective**
Simulate basic bank operations using **Java OOP** principles.  
This project demonstrates how a simple bank account can handle deposits, withdrawals, balance checks, and transaction history.

---

## **Tools**
- **Java** (Core OOP concepts)
- **VS Code** or any Java-supported IDE
- **Terminal / Command Prompt** for execution

---

## **Deliverables**
A **class-based Java program** that:
- Creates a bank account
- Allows deposits
- Allows withdrawals with sufficient balance checks
- Displays current balance
- Maintains and displays transaction history

---

## **Hints / Mini Guide**
1. **Implement Account class**:
   - Fields: `accountHolder`, `balance`, `List<String> transactionHistory`
   - Methods:
     - `deposit(double amount)` → Add money and log transaction
     - `withdraw(double amount)` → Deduct money if balance is sufficient and log transaction
     - `getBalance()` → Return current balance
     - `printTransactionHistory()` → Display stored transactions

2. **Main class**:
   - Use menu-based interaction:
     1. Deposit
     2. Withdraw
     3. Check Balance
     4. View Transaction History
     5. Exit

3. **Transaction History**:
   - Use `ArrayList<String>` to store and retrieve transaction logs.

---

## **Outcome**
- Apply **Object-Oriented Programming** concepts in Java
- Practice working with **methods, constructors, encapsulation, and lists**
- Simulate **real-world banking scenarios** in a terminal environment
