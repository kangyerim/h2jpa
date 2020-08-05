package com.htwojpa.web.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


interface MemberRepository extends JpaRepository<Member, Long>, IMemberRepository {

}