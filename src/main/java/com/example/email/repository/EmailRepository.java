package com.example.email.repository;

import com.example.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository <EmailModel, Long> {
}
