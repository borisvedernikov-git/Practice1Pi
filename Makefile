# Makefile for Java Project

# Set the Java compiler
JAVAC = javac
# Set the Java source files
SOURCES = $(wildcard *.java)
# Set the output class files
CLASSES = $(SOURCES:.java=.class)

# Default target to compile the program
all: $(CLASSES)

# Rule to compile Java files
%.class: %.java
    $(JAVAC) $<

# Clean up compiled class files
clean:
    rm -f *.class

# Run the program
run:
    java Main

