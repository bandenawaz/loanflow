package com.revature.loanflow.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanApplication {

    @NotBlank(message = "Customer name is required")
    private String customerName;

    @NotBlank(message = "Mobile Number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian mobile number")
    private String mobileNumber;

    @Min(value = 300, message = "Credit Score minimum 300")
    @Max(value = 900, message = "Credit score maximum 900")
    private int creditScore;

    @Positive(message = "Monthly income must be positive")
    private double monthlyIncome;

    @Positive(message = "Loan amount must be positive")
    private double loanAmount;

    @Min(value = 6, message = "Minimum tenure is 6 months")
    @Max(value = 60, message = "Maximum tenure is 60 months")
    private int tenureInMonths;

    private LoanStatus loanStatus;

    public LoanApplication(String raviKumar, String number, int i, double v, double v1, int i1) {
    }
}
