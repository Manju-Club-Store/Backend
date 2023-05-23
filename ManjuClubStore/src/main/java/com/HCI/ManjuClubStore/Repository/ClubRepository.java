package com.HCI.ManjuClubStore.Repository;
import com.HCI.ManjuClubStore.Domain.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
