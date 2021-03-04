package io.cloudmobility.codefocus.health;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HealthDto {

    private HealthStatus status;
}
