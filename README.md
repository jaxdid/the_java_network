# The Java Network
###### A Makers Academy tech test

## Description
A Java codebase for building a social network that allows for users to be created, publish messages, subscribe to other users and see an aggregated feed of their subscribees' messages.

## Design
Design modeled after [Sandro Mancuso's solution](https://youtu.be/XHnuMjah6ps) to the Bank Kata (Java).

## Experience and Challenges
- This tech test forced me to get over my inexplicable xenoglossophobia towards Java!
- Learning JUnit, Mockito and Powermock was intense; finally implementing their features was extremely gratifying.
- Can see more of the power of the Java language.

## To-Dos
- Build an application interface.
- Add timestamp support to `Message` instances.
- Extract presentation responsibilities out of `TimelinePrinter` and `SubscriptionsAggregator` classes.
- Revisit certain design decisions:
  - Class interfaces and encapsulation (e.g., public `User#getMessages` getter method)
  - `User` class constructor dependency injection

## Features
**User creating:** a new user called `Spike` can be created   
**Posting:** `Spike` can publish messages to a personal timeline   
**Reading:** `Spike` can view `Nikesh`’s timeline   
:construction: **Following:** `Leo` can subscribe to `Spike` and `Nikesh`'s timelines, and view an aggregated list of all subscriptions
