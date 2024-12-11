package com.zola.repository;

import com.zola.dto.ProductSearchResultDTO;
import com.zola.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query("SELECT new com.zola.dto.ProductSearchResultDTO( " +
            "p.productName, p.productid, m.metroAreaTitle, pr.fullName, pr.projectgroupid) " +
            "FROM Product p " +
            "JOIN p.project pr " +
            "JOIN pr.metro m " +
            "WHERE LOWER(p.productName) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(pr.fullName) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(m.metroAreaTitle) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "ORDER BY p.productName ASC")
    List<ProductSearchResultDTO> searchProducts(@Param("keyword") String keyword);

}