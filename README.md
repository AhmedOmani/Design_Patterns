# Design Patterns Tasks Repository

This repository contains a series of tasks that demonstrate the implementation of various design patterns. Each task is focused on solving real-world problems using a different design pattern, providing flexibility and scalability in the solutions.

## Table of Contents
- [StrategyDP_Task](https://github.com/AhmedOmani/Design_Patterns/tree/main/StrategyDP_Task)
- [TemplateMethodTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/TemplateMethodTask_DP)
- [MementoTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/MementoTask_DP)

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

You're developing video editing presets with functionality that people can leverage, but you need to support their availability so they can extend the functionality and choose whatever rendering option they want.

The video editing presets functionality should be able to support 3 kinds of video rendering quality: FHD, HD, and SD.

Video editing preset functionality includes (enhancing video quality, applying color correction based on user preferences, enhancing audio quality, applying some filters, and finally rendering the video based on user preferences.

---

### MementoTask_DP

You're developing a drawing diagram canvas application that should be used for drawing system designs. You should provide the functionality of undo and redo during drawing on the canvas.

The undo should be able to restore the previous state, and the redo should be able to do the reverse.

The canvas should have the following attributes regarding diagrams: content, color, and border.

Link to Code & UML Class Diagram: [MementoTask_DP](https://github.com/AhmedOmani/Design_Patterns/tree/main/MementoTask_DP)
---
