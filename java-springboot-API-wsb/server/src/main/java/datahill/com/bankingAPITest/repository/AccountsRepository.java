package datahill.com.bankingAPITest.repository;

import datahill.com.bankingAPITest.entities.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends MongoRepository<Account, String> {

    Optional<Account> findAccountByAccountNumber(Integer accountNumber);

    boolean existsByAccountNumber(Integer accountNumber);
}
