package com.zs.dao;

import com.zs.controller.Post;
import com.zs.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author zhouson
 * @create 2019-07-11 13:38
 */
@Repository
public interface PageDao extends JpaRepository<Page,Long>, JpaSpecificationExecutor<Page> {

}
