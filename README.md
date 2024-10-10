# Design Patterns Tasks Repository

This repository contains a series of tasks that demonstrate the implementation of various design patterns. Each task is focused on solving real-world problems using a different design pattern, providing flexibility and scalability in the solutions.

### Table of Contents

## Behavioral Design Patterns :
  - [StrategyDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/StrategyDP_Task)
  - [TemplateMethodTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/TemplateMethodTask_DP)
  - [MementoTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/MementoTask_DP)
  - [VisitorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/VisitorDP_Task)
  - [IteratorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/IteratorDP_Task)
  - [ChainResponsibilityDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/ChainResponsibilityDP_Task)
  - [StateDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/StateDP_Task)
  - [CommandDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/CommandDP_Task)
  - [MediatorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/MediatorDP_Task)

## Structural Design Patterns :
  - [AdapterDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/AdapterDP_Task)
  - [BridgeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/BridgeDP_Task)
  - [CompositeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/CompositeDP_Task)
  - [DecoratorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/DecoratorDP_Task)
  - [FacadeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FacadeDP_Task)
  - [ProxyDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/ProxyDP_Task)
  - [FlyweightDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FlyweightDP_Task)

## Creational Design Patterns : 
  - [BuilderDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/BuilderDP_Task)
  - [SingletoDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/SingletonDP_Task)
  - [PrototypeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/PrototypeDP_Task)
  - [FactoryDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FactoryDP_Task)
---

### StrategyDP_Task

**Description:**  
You're developing a notification service that supports multiple types of notifications to users, such as SMS, Email, Messenger, and Slack notifications. The key challenge is to implement this with flexibility, allowing the service to send notifications through any type without altering the core logic.  

For simplicity, the main function that should be used is:

```java
sendNotification(User user, String message)
```

Link to Code & UML Class Diagram: [StrategyDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/StrategyDP_Task)
---

---

### TemplateMethodTask_DP

**Description:**  
You're developing video editing presets with functionality that people can leverage, but you need to support their availability so they can extend the functionality and choose whatever rendering option they want.

The video editing presets functionality should be able to support 3 kinds of video rendering quality: FHD, HD, and SD.

Video editing preset functionality includes (enhancing video quality, applying color correction based on user preferences, enhancing audio quality, applying some filters, and finally rendering the video based on user preferences.

Link to Code & UML Class Diagram: [TemplateMethodTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/TemplateMethodTask_DP)
---
---

### MementoTask_DP

**Description:**  
You're developing a drawing diagram canvas application that should be used for drawing system designs. You should provide the functionality of undo and redo during drawing on the canvas.

The undo should be able to restore the previous state, and the redo should be able to do the reverse.

The canvas should have the following attributes regarding diagrams: content, color, and border.

Link to Code & UML Class Diagram: [MementoTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/MementoTask_DP)
---
---

### VisitorDP_Task

**Description:** 

Suppose we have a document processing system where we need to perform different operations like counting words, extracting text, and analyzing formatting. Each operation needs to be applied to different types of documents, e.g (text files, spread sheets and presentation files)

Consider adding those three operations counting words, extracting text, and formatting—without touching the codebase.

We have three document types (text files, spread sheets, and presentation files) that should support the new functionalities

Link to Code & UML Class Diagram: [VisitorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/VisitorDP_Task)
--

---

### IteratorDP_Task 

**Description:** 

You're developing a social media application where you need to support the functionality of iterating through people's profiles, e.g., friends, family, and mutual friends.

This functionality needs to be re-used within the company team so they can iterate through different profile iterators to help them get more insights and dashboards across people's profiles.

Link to Code & UML Class Diagram: [IteratorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/IteratorDP_Task)
--

---

### ChainResponsibilityDP_Task 

**Description:** 

You are developing a big data batch job that takes some sort of data as input, and there is a pipeline of operations that need to occur on this data.

The data needs to pass the whole pipeline successfully in order to proceed with handling the data.

The pipeline consists of validation checks on data, formatting checks, data size checks, and finally personal information checks.

The batch job needs to fulfill the whole pipeline of checks and pass them successfully before proceeding with processing the data.

Link to Code & UML Class Diagram: [ChainResponsibilityDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/ChainResponsibilityDP_Task)
--

---

### StateDP_Task 

**Description:**

You are developing a project management application in which you can create various tasks, and each task would have a different state. By default, tasks would be on the backlog until they were picked up by users and marked as ToDo.

Tasks would have different states, e.g., backlog, to-do, in-progress, blocked, in-review, done.

Backlog means a task is not picked by anybody.

To-Do means: The task has already been picked by someone.

In-progress means a task is already being progressed by someone.

Blocked means: The task is already paused due to some reasons.

In-review means the task is already being reviewed by someone else.

Done means the Task is already finished successfully

Considering once a task is marked as done, you cannot change its state further. Also, no tasks are marked as done unless they are reviewed.

Link to Code & UML Class Diagram: [StateDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/StateDP_Task)
--

---

### CommandDP_Task 

**Description:** 

You are developing a text editor which has the following functionality: Copy, cut, and delete. Each of these functions needs to be supported in many ways: e.g., Edit Menu, Keyboard Shortcuts).

Those commands also need to be saved in history so we can easily undo and redo them.

Considering having the following keyboard shortcuts for each one: (copy -> ctrl + c) , (cut -> ctrl + x) and (delete -> DEL)

**Note:**
For the point of undo & redo I implement MementoDP for this subtask m but it i didnt consider it in the UML diagram.

Link to Code & UML Class Diagram: [CommandDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/CommandDP_Task)
--

---

### MediatorDP_Task 

**Description:** 

You are developing a coordination system that allows multiple airplanes to communicate and coordinate their movements through a control tower, which helps them avoid collisions and ensure safe takeoffs and landings.

We would have two types of airplanes: commercial and travel airplanes, which support the following functionality, e.g request take off, request landing and a method to notify air traffic control.

Link to Code & UML Class Diagram: [MediatorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/MediatorDP_Task)
--

---

### AdapterDP_Task 

**Description:** 

Let's consider a scenario where we have an integration with a third-party service, ReportService, to receive a report that is in CSV format, and we are using it in our client, but we aim to now add a dashboard service that needs data in JSON.

So the main client is your client, and you need to talk to the reporting service in order to get the report and pass it to the dashboard service, but the reporting service gives you uncompatible data with the dashboard.

Link to Code & UML Class Diagram: [AdapterDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/AdapterDP_Task)
--

---

### BridgeDP_Task 

**Description:** 

Imagine you are developing a flight booking platform that aggregates flights from various providers, e.g., Turkish Airlines and EgyptAir, and each provider may have its own loyalty program. Additionally, users might have different membership statuses within these loyalty programs.

We have two kinds of loyalty programs (Premium and Basic), which give different discounts on booking flights.

Link to Code & UML Class Diagram: [BridgeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/BridgeDP_Task)
--

---

### CompositeDP_Task 

**Description:** 

In an e-commerce application, customers can add individual items to their shopping carts. However, there are also special offers or bundles, where multiple items are combined into a discounted package. How can we represent both individual items and bundled offers in a way that allows seamless interaction with the shopping cart?

So we have products and bundles, and each bundle might have several products.

Link to Code & UML Class Diagram: [CompositeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/CompositeDP_Task)
--

---

### DecoratorDP_Task 

**Description:** 

You're developing a text processing system that allows users to format text with various styles like bold, italic, and underline. Users should be able to apply multiple (composite) styles to the same text.

Link to Code & UML Class Diagram: [DecoratorDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/DecoratorDP_Task)
--

---

### FacadeDP_Task 

**Description:** 

You're developing an e-commerce platform where customers can place orders for various products. 

The order processing system involves multiple subsystems such as inventory management, payment processing, and shipping logistics. Managing interactions with these subsystems directly from the client code can become complex and error-prone.

Link to Code & UML Class Diagram: [FacadeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FacadeDP_Task)
--

---

### ProxyDP_Task 

**Description:**

Certainly! Let's consider a scenario where we have a media streaming service that provides access to videos. 
The problem we'll address is controlling access to sensitive or restricted videos based on user permissions.

Link to Code & UML Class Diagram: [ProxyDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/ProxyDP_Task)
--

---

### FlyweightDP_Task 

**Description:**

In a word processor application, users can create documents containing various text elements such as characters, words, and paragraphs. 

Each text element may have attributes like font, size, color, and style. With large documents or documents containing repetitive text, memory consumption can become a concern if each text element is represented as a separate object.

A word processor should be able to render text elements that it gets as input with its style from font and color!

Link to Code & UML Class Diagram: [FlyweightDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FlyweightDP_Task)
--

---

### BuilderDP_Task 

**Description:**

Certainly! Let's consider a scenario where you're working on a configuration manager for a game engine. The game can have various settings, including graphics quality, sound options, control preferences, and more.

You need to create a configuration manager that allows users to set and customize various game settings.

Link to Code & UML Class Diagram: [BuilderDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/BuilderDP_Task)
--

---

### SingletonDP_Task 

**Description:**

Certainly! Let's consider a scenario where you want to implement a session manager for a web application using the Singleton design pattern. The session manager should provide a single point of access to user sessions, and it should be initialized with default options.

You want to create a session manager with default settings, and you want to ensure that there is only one instance of the session manager throughout the web application.

Link to Code & UML Class Diagram: [SingletoDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/SingletonDP_Task)
--

---

### PrototypeDP_Task 

**Description:**

You are developing a GUI button component that is asked to be re-used within the application because it wastes time re-creating it every time and just to change little fields.

The button has several fields, like color, content, xPosition, and yPosition.

Link to Code & UML Class Diagram: [PrototypeDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/PrototypeDP_Task )
--

---

### FactoryDP_Task 

**Description:**

You are developing a web application that supports user authentication through various methods, such as username/password, social media logins, and two-factor authentication. Initially, we need to have a centralized place for creating those authentications, considering that social media logins might have in the future various kinds of social media and two-factor authentication as well.

Link to Code & UML Class Diagram: [FactoryDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/FactoryDP_Task )
--


