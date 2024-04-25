package com.serviceManagementSystem.serviceManagementSystem.report.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RevenueReport {

    private String serviceType;

    private Double revenue;

}
