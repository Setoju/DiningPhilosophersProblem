# 🍽 Dining Philosophers Problem - Java Solutions

This repository contains three classic solutions to the **Dining Philosophers** concurrency problem implemented in **Java**. The problem simulates a scenario where five philosophers sit at a round table with a fork between each pair. To eat, each philosopher needs two forks (left and right). The main challenge is to design a system that avoids **deadlock** and **starvation**.

---

## 🧠 Problem Statement

- Five philosophers alternate between thinking and eating.
- They need both the left and right forks to eat.
- Each fork is shared between two philosophers.
- The system must ensure:
  - No two adjacent philosophers eat at the same time.
  - No deadlock (where every philosopher holds one fork and waits forever).
  - No starvation (every philosopher eventually gets to eat).

---

## ✅ Implemented Solutions
### 1. Asymmetric Fork Picking

To avoid deadlock:
- One philosopher **reverses the order** in which they pick up forks (first left, then right).
- This breaks the circular wait condition — one of the four Coffman conditions required for deadlock.

### 2. Resource Hierarchy Solution

To avoid deadlock:
- Philosophers always pick up the lower-numbered fork first to prevent circular wait.

### 3. Arbitrator (Waiter) Solution

To avoid deadlock:
- A central waiter ensures only up to 4 philosophers can try to eat at the same time.
