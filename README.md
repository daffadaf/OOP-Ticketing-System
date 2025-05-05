# 🎟️ Festival Ticketing System

Welcome to the **Festival Ticketing System** — a streamlined, efficient, and easy-to-use solution tailored for managing high-volume transactions at music festivals and live events. This Java-based application ensures smooth operation from merchandise sales to ticketing, all within a clean, console-based interface.

## 🚀 Why This System?

During fast-paced events like music festivals, every second counts. Manual transactions are slow and error-prone. This system replaces manual processes with a structured, validated approach — designed to reduce mistakes, speed up transactions, and keep customers satisfied.

## 🔧 Core Features

### 🛍️ 1. Item Registration
Easily register and manage items available for sale at the event.
- Attributes include:
  - Name
  - Price
  - Quantity
  - Category: `Ticket`, `Merchandise`, or `Recording`
- Stored efficiently using an `ArrayList<Item>`.

### 📦 2. View Inventory
Instantly view all available items in the system with clear details:
- Item Name
- Price
- Stock Quantity
- Category

### 👤 3. Customer Registration
Collect and manage essential customer information before any transaction:
- Full Name
- Email Address
- Phone Number

### 🛒 4. Place an Order
Facilitate accurate and validated ordering:
- Customers select available items and quantities
- System checks for valid customers and items
- Calculates total cost and stores the order

### 📄 5. View All Orders
Gain full visibility over all past transactions:
- See what’s been sold, to whom, and for how much
- Helps with record-keeping and inventory planning

### 🚫 6. Input Validation & Custom Exceptions
No more invalid inputs:
- **Email** must include `@`
- **Phone Number** must:
  - Be exactly **12 digits**
  - Start with **"08"**
- Invalid entries trigger meaningful custom exceptions to guide users

## 💻 Tech Stack

- Language: **Java**
- Interface: **Console-Based (CLI)**
- Data Management: `ArrayList`
- No external libraries — built from the ground up for learning and efficiency.

---

## 🎉 Final Note

Whether you're managing a local music gig or a multi-day festival, this ticketing system offers a lightweight yet powerful solution to handle the chaos with confidence. Built for clarity, speed, and error reduction — it's a solid foundation for any event tech system.

---

📁 Ready to explore? Clone the repo, compile, and let the transactions begin!
