# 💼 Employee Payroll System (Java OOP-Based)

This is a simple **console-based Employee Payroll System** built using core **Object-Oriented Programming (OOP)** concepts in Java. The system manages full-time and part-time employees, calculates salaries, and allows adding/removing employees.

---

## 🧠 OOP Concepts Demonstrated

| Concept            |                                             Description                                                |
|--------------------|--------------------------------------------------------------------------------------------------------|
| **Abstraction**    | `employee` is an abstract class representing a general employee.                                       |
| **Encapsulation**  | Fields like `name`, `id`, and salary details are private and accessed through public methods.          |
| **Inheritance**    | `fulltimeEmployee` and `partTimeEmployee` inherit from the `employee` base class.                      |
| **Polymorphism**   | The `calsalary()` method is overridden to calculate salaries differently for different employee types. |

---

## 🗂️ Class Overview

- **`employee` (abstract class):** Base class for all employees with `name`, `id`, and abstract method `calsalary()`.
- **`fulltimeEmployee`:** Subclass with monthly salary logic.
- **`partTimeEmployee`:** Subclass that calculates salary based on hours worked and rate.
- **`payrollsystem`:** Manages employee list (add, remove, display).
- **`EmployeePayrollSystem` (Main class):** Demonstrates the system in action.

---

## ✅ Features

- Add full-time and part-time employees  
- Display employee details with salary  
- Remove an employee by ID  
- Polymorphic salary calculation

---
