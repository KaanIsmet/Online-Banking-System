package com.KaanOkul.OnlineBankingSystem.repository;

import com.KaanOkul.OnlineBankingSystem.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
