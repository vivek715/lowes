package com.org.lowes.urlshortenerapi.repository;

import com.org.lowes.urlshortenerapi.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
}
