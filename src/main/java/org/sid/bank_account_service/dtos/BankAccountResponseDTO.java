package org.sid.bank_account_service.dtos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank_account_service.enums.AccountType;

import java.util.Date;
@Data @NoArgsConstructor
@AllArgsConstructor @Builder
public class BankAccountResponseDTO {
    private String id;
    private Date createAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
