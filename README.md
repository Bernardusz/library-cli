# 📚 Library CLI - ReadMe

## 🐧 Overview
> This is a lightweight Command Line Interface (CLI) built to demonstrate Java's memory management and modern data structures. It transitions concepts from C (manual management) to Java (automatic management).

## 🛠 Architecture

1. Singleton Pattern (Library.java): Ensures a single "source of truth" for the library data. It lives on the heap for the duration of the program.
2. Records (Book.java): Utilizes Java's record type for an immutable "const struct" equivalent. This ensures thread safety and data integrity.

## Garbage Collection Logic:

1. Reachability: Adding a book creates a reference from the Library instance to the Book record.
2. Cleanup: Removing a book removes that reference. Once the reference is gone, the Janitor (GC) reclaims the memory during the next cycle (Minor or Major GC).

## 🚀 How to Run
1. `javac Main.java Library.java Book.java`
2. `java Main`

## 📖 Usage
1. Add: Enter the full details of a book. Uses nextLine() to ensure spaces in titles and descriptions are captured.
2. Read: Search for a book by its exact title to see its metadata.
3. Remove: Disconnects a book from the library, marking it for Garbage Collection.
4. Exit: Gracefully shuts down the JVM.