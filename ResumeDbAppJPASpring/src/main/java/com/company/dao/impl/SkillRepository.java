package com.company.dao.impl;

import com.company.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer>,SkillRepositoryCustom {
}
