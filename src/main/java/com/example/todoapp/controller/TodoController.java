package com.example.todoapp.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/todos")
    public String showTodos(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        model.addAttribute("todos", List.of("Buy milk", "Study Spring", "Write code"));
        return "todos";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }
}

