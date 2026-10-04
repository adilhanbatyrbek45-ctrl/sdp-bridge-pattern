# SDP Assignment #3 — Bridge Design Pattern

## Topic
Subscription Processing System (Monthly/Yearly plans) integrated with various Kazakhstani banks (Kaspi, Halyk, Freedom).

## Clean Code Principles Justification
1. **Clear Separation of Concerns:** Subscription plan logic (Abstraction side) is completely decoupled from low-level bank processing details (Implementor side).
2. **Single Responsibility Principle (SRP):** `MonthPlan` and `YearPlan` classes are solely responsible for calculating subscription pricing and status, while concrete bank classes only handle payment execution.
3. **Open/Closed Principle (OCP):** New banks (e.g., `JusanBank`) or new subscription types (e.g., `WeeklyPlan`) can be added independently without modifying existing classes.
4. **Meaningful Naming:** Class and method names explicitly reflect their domain roles and Bridge pattern participants without unnecessary jargon.
5. **No Duplication (DRY):** Common logic for storing the bank reference and managing subscription pricing is centralized in the abstract `Subscription` base class.