package com.d23alex.vtbstat.entity.gameevents;

import com.d23alex.vtbstat.entity.Game;
import com.d23alex.vtbstat.entity.Player;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="free_throw_attempts")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeThrowAttempt implements GameClockTimestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Game game;
    Long millisecondsSinceStart;
    @ManyToOne
    Player shooter;
    Boolean isSuccessful;
}