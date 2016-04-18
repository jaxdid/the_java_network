# The Java Network
###### A Makers Academy tech test

## Description
A Java codebase for building a social network that allows for users to be created, publish messages, subscribe to other users and see an aggregated feed of their subscribees' messages.

## Design
Design modeled after [Sandro Mancuso's solution](https://youtu.be/XHnuMjah6ps) to the Bank Kata (Java).

## To-Dos
- Build an application interface.
- Add support for a `Message` class, to handle combining message text with owners and timestamps.
- Extract presentation responsibilities out of `TimelinePrinter` and `SubscriptionsAggregator` classes.
- Revisit certain design decisions:
  - Public getter methods (e.g., User#getName, User#getMessages)
  - User class constructor dependency injection

## Features
**User creating:** a new user called `Spike` can be created   
**Posting:** `Spike` can publish messages to a personal timeline   
**Reading:** `Spike` can view `Nikesh`’s timeline   
:construction: **Following:** `Leo` can subscribe to `Spike` and `Nikesh`'s timelines, and view an aggregated list of all subscriptions
