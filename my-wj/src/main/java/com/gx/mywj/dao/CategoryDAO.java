package com.gx.mywj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gx.mywj.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
