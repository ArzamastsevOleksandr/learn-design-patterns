**Design Principle**: Identify the aspects of your application that vary and separate them from what stays the same.

**Design Principle**: Program to an interface, not an
implementation.

**Design Principle**: Favor composition over inheritance.

The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.
========================================================================================================================
The **Observer Pattern** defines a one-to-many dependency
between objects so that when one object changes state,
all of its dependents are notified and updated automatically.

When two objects are loosely coupled, they can interact,
but they typically have very little knowledge
of each other. Loosely coupled designs allow us to build flexible OO
systems that can handle change because they minimize
the interdependency between objects.

Design Principle: Strive for loosely coupled designs between
objects that interact.
========================================================================================================================
Design Principle: Classes should be open
for extension, but closed for
modification.

Our goal is to allow classes to be easily extended to
incorporate new behavior without modifying existing code.
What do we get if we accomplish this? Designs that are
resilient to change and flexible enough to take on new
functionality to meet changing requirements.

Decorators have the same supertype as the objects they decorate.
You can use one or more decorators to wrap an object.
Given that the decorator has the same supertype as the object it decorates, we can
pass around a decorated object in place of the original (wrapped) object.
The decorator adds its own behavior before and/or after delegating to the object it
decorates to do the rest of the job.
Objects can be decorated at any time, so we can decorate objects dynamically at
runtime with as many decorators as we like.

The **Decorator Pattern** attaches additional
responsibilities to an object dynamically.
Decorators provide a flexible alternative to
subclassing for extending functionality.

A **Factory Method** handles object creation and encapsulates it in a
subclass. This decouples the client code in the superclass from the
object creation code in the subclass.

The **Factory Method Pattern** defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer
instantiation to subclasses.

Design Principle: Depend upon abstractions. Do
not depend upon concrete classes. (Dependency Inversion Principle).
high-level components should not depend on low-level
components; rather, they should both depend on abstractions.

An Abstract Factory provides an interface for
a family of products.

The **Abstract Factory Pattern** provides an interface
for creating families of related or dependent objects
without specifying their concrete classes.