package com.example.emailapidemo.dto;

// Using record for simplicity (requires Java 16+)
public record EmailRequestDto(
    String toEmail,
    String name,
    String verificationLink
) {} 