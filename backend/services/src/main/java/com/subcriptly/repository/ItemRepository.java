package com.subcriptly.repository;

import com.subcriptly.models.Item;
import com.subcriptly.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
