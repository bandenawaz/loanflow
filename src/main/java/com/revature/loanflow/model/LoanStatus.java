package com.revature.loanflow.model;

public enum LoanStatus {
    PENDING,  // Application submitted, not yet evaluated
    APPROVED, // All eligibility rules passed
    REJECTED, // One or more rules fails
    CANCELLED, // Customer withdraws the application
}
