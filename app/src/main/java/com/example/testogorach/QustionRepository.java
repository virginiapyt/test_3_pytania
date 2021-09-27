package com.example.testogorach;

public class QustionRepository {
    public Question[] allQuestion = new Question[]{
            new Question(
                    R.string.q1,
                    new int[]{ R.string.a1_a,R.string.a1_b,R.string.a1_c},
                    new boolean[]{false,true,true}),
            new Question(
                    R.string.q2,
                    new int[]{ R.string.a2_a,R.string.a2_b,R.string.a2_c},
                    new boolean[]{false,true,true}),
            new Question(
                    R.string.q3,
                    new int[]{ R.string.a3_a,R.string.a3_b,R.string.a3_c},
                    new boolean[]{true,true,true})

    };

}
