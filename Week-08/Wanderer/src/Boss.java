public class Boss extends Monsters {

    public Boss() {
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }

    public Boss(Map map) {
        super(map);
    }

    @Override
    public void checkIfNotWall(Map map ) {
        super.checkIfNotWall(map);
        this.characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
    }

    @Override
    public void move(Map map) {

        int trialX;
        int trialY;
        int number = (int) ((Math.random())*4);

        if (number == 0){
            trialX= monsterX+ 72;
            trialY = monsterY;
            if (checkIfCanMove(map, trialX, trialY)){
                monsterX = trialX;
                characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
            }
            else{move(map);}
        }
        else if (number == 1){
            trialX= monsterX- 72;
            trialY = monsterY;
            if (checkIfCanMove(map, trialX, trialY)){
                monsterX = trialX;
                characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
            }
            else{move(map);}
        }
        else if (number == 2){
            trialX= monsterX;
            trialY = monsterY + 72;
            if (checkIfCanMove(map, trialX, trialY)){
                monsterY = trialY;
                characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
            }
            else{move(map);}
        }
        else if (number == 3){
            trialX= monsterX;
            trialY = monsterY - 72;
            if (checkIfCanMove(map, trialX, trialY)){
                monsterY = trialY;
                characterMove = new PositionedImage("./wanderer-java/img/boss.png", monsterX, monsterY);
            }
            else{move(map);}
        }


    }
}

