package com.example.InterFace.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InterFace.Web.Entity.RoomType;


@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {

}
