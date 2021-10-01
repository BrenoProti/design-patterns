# Design Patterns

I'm studying Design Patterns, which is basically a general repeatable solution to a common problem in software design.

I will use this repository to save the examples of Design Patterns that I learn throughout the studies.

## Learned

### Strategy 

The Strategy pattern suggests that you take a class that does something specific in several different ways and extract all of those algorithms into separate classes called strategies.

In the example I used, I basically separated Taxes into different classes, implementing a common interface.

For example ICMS and ISS (Brazilian taxes) which implements the 'Imposto' interface, this way I don't need a series of IFs to validate the tax types

#
