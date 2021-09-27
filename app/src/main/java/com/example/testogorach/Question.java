package com.example.testogorach;

public class Question {
    private int textQuestion;
    private int[] answer = new int[3];
    private boolean[] answerOk = new boolean[3];

    public Question(int text, int[] answer, boolean[] answerOk) {
        this.textQuestion = text;
        this.answer = answer;
        this.answerOk = answerOk;
    }

    public int getTextQuestion() {
        return textQuestion;
    }

    public int getAnswer(int i) {
        return answer[i];
    }

    public boolean getAnswerOk(int i) {
        return answerOk[i];
    }
}
