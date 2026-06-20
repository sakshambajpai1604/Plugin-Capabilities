#  Plugin Capabilities
Objective: A class implementing Loggable and Auditable, each with a default method.
- Define both interfaces with default methods
- Implement both in a Service class
- Call both default methods and observe output
- Introduce a name clash and resolve with Iface.super.m()

Validation: Program prints both behaviors; clash compiles only after explicit override.
