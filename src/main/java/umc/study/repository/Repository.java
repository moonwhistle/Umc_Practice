package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.User;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User,Long> {
}
