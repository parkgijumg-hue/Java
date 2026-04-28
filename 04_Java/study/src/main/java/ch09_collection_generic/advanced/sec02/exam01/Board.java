package main.java.ch09_collection_generic.advanced.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}
